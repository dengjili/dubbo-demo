# dubbo-demo
dubbo入门

## 服务端发布
```java
public class App {

	public static void main(String[] args) {
		Main.main(args);
	}
}
```
## client调用
```java
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

```

## 测试结果

客户端
```
OrderResponse [code=0000, desc=成功, data=1111111111111]
```

服务端
```
接收到请求：OrderRequest [data=get order sequence]
```
