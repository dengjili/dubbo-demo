package org.dubbo.order.provider;

import org.dubbo.order.api.base.OrderRequest;

import com.alibaba.fastjson.JSON;

public class SerializableJson {
	public static void main(String[] args) {
		OrderRequest<String> orderRequest = new OrderRequest<String>();
		orderRequest.setData("1234");
		String jsonString = JSON.toJSONString(orderRequest);
		System.out.println(jsonString);
	}
}