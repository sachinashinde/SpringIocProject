package com.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("configuration.xml");
		HelloWorldService helloWorldService = (HelloWorldService) ctx.getBean("hello");
		System.out.println(helloWorldService.getName());
		
		Student obj = (Student) ctx.getBean("student");
		Student obj1 = (Student) ctx.getBean("student");
		
	}
}
