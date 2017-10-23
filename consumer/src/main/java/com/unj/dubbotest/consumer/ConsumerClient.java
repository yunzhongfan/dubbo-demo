package com.unj.dubbotest.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zjw.provider.service.ProviderService;

public class ConsumerClient {

	 public static void main(String[] args) {

	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
	                new String[] { "spring-consumer-applcation.xml" });
	        context.start();
	        ProviderService  services = (ProviderService) context.getBean("demoService");
	        services.getUsers();
	        System.out.println(services.getUsers());
	        System.out.println(services.sayHello("cai"));
	        
	       /* DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
	        String hello = demoService.sayHello("ricky"); // 执行远程方法
	        System.out.println(hello); // 显示调用结果

	        User user = demoService.findUserById(15);
	        System.out.println(user); // 显示调用结果
*/
	    }
}
