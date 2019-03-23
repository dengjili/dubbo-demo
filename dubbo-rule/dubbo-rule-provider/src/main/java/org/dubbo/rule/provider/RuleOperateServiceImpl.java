package org.dubbo.rule.provider;

import org.dubbo.rule.api.IRuleOperateService;
import org.dubbo.rule.api.RuleResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import priv.dengjl.rule.check.core.RuleBootstrap;
import priv.dengjl.rule.check.core.RuleResponse;

@Service
public class RuleOperateServiceImpl implements IRuleOperateService {
	
	@Autowired
	private RuleBootstrap bootstrap;

	@Override
	public RuleResult checkRuleByCode(String ruleCode) {
		RuleResponse doCheckRule = bootstrap.doCheckRule(ruleCode);		
		return doCheckRule.toRuleResult();
	}

}
