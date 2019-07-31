package com.demo.spring;

import org.aspectj.apache.bcel.classfile.Method;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppMain {

	public static void main(String[] args) throws Exception{
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Performer p = (Performer) ctx.getBean("singer");
		
		java.lang.reflect.Method[] methods = p.getClass().getMethods();
		System.out.println("\n------Methods Invoked by Spring---------\n");
		for(java.lang.reflect.Method m : methods) {
			System.out.println(m.getName());
		}
		System.out.println("\n-------------------\n");
		p.perform();
		
	}
}
