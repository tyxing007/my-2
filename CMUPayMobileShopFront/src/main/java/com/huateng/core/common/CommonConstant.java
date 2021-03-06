/**
 * 
 */
package com.huateng.core.common;

/**
 * 公用常量类
 * 
 * @author cmt
 * 
 */

public class CommonConstant {

	/**
	 * 是否有效
	 * 
	 * @author cmt
	 * 
	 */
	// 特殊符号常量
	public enum SpeSymbol {
		SPACE(" ", "空格符"), BLANK("", "空"), ONE("1", "1"), TWO("2", "2"), THREE(
				"3", "3"), FOUR("4", "4"), NUM_SIX("6", "6"), EQUAL("=",
				"String等号"), SEP("./", "String分隔符'./'"), Y("Y", "Y"), IN("in",
				"in"), EQUAL_MARK("=", "等号"), COMMA_MARK(",", "逗号"), CNEQUAL_MARK(
				"CN=", "CN="), LISTSEPARATOR("|", "管道符"), NEXTROW("\n", "回车符"), LINE_MARK(
				"-", "横杠"), WELL_MARK("#", "井号"), UN_CHECK_CODE("XYZA", "特殊验证码"), CONTENT_TYPE(
				"Content-type", "Head参数 CONTENT类型"), APP_XML_TYPE(
				"application/xml;charset=utf-8", "Head参数 APP_XML类型"), NAMESPACE(
				"http://www.w3.org/2000/09/xmldsig#", "Head参数 命名空间"), XML_ENCODE_UTF8(
				"UTF-8", "UTF——8"), ZERO("0", "0");

		String value;
		String desc;

		SpeSymbol(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}
	}

	public enum IsActive {
		True("00", "有效"), False("01", "无效");

		String value;
		String desc;

		IsActive(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

		public static String getDescByValue(String value) {
			if (True.toString().equals(value)) {
				return True.desc;
			} else {
				return False.desc;
			}
		}
	}

	/**
	 * 是否历史
	 * 
	 * @authorcmt
	 * 
	 */
	public enum IsHistory {
		Normal("00", "正常"), History("01", "历史记录");

		String value;
		String desc;

		IsHistory(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}
	}

	/**
	 * 是否冻结
	 * 
	 * @author cmt
	 * 
	 */
	public enum IsFrozen {
		True("01", "冻结"), False("00", "正常");

		String value;
		String desc;

		IsFrozen(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}
	}

	/**
	 * 成功标志
	 * 
	 * @author cmt
	 * 
	 */
	public enum SuccessFlag {
		Success("00", "成功"), Error("01", "失败");

		String value;
		String desc;

		SuccessFlag(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

		public static String getDescByValue(String value) {

			if (Success.value.equals(value))
				return Success.desc;
			else
				return Error.desc;
		}
	}

	/**
	 * 是，否
	 * 
	 * @author cmt
	 * 
	 */
	public enum YesOrNo {
		Yes("1", "是"), No("0", "否");

		String value;
		String desc;

		YesOrNo(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

		public static String getDescByValue(String value) {
			if (Yes.value.equals(value)) {
				return Yes.desc;
			} else {
				return No.desc;
			}
		}
	}

	/**
	 * 是否默认
	 * 
	 * @author cmt
	 * 
	 */
	public enum IsDefault {
		True("00", "默认"), False("01", "普通");

		String value;
		String desc;

		IsDefault(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

		public static String getDescByValue(String value) {
			if (True.toString().equals(value)) {
				return True.desc;
			} else {
				return False.desc;
			}
		}
	}

	/**
	 * 银行端系统机构编码
	 * 
	 * @author cmt
	 * 
	 */
	public enum BankOrgCode {
		CMCC("0001", "中国移动系统"), CMB("0002", "招商银行"), CCB("0004", "建设银行"), SPDB(
				"0005", "浦发银行"), BOC("0006", "中国银行"), ICBC("0007", "工商银行"), BCOM(
				"0008", "交通银行");

