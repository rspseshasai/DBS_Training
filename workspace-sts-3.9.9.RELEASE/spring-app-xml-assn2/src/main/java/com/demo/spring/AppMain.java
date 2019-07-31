package com.demo.spring;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

public class AppMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringDemo.xml");
		
		Trainer trainer=ctx.getBean(Trainer.class);
		
		for(Participants p:trainer.getParticipants())
		{
			LunchBox lb=p.getLunchBox();
			for(Item item: lb.getItems())
			{
				System.out.println(item.getName()+" has taste "+item.getTaste());
			}
		}
		
		
	}

}
