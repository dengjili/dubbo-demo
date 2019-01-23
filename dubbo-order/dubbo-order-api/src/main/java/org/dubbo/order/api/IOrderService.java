package org.dubbo.order.api;

import org.dubbo.order.api.base.OrderRequest;
import org.dubbo.order.api.base.OrderResponse;

public interface IOrderService {
	OrderResponse<String> doOrder(OrderRequest<String> request);
}
