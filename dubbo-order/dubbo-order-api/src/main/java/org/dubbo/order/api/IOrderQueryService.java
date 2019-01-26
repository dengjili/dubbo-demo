package org.dubbo.order.api;

import org.dubbo.order.api.base.Foo;

public interface IOrderQueryService {
	String doOrder(String request);
	Foo getFooAsync(int id);
}
