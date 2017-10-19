package com.unj.dubbotest.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	 
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-provider-application.xml"});
        context.start();
        System.out.println("Dubbo provider start...");
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
        
    }
 
}