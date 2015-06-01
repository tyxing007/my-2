package main.java.com.huateng.receive.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.java.com.huateng.util.TimeUtil;
import org.apache.log4j.Logger;
import com.caucho.hessian.client.HessianProxyFactory;
import com.huateng.bundle.PropertyBundle;
import com.huateng.remote.sign.service.TUPayRemoteService;

/**
 * @date 2014-05-19
 * @author junwords 功能：在线支付开通查询
 */
public class ReceiveMsgAutoResponServletForPayOpenQuery extends HttpServlet {

	private static final long serialVersionUID = -8272449870279418261L;

	private final Logger log = Logger
			.getLogger(ReceiveMsgAutoResponServletForPayOpenQuery.class);

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		log.debug("..........银联仿真接收请求.............");
		req.setCharacterEncoding("UTF-8");

		log.debug("..........银联仿真获取参数............");
		Map<String, String> respParam = getAllRequestParam(req);

		resp.setContentType("text/html;charset=utf-8");

		StringBuffer pageResult = new StringBuffer();
		// Map<String, String> valideData = null;

		this.setResponseParam(respParam, pageResult);

		String result = pageResult.substring(0, pageResult.length() - 1);
		log.debug("银联仿真拼裝应答报文参数：" + pageResult.toString());
		resp.getWriter().write(result);
		log.debug("银联仿真应答成功！！");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	/**
	 * 获取请求参数中所有的信息
	 * 
	 * @param request
	 * @return
	 */
	public Map<String, String> getAllRequestParam(
			final HttpServletRequest request) {
		Map<String, String> res = new HashMap<String, String>();
		Enumeration<?> temp = request.getParameterNames();
		String logString = "";
		if (null != temp) {
			while (temp.hasMoreElements()) {
				String en = (String) temp.nextElement();
				String value = request.getParameter(en);
				res.put(en, value);
				logString += en + "=" + value + ",";
			}
			log.debug("银联获取请求参数为：" + logString);
		}
		return res;
	}

	/**
	 * 填充应答报文所需要的参数
	 * 
	 * @param respParam
	 *            请求报文中的参数
	 * @param pageResult
	 *            拼装的HTML格式应答报文
	 * @param valideData
	 *            要验签的数据
	 * @param encoding
	 *            编码格式
	 * @throws UnsupportedEncodingException
	 *             编码格式异常
	 * @throws MalformedURLException
	 */
	private void setResponseParam(Map<String, String> respParam,
			StringBuffer pageResult) throws UnsupportedEncodingException,
			MalformedURLException {

		log.debug(".........银联仿真开始拼裝报文参数.........");
		String url = PropertyBundle.getConfig("TUpaySecurityURL");
		// 从请求报文中获取参数的键
		String keys = "version,encoding,certId,signature,txnType,txnSubType,bizType,accessType"
				+ ",merId,accNo,customerInfo,reqReserved,reserved";
		// 从请求报文获取应答报文中所需参数的Map
		Map<String, String> responseMap = new HashMap<String, String>();
		// 从请求报文中获取参数值
		if (null != respParam && !respParam.isEmpty()) {

			String[] numStrings = keys.split("\\,");

			for (int i = 0; i < numStrings.length; i++) {

				String value = respParam.get(numStrings[i]);
				if ("null".equals(value) || null == value) {
					value = "";
				}
				responseMap.put(numStrings[i], value);

			}
		}
		TimeUtil tUtil = new TimeUtil();
		String [] resultSet = PropertyBundle.getConfig("resultSet").split("\\,");
		// 响应码
		responseMap.put("respCode", PropertyBundle.getConfig("responseCode"));
		// 响应信息
		responseMap.put("respMsg", PropertyBundle.getConfig("responseMsg"));
		// 开通状态
		responseMap.put("activateStatus", PropertyBundle.getConfig("activateStatus"));
		// 支付卡类型
		responseMap.put("payCardType", resultSet[1]);
		// 验证标识
		responseMap.put("checkFlag", "010101");
		// 小额临时支付信息域
		responseMap.put("temporaryPayInfo", "");
		
		// 验签开关
		if (PropertyBundle.getConfig("checkSignFlag").equals("open")) {
			log.debug("验签服务器地址：" + url);
			HessianProxyFactory hessianFactory = new HessianProxyFactory();
			TUPayRemoteService tUPayRemoteService = (TUPayRemoteService) hessianFactory
					.create(TUPayRemoteService.class, url);
			boolean flag = tUPayRemoteService.verify(respParam.get("certId"),
					respParam);

			if (flag == false) {
				// 响应码
				responseMap.put("respCode", "11");
				// 响应信息
				responseMap.put("respMsg", "验证签名失败");
			}
		}
		// 签名开关
		if (PropertyBundle.getConfig("signFlag").equals("open")) {
			HessianProxyFactory hessianFactory = new HessianProxyFactory();
			TUPayRemoteService remoteService = (TUPayRemoteService) hessianFactory
					.create(TUPayRemoteService.class, url);
			log.debug("签名报文：" + responseMap);
			responseMap = remoteService.sign(respParam.get("certId"),
					responseMap);
			log.debug("..........签名后发送给支付前置的消息为：" + responseMap);

		}
		Iterator<Entry<String, String>> it = responseMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, String> e = it.next();
			String key = (String) e.getKey();
			String value = (String) e.getValue();
			pageResult.append(key + "=" + value + "&");
			// valideData.put(key, value);
		}

	}

}