		String value;
		String desc;

		BankOrgCode(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}

	/**
	 * 中国移动用户类型表
	 * 
	 * @author cmt
	 * 
	 */
	public enum UpayFeeType {
		PreFee("1", "预付费"), AfterFee("0", "后付费");

		String value;
		String desc;

		UpayFeeType(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}

	/**
	 * 证件类型编码
	 * 
	 * @author cmt
	 * 
	 */
	public enum UserCertType {
		IdCrad("00", "居民身份证"), VipCard("01", "临时居民身份证"), Booklet("02", "户口簿"), ArmyCard(
				"03", "军人身份证件"), PoliceCard("04", "武装警察身份证件"),
				HKAndMacaoCard("05","港澳居民往来内地通行证"), TaiWanToMainLandCard("06","台湾居民来往大陆通行证"),
				PassPort("07","护照"),OtherCard("99","其他证件");

		String value;
		String desc;

		UserCertType(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}

	/**
	 * 渠道编码
	 * 
	 * @author cmt
	 * 
	 */
	public enum CnlType {
		CmccOwn("00", "中国移动系统自主发起"), CmccHall("01", "移动营业厅"), CmccWeb("02",
				"移动网上营业厅"), CmccHotLine("03", "移动热线"), CmccSmsHall("04", "移动短信营业厅"),
				CmccSelfTerminals("05","移动自助终端"),BankSystem(
				"50", "银行系统自主发起"), BankEleChannel("51", "银行电子渠道"), BankHall(
				"52", "银行营业厅柜面"), BankAtm("53", "银行ATM机"), BankPhoneBanking("54", "银行电话银行")
				, BankMessageBanking("55", "银行短信银行");

		String value;
		String desc;

		CnlType(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}
	}

	/**
	 * 用户标识类型定义
	 * 
	 * @author cmt
	 * 
	 */
	public enum UserSignType {

		Phone("01", "手机号码"), Fetion("02", "飞信号"), WB("03", "宽带用户号"), Email(
				"04", "Email"),

		;
		String value;
		String desc;

		UserSignType(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}
	}

	/**
	 * 银行卡类型表
	 * 
	 * @author cmt
	 * 
	 */
	public enum BankCardType {

		DebitCard("0", "借记卡"), CreditCard("1", "信用卡"), ;
		String value;
		String desc;

		BankCardType(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}
	}

	/**
	 * 缴费方式定义
	 * 
	 * @author cmt
	 * 
	 */
	public enum PayWay {

		ManualConsume("0", "主动缴费"), AutoConsume("1", "自动缴费"), ExtConsume("2",
				"特殊情况缴费"), ;
		String value;
		String desc;

		PayWay(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}
	}

	/**
	 * 缴费金额
	 * 
	 * @author cmt
	 * 
	 */
	public enum PayAmtLimit {
		MouthAmt(500000L, "月缴费额度"), DayAmt(500000L, "日缴费额度"), MouthMaxAmt(
				500000L, "月最大缴费额度"), DayMaxAmt(500000L, "日最大缴费额度");
		Long value;
		String desc;

		PayAmtLimit(Long value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value.toString();
		}

		public Long getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}

	/**
	 * 缴费金额
	 * 
	 * @author cmt
	 * 
	 */
	public enum BindStatus {
		Bind("00", "已签约"), PreBind("01", "预签约"), UnBind("02", "未签约"), ToBind(
				"03", "待解约");

		String value;
		String desc;

		BindStatus(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value.toString();
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}

	/**
	 * 机构交易权限
	 * 
	 * @author cmt
	 * 
	 */
	public enum OrgTransAuth {
		AuthOpen("00", "已签约"), AuthClose("01", "未签约"), ;

		String value;
		String desc;

		OrgTransAuth(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value.toString();
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}

