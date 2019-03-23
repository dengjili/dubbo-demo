package org.dubbo.rule.impl;

import org.apache.commons.chain.Context;
import org.dubbo.score.api.IScoreOperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import priv.dengjl.rule.check.command.Rule;

@Component
public class IsScoreCount implements Rule {
	
	@Autowired
	private IScoreOperateService scoreOperateService;
	
	@Override
	public boolean execute(Context context) throws Exception {
		String result = scoreOperateService.queryScore("test");
		// 这里主做服务调用，不做数据验证
		if (result != null) {
			
		}
		return false;
	}
}
