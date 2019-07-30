package com.demo.spring;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory = new XmlBeanFactory
		//		(new FileSystemResource("C:\\Users\\Abridge Solutions\\Documents\\workspace-sts-3.9.9.RELEASE\\spring-app-xml\\src\\main\\resources\\SpringDemo.xml"));
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringDemo.xml");
		
		Mail mail=(Mail)ctx.getBean("mymail");// search by name
		
		//Mail mail = ctx.getBean(Mail.class); // search by class....only if there is only one bean in a class
		
		// see google for SEARCH BY TYPE
		
		System.out.println(mail.getMessage().getBody());
		
		mail.getMessage().setBody("MM2");
		//if we declare bean as prototype then more objects are created unlike single object in singleton
		
		Mail mail1=(Mail)ctx.getBean("mymail");
		System.out.println(mail1.getMessage().getBody());
		
		
		
	}

}
