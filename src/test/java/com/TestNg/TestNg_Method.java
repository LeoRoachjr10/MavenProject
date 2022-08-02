package com.TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Method {
	
	@BeforeMethod
	private void before() {
System.out.println("email");

	}
	@Test
	private void syso() {
System.out.println("gixer");
System.out.println("poco");
	}
	@AfterMethod
	private void after() {
System.out.println("contactno");
	}
	

}