	/**
	 * 业务大类
	 * 
	 * @author cmt 00：签解约类交易 01：批量缴费交易 02：联网缴费交易（后付费） 03：联网充值交易（预付费） 04：其他
	 */
	public enum BussType {
		SignBus("00", "签解约类交易"), BatchConsumeBus("01", "批量缴费交易"), OnlineConsumeBus(
				"02", "缴费类交易"), OnlineChargeBus("03", "联网充值交易"), OtherBus(
				"04", "其他"),InvoincePrintBus("05","发票打印类交易");

		/*00：签解约类交易
		(01：批量缴费交易)
		02：缴费类交易
		(03：联网充值交易)
		04：其他
		05：发票打印类交易*/
		String value;
		String desc;

		BussType(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value.toString();
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}
	
	/**
	 * 发票打印状态
	 * 
	 * @author fan_kui
	 */
	public enum PrintStatus{
		Printed("1","已打印"),UnPrinted("0","未打印");
		
		String value;
		String desc;
		
		PrintStatus(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}
		

		@Override
		public String toString() {
			return this.value.toString();
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}
	}
	

	/**
	 * 内部全局交易码
	 * 
	 * @author cmt
	 */
	public enum TransCode {

		MasterSignSyn("11100020", "主号签约信息同步"), CrmMasterUnsign("11100030",
				"移动渠道主号码解约交易"), SubSignSyn("11100040", "副号码关联"), SubUnsign(
				"11100041", "副号码解约"), SubSignCheck("11100050", "crm副号码解约"), BindChange(
				"11100060", "移动签约信息更改"), WebSignPay("11200010", "网站签约用户缴费交易"), WebSignCharge(
				"11200011", "网站签约用户充值交易"), MsgSignPay("11200020", "短信签约用户缴费交易"), MsgSignCharge(
				"11200021", "短信签约用户充值交易"), PhoneSignPay("11200030", "电话签约用户缴费交易"), PhoneSignCharge(
				"11200031", "电话签约用户充值交易"), PreAutoSignPay("11200040", "预付费签约用户自动缴费交易"), PreSign(
				"12100010", "预签约交易"), SignResltInf("12100020", "签约结果通知交易（银行）"), BankMasterUnsign(
				"12100030", "通过银行渠道办理解约"), BankPhoneQuery("12200010",
				"银行非签约手机号码信息查询交易"), BankPhoneCharge("12200020", "银行非签约充值交易"), BankRevokeCharge(
				"12300010", "银行渠道撤单交易"), BankReverseCharge("12300020", "银行渠道冲正交易"), CrmRefundAction(
				"12400010", "移动渠道缴费退费流程冲正交易"),CrmReverseAction("11100042", "crm冲正"), BankBindQuery("12600010",
				"银行签约关系查询"), PrintInvocieQuery("13100010",
						"银行发票打印情况查询"),PrintInvocieNotice("13100020", "银行发票打印接口"), /*PrintInvocieBack(
				"13100030", "发票打印回退"),*/ ValidUserInfo("14100010", "手机号码身份信息验证"), GateSign(
				"15100020", "网关内部签约代码"), GatePay("15010012", "网关内部支付代码"), GateSignNotice(
				"15100010", "支付网关签约结果通知"), GatePayNotice("15010013",
				"支付网关支付结果通知"), SimpleGateSignNotice("15100040", "支付网关签约结果通知-建行"), SimpleGatePayNotice(
				"15010030", "支付网关支付结果通知-建行"), PayResultNotice("16100010",
				"支付结果通知(后台)"), PayNotice2Gate("15100030","支付网关支付结果通知 核心 至 网关"),
		
		
/*		        CrmMasUnsign2UpaySub("21100030",
				"移动渠道主号码解约时，统一支付发起副号码解约通知异省副号省。"),
				SubUnsign2UpayNoticeMas("21100041",
						"副号省发起副号码解约，统一支付发起副号码解约通知异省主号省。"),
				SubUnsign2UpayNoticeSub("21100042",
						"主号省发起副号码解约，统一支付发起副号码解约通知异省副号省。"),
				BankMasUnsign2UpaySub("22100030",
				"银行渠道主号码解约交易，统一支付发起副号码解约通知副号省。")*/
				
				
				;
		String value;
		String desc;

