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
	
	protected RuleChain chain;
	protected RuleContext context;
	
	public RuleChain getChain() {
		return chain;
	}

	public void setChain(RuleChain chain) {
		this.chain = chain;
	}

	public RuleContext getContext() {
		return context;
	}

	public void setContext(RuleContext context) {
		this.context = context;
	}

	public RuleResponse doCheck() {
		setinit();
		RuleResponse ruleResponse = new RuleResponse();
		try {
			chain.execute(context);
		} catch (Exception e) {
			ruleResponse.setError(true);
			ruleResponse.setRuleConstantEnum(RuleConstantEnum.EXCEPTION_COMMON);
		}
		boolean result = context.isError();
		if (result) {
			RuleConstantEnum ruleConstantEnum = context.getRuleConstantEnum();
			ruleResponse.setError(result);
			ruleResponse.setRuleConstantEnum(ruleConstantEnum);
		}
		return ruleResponse;
	}

	protected abstract void addRule(Object ...args);

	protected abstract  void setinit();
}
