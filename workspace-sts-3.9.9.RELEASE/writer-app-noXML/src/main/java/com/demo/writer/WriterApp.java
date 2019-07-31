package com.demo.writer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class WriterApp {
	
	@Autowired    //for dependency injection.....no need to write setters
	@Qualifier("plainTextWriter")
	private Writer writer;
	
	public void print (String message) {
		writer.write(message);
	}
	
	/*
	public void setWriter(Writer writer) {
		this.writer = writer;
	}*/
	
}
