package com.demo.writer;

import org.springframework.stereotype.Component;

@Component
public class EmpDaoMockImpl implements EmpDao{
	
	public void save(String emp) {
		System.out.println(emp + " saved");
	}
}