		TransCode(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value.toString();
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}

	/**
	 * 系统平台标识码
	 * 
	 * @author cmt
	 */
	public enum PlatformCd {
		CoreSys("upay", "统一支付"), CrmSys("crm", "省厅"), BankSys("bank",
				"银行"), ;

		String value;
		String desc;

		PlatformCd(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value.toString();
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}

	/**
	 * 主副号码签约标识
	 * 
	 * @author cmt
	 */
	public enum Mainflag {
		Master("0", "主号码签约"), Slave("1", "副号码签约"), ;

		String value;
		String desc;

		Mainflag(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value.toString();
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}

	/**
	 * 
	 * 
	 * @author cmt
	 */
	public enum RouteType {
		RouteProvince("00", "按省（位置）代码路由"), RoutePhone("01", "按手机号码路由");

		String value;
		String desc;

		RouteType(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value.toString();
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}

	/**
	 * 交易动作代码
	 * 
	 * @author cmt
	 * 
	 */
	public enum ActionCode {
		Requset("0", "请求"), Respone("1", "应答"), ;
		String value;
		String desc;

		ActionCode(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value.toString();
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}

	/**
	 * 交易状态代码
	 * 
	 * @author cmt
	 * 
	 */
	public enum TxnStatus {
		InitStatus("99", "初始"), TxnSuccess("00", "成功"), TxnFail("01", "失败"), 
		
		
		
		
		
		//不建议使用
		/*PayFail(
				"11", "支付失败"), PaySuccess("12", "支付成功"), ChargeFail("13",
				"充值失败"), ChargeSuccess("14", "充值成功"),*/
				
				
				
				
				
				
				//不使用;
				/* BankRevertFail("15",
				"bank冲正失败"), BankRevertSuccess("16", "bank冲正成功"), CrmRevertFail(
				"17", "crm冲正失败"), CrmRevertSuccess("18", "crm冲正成功")*/;

		String value;
		String desc;

		TxnStatus(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value.toString();
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}

	/**
	 * 交易步骤代码
	 * 
	 * @author cmt
	 * 
	 */
	public enum TxnStep {
		InitStep("99", "初始"), TxnSuccess("00", "成功"), TxnFail("01", "失败");

		String value;
		String desc;

		TxnStep(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value.toString();
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}

	/**
	 * 交易状态代码
	 * 
	 * @author cmt
	 * 
	 */

	public enum BillPayStatus {
		InStatus("01", "入库状态"), OutStatus("02", "出库缴费状态"), ConfirmStatus("00",
				"缴费确认状态"), ReverseStatus("03", "已冲正");

		String value;
		String desc;

		BillPayStatus(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value.toString();
		}

		public String getValue() {
			return this.value;
		}

		public String getDesc() {
			return this.desc;
		}

	}

	/**
	 * Bip业务编码
	 * 
	 */
	public enum Bip {
		Bis01("BIP1A151", "通过移动营业厅办理签约"), Bis02("BIP1A152", "通过网上营业厅办理签约 "), Bis03(
				"BIP1A153", "通过银行渠道办理签约"), Bis04("BIP1A154", "签约信息变更"), Bis05(
				"BIP1A155", "通过移动渠道办理主动解约"), Bis06("BIP1A156", "通过银行渠道办理解约"), Bis07(
				"BIP1A157", "自动解约"), Bis08("BIP1A158", "关联副号码"), Bis09(
				"BIP1A159", "副号码解约"), Bis10("BIP1A160", "网站签约缴费"), Bis11(
				"BIP1A161", "短信签约缴费"), Bis12("BIP1A162", "电话签约缴费 "), Bis13(
				"BIP1A163", "预付费自动缴费"), Bis14("BIP1A164", "移动非签约网银缴费"),

