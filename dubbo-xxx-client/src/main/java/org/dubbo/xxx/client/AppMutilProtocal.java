package org.dubbo.xxx.client;

import org.dubbo.order.api.IOrderQueryService;
import org.dubbo.order.api.base.OrderRequest;
import org.dubbo.order.api.base.OrderResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppMutilProtocal 
{
	public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("order-consumer.xml");
        // 订单调用
    	IOrderQueryService orderQueryService = applicationContext.getBean(IOrderQueryService.class);
    	
    	String order = orderQueryService.doOrder("1234");
    	System.out.println(order);
    }
}
