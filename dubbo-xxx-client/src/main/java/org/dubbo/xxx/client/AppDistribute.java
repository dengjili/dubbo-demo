package org.dubbo.xxx.client;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.dubbo.order.api.IOrderQueryService;
import org.dubbo.order.api.base.Foo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;

/**
 * Hello world!
 *
 */
public class AppDistribute 
{
	public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("order-consumer.xml");
        // 订单调用
    	IOrderQueryService orderQueryService = applicationContext.getBean(IOrderQueryService.class);
    	for (int i = 0; i < 10; i++) {
    		Foo foo = orderQueryService.getFooAsync(i);
    		System.out.println(foo); 
    		TimeUnit.SECONDS.sleep(2);
		}
    }
}
