package com.weixinpay.common;

public class Configure {
	//商户api密钥
	private static String key = "你的商户的api秘钥";
	//商户号
	private static String mch_id = "2088121772307194";

	//小程序ID
	private static String appID = "wx2d88824e64aacf4d";
	//小程序secret
	private static String secret = "f1e1d8785bfbe9d36d53897b29b5851f";

	public static String getSecret() {
		return secret;
	}

	public static void setSecret(String secret) {
		Configure.secret = secret;
	}

	public static String getKey() {
		return key;
	}

	public static void setKey(String key) {
		Configure.key = key;
	}

	public static String getAppID() {
		return appID;
	}

	public static void setAppID(String appID) {
		Configure.appID = appID;
	}

	public static String getMch_id() {
		return mch_id;
	}

	public static void setMch_id(String mch_id) {
		Configure.mch_id = mch_id;
	}

}
