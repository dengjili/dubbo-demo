package org.dubbo.order.provider;

import org.dubbo.order.api.IOrderService;
import org.dubbo.order.api.base.OrderRequest;
import org.dubbo.order.api.base.OrderResponse;

public class OrderServiceImpl implements IOrderService {
	@Override
	public OrderResponse<String> doOrder(OrderRequest<String> request) {
		System.out.println("接收到请求：" + request);
		OrderResponse<String> response = new OrderResponse<String>();
		response.setCode("0000");
		response.setDesc("成功");
		response.setData("1111111111111");
		return response;
	}
}
