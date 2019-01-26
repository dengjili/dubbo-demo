package org.dubbo.xxx.client;

import java.io.IOException;

import org.dubbo.order.api.IOrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;

public class BootstrapApp {
	private static Logger logger = LoggerFactory.getLogger(BootstrapApp.class);
	public static void main(String[] args) throws IOException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("order-consumer.xml");
    	IOrderService orderService = applicationContext.getBean(IOrderService.class);
		logger.debug(orderService.toString());
		System.in.read();
	}

}
