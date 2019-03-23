package priv.dengjl.rule.check.command.impl;

import org.apache.commons.chain.Context;

import priv.dengjl.rule.check.command.Rule;
import priv.dengjl.rule.check.exception.RuleExceptionUtils;

public class IsOrderExist implements Rule {
	@Override
	public boolean execute(Context context) throws Exception {
		RuleExceptionUtils.throwException("RULE_001");
		return false;
	}
}
