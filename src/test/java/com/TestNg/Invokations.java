package com.TestNg;

import org.testng.annotations.Test;

public class Invokations {
	
	@Test(priority = -3,invocationCount = 2,timeOut = 2)
	private void jaya() {
System.out.println("jaya");
	}
	@Test(priority =-2 ,invocationCount =0)//if we give 0 it throws exception 
private void sunai() {
System.out.println("sunai");
}
	@Test(priority =-1,invocationCount = 1 )
private void leo() {
System.out.println("leo");
}
	@Test
	private void surya() {
System.out.println("surya");
	}
}
