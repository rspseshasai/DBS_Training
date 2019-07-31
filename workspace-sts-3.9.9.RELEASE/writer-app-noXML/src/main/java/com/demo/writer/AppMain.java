package com.demo.writer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.AppConfig;
import com.demo.writer.WriterApp;

public class AppMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		WriterApp app=(WriterApp)ctx.getBean("writerApp");
		app.print("Hello");
		
	}

}
