package org.dubbo.rule.impl;

import org.apache.commons.chain.Context;
import org.dubbo.user.api.IUserOperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import priv.dengjl.rule.check.command.Rule;
import priv.dengjl.rule.check.exception.RuleConstantEnum;
import priv.dengjl.rule.check.exception.RuleExceptionUtils;

@Component
public class IsUserExist implements Rule {
	
	@Autowired
	private IUserOperateService userOperateService;
	
	@Override
	public boolean execute(Context context) throws Exception {
		String result = userOperateService.queryUser("test");
		// 这里主做服务调用，不做数据验证
		if (result != null) {
			
		}
		
		RuleExceptionUtils.throwException(RuleConstantEnum.EXCEPTION_ORDER_001);
		return false;
	}
}
