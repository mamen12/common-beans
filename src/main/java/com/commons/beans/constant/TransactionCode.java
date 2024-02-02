package com.commons.beans.constant;

public enum TransactionCode {
	
	GOJEK("A005", "Gojek Indonesia"),
	PLN("B001", "PLN");
	
	public String code;
	public String desc;
	
	
	private TransactionCode(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public static String getTransactionCodeDesc(String code) {
		for (TransactionCode t : TransactionCode.values()) {
            if (t.code.equalsIgnoreCase(code)) {
                return t.getDesc();
            }
        }
        return null;
	}
	
	
	
}
