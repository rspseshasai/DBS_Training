package com.demo.writer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@PropertySource("data.properties")
@Scope("prototype")
public class EmpApp {
	
	@Value("${emp}")
	private String emp;
	EmpDao dao;
	
//  Constructer based Injection
	
	//	@Autowired
	//	public EmpApp(EmpDao dao){
	//		this.dao=dao;
	//	}
	

	@Autowired
	@Qualifier("empList")
	List<String> names;
	@Autowired
	@Qualifier("empList1")
	List<String> names1;
	@Autowired	
	private EmpDao obj;
	
	public void registerEmp() {
		obj.save(emp);
		
		obj.save(names1.get(1));
	}
}
