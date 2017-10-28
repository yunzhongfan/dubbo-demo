package com.zjw.provider.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiesTest {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext context  =  new ClassPathXmlApplicationContext("classpath:dubbo/dubbo-server.xml");
		context.start();
		 System.out.println("Dubbo provider start...");
	     System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
	}

}