		Bis15("BIP1A165", "银行渠道非签约缴费"), Bis16("BIP1A166", "移动渠道缴费冲正流程"), Bis17(
				"BIP1A167", "移动渠道缴费退费流程"), Bis18("BIP1A168", "银行渠道冲正处理流程"), Bis19(
				"BIP1A169", "银行渠道申请撤单流程"), Bis20("BIP1A170", "发票打印流程"), Bis21(
				"BIP1A171", "手机号码身份信息验证流程");

		String value;
		String desc;

		Bip(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}

	/**
	 * 移动端提供的交易代码
	 * 
	 */
	public enum CrmTrans {
		Crm01("T1000152", "银行账号校验"), Crm02("T1000153", "主号签约信息同步"), // 签约信息更改
		Crm03("T1000154", "副号签约信息同步"), Crm04("T1000155", "银行预签约接口"), Crm05(
				"T1000156", "签约结果通知"), Crm06("T1000157", "签约用户缴费"), Crm07(
				"T1000158", "充值"), Crm08("T1000159", "冲正"), Crm09("T1000160",
				"交易结果查询"), Crm10("T1000161", "发票打印情况查询"), Crm11("T1000162",
				"发票打印接口"), /*Crm12("T1000163", "发票打印回退"),*/ Crm13("T1000164",
				"支付结果通知"), Crm14("T1000165", "副号签约校验"), Crm15("T1000166",
				"用户身份验证"), Crm16("T1000151", "手机号码信息查询");

		String value;
		String desc;

		CrmTrans(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}

	/**
	 * 银行端提供的交易代码
	 * 
	 */
	public enum BankTrans {

		Core01("010001", "签约预处理"), Core02("010002", "签约结果通知"), Core03("010003",
				"解约"), Core04("010004", "用户签约关系查询"), Core05("010005",
				"用户签约关系变更"), Core06("010006", "用户身份验证"), Core07("010011",
				"用户应缴费用查询"), Core08("010012", "缴费"), Core09("010013", "退费"), Core10(
				"010014", "支付结果通知"), Core11("010021", "发票打印信息查询"), Core12(
				"010022", "发票打印结果通知"), Core13("011000", "交易状态查询"), Core14(
				"011001", "交易冲正"), Bank01("020001", "银行账号是否可签约查询"), Bank02(
				"020002", "签约"), Bank03("020011", "支付"), Bank04("020012", "退费"), Bank05(
				"021000", "交易状态查询"), Bank06("021001", "交易冲正"), Bank07("020003",
				"解约");
		String value;
		String desc;

		BankTrans(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}

	/**
	 * 浙江天猫端提供的交易代码
	 * 
	 */
	public enum TmallTrans{
		Tmall01("012001", "（天猫）充值交易请求（全网方案）"), Tmall02(
				"012002", "（天猫）充值交易结果通知（全网方案）"), Tmall03("012003",
				"（天猫）充值交易状态查询（全网方案）");
		
		String value;
		String desc;
		
		TmallTrans(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}
		
		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
	
	/**
	 * 路由状态
	 * 
	 * @author Gary
	 * 
	 */
	public enum RouteStatus {
		START("00", "正常"), STOP("01", "停用");
		private String value;
		private String desc;

		private RouteStatus(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}

	/**
	 * seq注释
	 * 
	 * @author Gary
	 * 
	 */
	public enum Sequence {
		IntSeq("10", "内部交易码"), CrmSessionId("11", "crm请求端业务流水号"), CrmTransId(
				"12", "crm请求交易流水号"), BankTransID("13", "银行交易流水号"), SendBankMqSeq(
				"14", "发往银行前置mq流水号"), SendCrmMqSeq("15", "发往crm前置mq流水号"), CrmOprId(
				"16", "crm 操作接受交易流水号"), txnLogSeq("60", "交易流水表序列"), txnLogHisSeq(
				"61", "交易流水历史表序列"), billPaySeq("62", "交易成功明细表序列"), billPayHisSeq(
				"63", "交易成功明细历史表序列"), bindInfoSeq("64", "签约关系表序列"), payLimitSeq(
				"65", "缴费额度明细表序列"), Send2Gate("66","发往网关mq流水号") ,SeqId(
			    "99", "内部交易码"), OprId("999","内部操作流水号");
		private String value;
		private String desc;

