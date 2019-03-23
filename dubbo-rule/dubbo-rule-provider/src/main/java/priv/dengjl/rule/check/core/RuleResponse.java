package priv.dengjl.rule.check.core;

import priv.dengjl.rule.check.exception.RuleConstantEnum;

/**
 * 
 * Created by it
 * Created in 2019年3月23日
 * Description: 定义异常校验后结果
 */
public class RuleResponse {
	
	/**
	 * 定义第一组异常返回, 默认使用第一组
	 */
	private boolean isError = false;
	private RuleConstantEnum ruleConstantEnum;
	
	/**
	 * 定义第二组异常返回
	 */
	private String code; // 异常对应的返回码
	private String message; // 异常对应的描述信息

	public boolean isError() {
		return isError;
	}

	public void setError(boolean isError) {
		this.isError = isError;
	}

	public RuleConstantEnum getRuleConstantEnum() {
		return ruleConstantEnum;
	}

	public void setRuleConstantEnum(RuleConstantEnum ruleConstantEnum) {
		this.ruleConstantEnum = ruleConstantEnum;
	}

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
