package org.dubbo.rule.api;

public class RuleResult implements java.io.Serializable {
	
	private static final long serialVersionUID = -7586659024857212629L;
	
	private String code = "0000";
	private String message = "成功";

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
