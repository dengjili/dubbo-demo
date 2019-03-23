package org.dubbo.rule.impl;

import org.apache.commons.chain.Context;
import org.dubbo.order.api.IOrderOperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import priv.dengjl.rule.check.command.Rule;

@Component
public class IsOrderExist implements Rule {
	
	@Autowired
	private IOrderOperateService orderOperateService;
	
	@Override
	public boolean execute(Context context) throws Exception {
		String result = orderOperateService.queryOrder("test");
		// 这里主做服务调用，不做数据验证
		if (result != null) {
			
		}
		return false;
	}
}
