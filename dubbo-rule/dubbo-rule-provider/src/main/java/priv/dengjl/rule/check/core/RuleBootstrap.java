package priv.dengjl.rule.check.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import priv.dengjl.rule.check.chain.RuleChain;
import priv.dengjl.rule.check.context.RuleContext;

@Component
public class RuleBootstrap {
	
	@Autowired
	private AbstractRuleTemplate template;
	
	public void setTemplate(AbstractRuleTemplate template) {
		this.template = template;
	}
	
	/**
	 * 基于数据库配置规则链
	 */
	public RuleResponse doCheckRule(String busiCode) {
		template.setChain(new RuleChain());
		template.setContext(new RuleContext());
		template.addRule(busiCode);
		RuleResponse checkResult = template.doCheck();
		return checkResult;
	}
}