package org.dubbo.order.provider;

import org.dubbo.order.api.IOrderQueryService;
import org.dubbo.order.api.base.Foo;

public class OrderQueryServiceImpl implements IOrderQueryService {
	@Override
	public String doOrder(String request) {
		return "14231234234";
	}

	@Override
	public Foo getFooAsync(int id) {
		Foo foo = new Foo();
		foo.setId(id);
		foo.setName("狗狗");
		return foo;
	}
}
