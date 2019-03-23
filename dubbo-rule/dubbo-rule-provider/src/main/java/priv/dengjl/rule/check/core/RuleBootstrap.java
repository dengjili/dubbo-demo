package priv.dengjl.rule.check.core;

import org.springframework.stereotype.Component;

@Component
public class RuleBootstrap {
	/**
	 * 基于数据库配置规则链
	 */
	public RuleResponse doCheckRule(String busiCode) {
		AbstractRuleTemplate template = new DbRuleTemplate();
		template.addRule(busiCode);
		RuleResponse checkResult = template.doCheck();
		return checkResult;
	}
}