package com.demo.writer;

public class PlainTextWriter implements Writer{
	public void write(String msg) {
		System.out.println("PlainText Writer: "+msg);
	}
}
