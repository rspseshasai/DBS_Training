package com.demo.writer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.writer.WriterApp;

public class AppMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("WriterDemo.xml");

		WriterApp app=(WriterApp)ctx.getBean("app");
		app.print("Hii");
		
	}

}
