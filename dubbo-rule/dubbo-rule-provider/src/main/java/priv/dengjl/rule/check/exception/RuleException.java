package priv.dengjl.rule.check.exception;

/**
 * 
 * Created by it
 * Created in 2019年3月23日
 * Description: 校验异常定义
 */
public class RuleException extends RuntimeException {

	private static final long serialVersionUID = -6984137728180794605L;

	private String code; // 异常对应的返回码
	private String message; // 异常对应的描述信息
	
	/**
	 * 任意抛出异常
	 * 
	 * @param code
	 * @param message
	 */
	public RuleException(String code, String message) {
		this.code = code;
		this.message = message;
	}

	/**
	 * 已经定义好常量
	 */
	public RuleException(RuleConstantEnum ruleConstantEnum) {
		this.code = ruleConstantEnum.code();
		this.message = ruleConstantEnum.message();
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

	@Override
	public String toString() {
		return "RuleException [code=" + code + ", message=" + message + "]";
	}
	
}
