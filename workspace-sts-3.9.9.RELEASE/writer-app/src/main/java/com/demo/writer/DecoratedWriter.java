package com.demo.writer;

public class DecoratedWriter implements Writer{
	public void write(String msg) {
		System.out.println("Decorated Writer: "+msg);
	}
}
