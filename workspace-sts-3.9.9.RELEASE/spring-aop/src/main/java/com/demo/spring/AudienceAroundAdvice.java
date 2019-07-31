package com.demo.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AudienceAroundAdvice {
	
	@Around("execution(* com..spring.Perf*.perform(..))")
	public Object invoke(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("\n------Audience Around Advice---------\nTake-seats");
		System.out.println("Switch-off mobiles");
		Object retVal = pjp.proceed();
		System.out.println("Clap-clap");
		return retVal;
		
	}
}
