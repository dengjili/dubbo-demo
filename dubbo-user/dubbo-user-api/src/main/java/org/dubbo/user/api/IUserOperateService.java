package org.dubbo.user.api;

public interface IUserOperateService {
	String createUser(String name);
	
	/**
	 * 规则测试
	 */
	String queryUser(String userId);
}