package org.dubbo.xxx.client;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.dubbo.order.api.IOrderQueryService;
import org.dubbo.order.api.base.Foo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;

/**
 * Hello world!
 *
 */
public class AppAsync 
{
	public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("order-consumer.xml");
        // 订单调用
    	IOrderQueryService orderQueryService = applicationContext.getBean(IOrderQueryService.class);
    	Foo foo = orderQueryService.getFooAsync(121212);
    	System.out.println(foo); // null
    	Future<Foo> future = RpcContext.getContext().getFuture();
    	Foo foo2 = future.get();
    	System.out.println(foo2);
    }
}
