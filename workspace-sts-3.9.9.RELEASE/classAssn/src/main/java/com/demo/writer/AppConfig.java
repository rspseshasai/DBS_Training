package com.demo.writer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages = "com.demo.writer")
public class AppConfig {
	
	//
	//public ResourceBundleMessageSource messageSource();
	
	@Bean
	public List<String> empList() {
		List<String> empNames = new ArrayList<>();
		empNames.add("Pavan");
		empNames.add("Faraaz");
		return empNames;
	}
	
	@Bean
	public List<String> empList1() {
		List<String> empNames1 = new ArrayList<>();
		empNames1.add("Pavan1");
		empNames1.add("Faraaz1");
		return empNames1;
	}
}
