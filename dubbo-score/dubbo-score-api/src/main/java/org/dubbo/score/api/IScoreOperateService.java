package org.dubbo.score.api;

public interface IScoreOperateService {
	String addScore(String userId, int count);
	
	/**
	 * 规则测试
	 */
	String queryScore(String userId);
}