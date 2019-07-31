package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppMain {

	public static void main(String[] args) throws Exception{
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Performer p = (Performer) ctx.getBean("singer");
		p.perform();
		
	}
}
