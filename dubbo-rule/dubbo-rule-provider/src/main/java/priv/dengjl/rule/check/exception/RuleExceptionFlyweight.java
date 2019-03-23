package priv.dengjl.rule.check.exception;

import java.util.HashMap;

/**
 * 
 * Created by it
 * Created in 2019年3月23日
 * Description: 重复利用异常信息
 */
public class RuleExceptionFlyweight {
	private static final HashMap<String, RuleException> exceptions = new HashMap<>();

	public static RuleException getRuleException(RuleConstantEnum ruleConstantEnum) {
		RuleException ruleException = exceptions.get(ruleConstantEnum.code());
		if (ruleException == null) {
			ruleException = new RuleException(ruleConstantEnum);
			exceptions.put(ruleConstantEnum.code(), ruleException);
		}
		return ruleException;
	}

	public static RuleException getRuleException(String code) {
		RuleException ruleException = exceptions.get(code);
		
		if (ruleException == null) {
			RuleConstantEnum ruleConstantEnum = RuleExceptionUtils.getRuleConstantEnum(code);
			if (ruleConstantEnum != RuleConstantEnum.EXCEPTION_COMMON) {
				exceptions.put(ruleConstantEnum.code(), ruleException);
			}
			ruleException = getRuleException(ruleConstantEnum); 
		}
		return ruleException;
	}
	

	public static RuleException getRuleException(String code, String message) {
		RuleException ruleException = exceptions.get(code);
		
		if (ruleException == null) {
			RuleConstantEnum ruleConstantEnum = RuleExceptionUtils.getRuleConstantEnum(code, message);
			if (ruleConstantEnum != RuleConstantEnum.EXCEPTION_COMMON) {
				exceptions.put(ruleConstantEnum.code(), ruleException);
			}
			ruleException = getRuleException(ruleConstantEnum); 
		}
		return ruleException;
	}
}