		private Sequence(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}

	public enum OrgDomain {
		SPDB("SPDB", "浦发银行业务平台"), BOSS("BOSS", "boss"), UPSS("UPSS", "统一支付系统");
		private String value;
		private String desc;

		private OrgDomain(String code, String desc) {
			this.value = code;
			this.desc = desc;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String code) {
			this.value = code;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}
	}

	/**
	 * 
	 * @author zeng.j
	 * 
	 */
	public enum BindDealType {
		Bind("01", "签约"), Unbind("02", "解约"), Update("03", "变更");
		private String value;
		private String desc;

		private BindDealType(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

	}

	/**
	 * 交易记录类别
	 * 
	 * @author zeng.j
	 * 
	 */
	public enum LogTransType {
		Pay("0", "缴费"), Reverse("1", "冲正"), Refound("2", "退款"), Backing("3",
				"即时返销"), Back("4", "返销"), Bind("5", "签约"), Unbind("6", "解约");
		String value;
		String desc;

		private LogTransType(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}

	/**
	 * crm返回类型
	 * 
	 * @author zeng.j
	 * 
	 */
	public enum CrmRspType {
		Success("0", "成功"), SysErr("1", "系统以及交换错误"), BusErr("2", "业务错误");
		String value;
		String desc;

		private CrmRspType(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}

	/**
	 * 缴费方式
	 * 
	 * @author zeng.j
	 * 
	 */
	public enum PayType {
//		PayFee("01", "缴预存"), PayPre("02", "缴话费");old
		PayPre("01", "缴预存"), PayFee("02", "缴话费");
		String value;
		String desc;

		private PayType(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}

	/**
	 * 原交易类型 hdm
	 */
	public enum TransType {

		TransMs("1", "消息交易"), TransTx("2", "文件交易");
		String value;
		String desc;

		private TransType(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
	
	/**
	 * 对账标识类型 hdm
	 */
	public enum ReconciliationFlag {

		reconciliationFl("0", "未对账"), reconciliationFa("1", "银行对账完成") ,reconciliationFg("2", "省对账完成");
		String value;
		String desc;

		private ReconciliationFlag(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
	
	/**
	 * 业务渠道
	 */
	public enum BussChl {
		province("01","省厅"),bank("02","银行"),webGate("03","支付网关"),tmall("04","天猫");
		String value;
		String desc;

		private BussChl(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
	
	/**
	 * 商城充值代码
	 * */
	public enum marketCode{
		market01("012051", "充值"), 
		market02("012052", "充值/缴费查询"),
		market03("012054","充值-冲正"),
		market04("012053","支付查询"),
		market05("012055","充值-退费"),
		market06("012056","缴费-冲正"),
		market07("012057","缴费-退费"),
		market08("012058","支付-冲正"),
		market09("012059","支付-退费");
		String value;
		String desc;

		private marketCode(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
	/**
	 * 充值应答
	 * */
	public enum market{
		market_010A00("010A00", "应答成功");
		String value;
		String desc;

		private market(String value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
//	/**
//	 * @author zn 用户状态
//	 */
//	public enum UserStatus {
//		Normal("00", "正常"), OneWayDown("00", "单向停机"), Down("00", "停机"), SignCancellation(
//				"00", "预销户"), Cancellation("00", "销户"), PhoneNot("00", "此号码不存在");
//
//		String value;
//		String desc;
//
//		private UserStatus(String value, String desc) {
//			this.value = value;
//			this.desc = desc;
//		}
//
//		@Override
//		public String toString() {
//			return this.value;
//		}
//
//		public String getValue() {
//			return value;
//		}
//
//		public void setValue(String value) {
//			this.value = value;
//		}
//
//		public String getDesc() {
//			return desc;
//		}
//
//		public void setDesc(String desc) {
//			this.desc = desc;
//		}
//	}
	
}
