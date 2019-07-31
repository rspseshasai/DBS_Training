package com.demo.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(value = 2)
public class AudienceAdvice {
	
	@Pointcut("execution(* com.demo.spring.Perf*.perform(..))")
	private void pcut() {
		
	}
	
	@Before("pcut()")

	public void takeSeat() {
		System.out.println("Audience takes seat...");
	}
	@Before("pcut()")

	public void switchOffMobiles() {
		System.out.println("Audience switched off mobiles...");
	}
	@AfterReturning("pcut()")
	public void appalud() {
		System.out.println("Audience applauds: Clap! Clap!...");
	}
	
}
