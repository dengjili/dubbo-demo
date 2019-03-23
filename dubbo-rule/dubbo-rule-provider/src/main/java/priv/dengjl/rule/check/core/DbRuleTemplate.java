package priv.dengjl.rule.check.core;

import java.util.List;

import org.apache.commons.chain.Command;
import org.dubbo.rule.provider.SpringContextUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import priv.dengjl.rule.check.confg.bean.RmRule;
import priv.dengjl.rule.check.confg.dao.RmRuleMapper;

@Component
public class DbRuleTemplate extends AbstractRuleTemplate {

	@Autowired
	private RmRuleMapper rmRuleMapper;
	
	private static final Logger logger = LoggerFactory.getLogger(DbRuleTemplate.class);
	
	@Override
	protected void addRule(Object... args) {
		if (args != null && args.length > 0) {
			String busiCode = args[0].toString();
			List<RmRule> rmRules = rmRuleMapper.getRmRulesByBusiCode(busiCode);
			
			if (rmRules != null) {
				for (RmRule rmRule : rmRules) {
					String clazz = rmRule.getClazz();
					try {
						Class<?> forName = Class.forName(clazz);
						Object instance = SpringContextUtils.getBean(forName);
						
						if (instance instanceof Command) {
							Command rule = (Command) instance;
							chain.addRule(rule);
						}
					} catch (ClassNotFoundException e) {
						logger.error("加载异常处理链失败, 当前异常信息：{}", e.getMessage());
						continue;
					}
				}
			}
		}
	}
	
}
