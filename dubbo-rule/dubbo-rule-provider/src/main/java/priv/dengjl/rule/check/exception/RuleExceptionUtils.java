package priv.dengjl.rule.check.exception;

import org.springframework.util.StringUtils;

/**
 * 
 * Created by it
 * Created in 2019年3月23日
 * Description: 全局异常定义
 */
public class RuleExceptionUtils {
	
	public static void throwException(RuleConstantEnum ruleConstantEnum) {
		throw getThrowException(ruleConstantEnum);
	}
	
	public static void throwException(String code) {
		throw getThrowException(code);
	}
	
	public static void throwException(String code, String message) {
		throw getThrowException(code, message);
	}

	public static RuleException getThrowException(RuleConstantEnum ruleConstantEnum) {
		return RuleExceptionFlyweight.getRuleException(ruleConstantEnum);
	}
	
	private static RuleException getThrowException(String code) {
		return RuleExceptionFlyweight.getRuleException(getRuleConstantEnum(code));
	}
	
	private static RuleException getThrowException(String code, String message) {
		return RuleExceptionFlyweight.getRuleException(getRuleConstantEnum(code, message));
	}
	
	public static RuleConstantEnum getRuleConstantEnum(String code) {
		return getRuleConstantEnum(code, null);
	}
	
	static RuleConstantEnum getRuleConstantEnum(String code, String message) {
		RuleConstantEnum ruleConstantEnum = null;
		try {
			ruleConstantEnum = RuleConstantEnum.valueOf(RuleConstantEnum.class, code);
		} catch (java.lang.IllegalArgumentException e) {
			ruleConstantEnum = RuleConstantEnum.EXCEPTION_COMMON;
			if (!StringUtils.isEmpty(message)) {
				ruleConstantEnum.setMessage(message);
			}
		}
		return ruleConstantEnum;
	}
}
