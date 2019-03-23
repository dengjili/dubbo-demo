package priv.dengjl.rule.check.confg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import priv.dengjl.rule.check.confg.bean.RmRule;

@Repository
public interface RmRuleMapper {
	List<RmRule> getRmRulesByBusiCode(@Param("busiCode") String busiCode);
}