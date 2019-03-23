package priv.dengjl.rule.check.core;

import priv.dengjl.rule.check.chain.RuleChain;
import priv.dengjl.rule.check.context.RuleContext;
import priv.dengjl.rule.check.exception.RuleConstantEnum;

/**
 * 
 * Created by it
 * Created in 2019年3月23日
 * Description: 定义规则校验的执行模板
 */
public abstract class AbstractRuleTemplate {
	
	protected RuleChain chain = new RuleChain();
	protected RuleContext context = new RuleContext();
	/**
	 * 整条校验类的异常控制器
	 */
	ExceptionFilter filter = new ExceptionFilter();
	
	public AbstractRuleTemplate() {
		chain.addCommand(filter);
	}
	
	public RuleResponse doCheck() {
		RuleContext context = new RuleContext();
		boolean result = context.isError();
		
		RuleResponse ruleResponse = new RuleResponse();
		if (result) {
			RuleConstantEnum ruleConstantEnum = context.getRuleConstantEnum();
			ruleResponse.setError(result);
			ruleResponse.setRuleConstantEnum(ruleConstantEnum);
		}
		return ruleResponse;
	}

	protected abstract void addRule(Object ...args);
}
