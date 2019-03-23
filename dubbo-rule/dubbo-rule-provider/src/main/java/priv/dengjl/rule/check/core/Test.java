package priv.dengjl.rule.check.core;

import priv.dengjl.rule.check.chain.RuleChain;
import priv.dengjl.rule.check.command.impl.IsOrderExist;
import priv.dengjl.rule.check.context.RuleContext;
import priv.dengjl.rule.check.exception.RuleConstantEnum;

/**
 * 
 * Created by it
 * Created in 2019年3月23日
 * Description: 基本使用测试
 */
public class Test {

	public static void main(String[] args) throws Exception {
		RuleChain ruleChain = new RuleChain();
		ruleChain.addCommand(new ExceptionFilter());
		ruleChain.addCommand(new IsOrderExist());
		ruleChain.addCommand(new IsOrderExist());
		
		RuleContext context = new RuleContext();
		ruleChain.execute(context);
		
		boolean result = context.isError();
		
		if (result) {
			RuleConstantEnum ruleConstantEnum = context.getRuleConstantEnum();
			System.out.println(ruleConstantEnum);

		}
		System.out.println(result);
	}

}
