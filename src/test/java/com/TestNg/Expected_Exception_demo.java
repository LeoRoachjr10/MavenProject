package com.TestNg;

import org.testng.annotations.Test;

public class Expected_Exception_demo {
	@Test(expectedExceptions = ArithmeticException.class)
	private void exception() {
System.out.println(10/0);//	method passed
	}

}
