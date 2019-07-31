package com.demo.writer;

import org.springframework.stereotype.Component;

@Component
public class DecoratedWriter implements Writer{
	public void write(String msg) {
		System.out.println("Decorated Writer: "+msg);
	}
}

//Here Bean name is decoratedWriter (class name with lower case first letter)
