package com.demo.writer;

import org.springframework.stereotype.Component;

@Component
public class PlainTextWriter implements Writer{
	public void write(String msg) {
		System.out.println("PlainText Writer: "+msg);
	}
}
