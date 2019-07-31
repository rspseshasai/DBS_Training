package com.demo.writer.app2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.writer.AppConfig;
import com.demo.writer.EmpApp;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class TestApp {
	
	@Autowired
	EmpApp empApp;
	
	@Test
	public void testSave() {
		empApp.registerEmp();
		assertTrue("Test Passes", true);
	}
}
