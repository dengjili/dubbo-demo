package org.dubbo.xxx.client;

import org.dubbo.order.api.IOrderService;
import org.dubbo.order.api.base.OrderRequest;
import org.dubbo.order.api.base.OrderResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/order-consumer.xml");
        // 订单调用
    	IOrderService orderService = applicationContext.getBean(IOrderService.class);
    	
    	OrderRequest<String> request = new OrderRequest<>();
    	request.setData("get order sequence");
    	OrderResponse<String> orderResponse = orderService.doOrder(request);
    	System.out.println(orderResponse);
    }
}
