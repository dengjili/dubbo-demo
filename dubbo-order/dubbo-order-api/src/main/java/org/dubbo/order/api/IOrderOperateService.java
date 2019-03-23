package org.dubbo.order.api;

public interface IOrderOperateService {
	String createOrder(String userId, String busiCode);
	
	/**
	 * 规则测试
	 */
	String queryOrder(String userId);
}
