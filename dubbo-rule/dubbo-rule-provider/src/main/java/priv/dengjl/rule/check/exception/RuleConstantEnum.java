package priv.dengjl.rule.check.exception;

public enum RuleConstantEnum {

	EXCEPTION_COMMON("未定义异常"),
	
	EXCEPTION_ORDER_001("订单已经存在");
	
	private String message;

	private RuleConstantEnum(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "RuleConstantEnum [code=" + name() + ", message=" + message + "]";
	}

	public String code() {
		return this.name();
	}
	
	public String message() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
