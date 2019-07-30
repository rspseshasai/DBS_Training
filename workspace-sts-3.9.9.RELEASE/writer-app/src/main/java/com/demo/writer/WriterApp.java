package com.demo.writer;

public class WriterApp {
	private Writer writer;
	
	public void print (String message) {
		writer.write(message);
	}
	public void setWriter(Writer writer) {
		this.writer = writer;
	}
	
}
