package priv.dengjl.rule.check.chain;

import org.apache.commons.chain.impl.ChainBase;

import priv.dengjl.rule.check.command.Rule;

public class RuleChain extends ChainBase {
	
	public void addRule(Rule rule) {
		addCommand(rule);
	}
	
}
