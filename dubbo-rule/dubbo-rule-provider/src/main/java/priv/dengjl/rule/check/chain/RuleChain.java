package priv.dengjl.rule.check.chain;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.impl.ChainBase;

public class RuleChain extends ChainBase {
	
	public void addRule(Command rule) {
		addCommand(rule);
	}
	
}
