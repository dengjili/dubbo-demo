package priv.dengjl.rule.check.core;

import org.apache.commons.chain.Context;
import org.apache.commons.chain.Filter;

import priv.dengjl.rule.check.context.RuleContext;
import priv.dengjl.rule.check.exception.RuleConstantEnum;
import priv.dengjl.rule.check.exception.RuleException;
import priv.dengjl.rule.check.exception.RuleExceptionUtils;

public class ExceptionFilter implements Filter {

	/**
	 * 只要有一个filter返回true，异常将不会抛出
	 */
	public boolean postprocess(Context context, Exception exception) {
		if (context instanceof RuleContext) {
			RuleContext ruleContext = (RuleContext) context;
			
			if (exception != null) {
				ruleContext.setSaveException(exception);
				ruleContext.setError(true);
				
				if (exception instanceof RuleException) {
					RuleException ruleException = (RuleException) exception;
					RuleConstantEnum ruleConstantEnum = RuleExceptionUtils.getRuleConstantEnum(ruleException.getCode());
					ruleContext.setRuleConstantEnum(ruleConstantEnum);
					
					// 是自定义异常，自己判断，不抛出异常
					return true;
				}
			}
		}
		
		// 直接抛出异常
		return false;
	}

	@Override
	public boolean execute(Context context) throws Exception {
		return false;
	}

}
