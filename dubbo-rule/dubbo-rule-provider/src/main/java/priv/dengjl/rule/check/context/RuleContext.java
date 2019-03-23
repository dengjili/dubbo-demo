package priv.dengjl.rule.check.context;

import org.apache.commons.chain.impl.ContextBase;

import priv.dengjl.rule.check.exception.RuleConstantEnum;

/**
 * 
 * Created by it
 * Created in 2019年3月23日
 * Description: 校验类的全局上下文
 */
public class RuleContext extends ContextBase {

	private static final long serialVersionUID = -2787016629415191859L;
	
	private Exception saveException = null;
	
	private RuleConstantEnum ruleConstantEnum = null;
	
	private boolean isError = false;

	public Exception getSaveException() {
		return saveException;
	}

	public void setSaveException(Exception saveException) {
		this.saveException = saveException;
	}

	public RuleConstantEnum getRuleConstantEnum() {
		return ruleConstantEnum;
	}

	public void setRuleConstantEnum(RuleConstantEnum ruleConstantEnum) {
		this.ruleConstantEnum = ruleConstantEnum;
	}

	public boolean isError() {
		return isError;
	}

	public void setError(boolean isError) {
		this.isError = isError;
	}

}
