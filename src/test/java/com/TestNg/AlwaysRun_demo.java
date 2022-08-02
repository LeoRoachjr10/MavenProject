package com.TestNg;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class AlwaysRun_demo{
	@Test(alwaysRun = true)
	private void zebronics() {
System.out.println(10/0);
	}
	@Test (dependsOnMethods = "zebronics",
	priority = -1,alwaysRun = true)
private void hcl() {
System.out.println("hcl");
}
	
	@Test(priority = -2)
	private void lenova() {
System.out.println("lenova");
	}
}
