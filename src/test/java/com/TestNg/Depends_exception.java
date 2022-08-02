package com.TestNg;

import org.testng.annotations.Test;

public class Depends_exception {
	
	@Test
	private void zebronics() {
System.out.println("zebronics");//2nd
	}
	
	@Test(dependsOnMethods = "mac")
	private void linux() {
System.out.println("linux");//go to mac//3rd
	}
	
	@Test
   private void mac() {
System.out.println(10/0);//1st //already printed
}	
	
	@Test(dependsOnMethods ="zebronics")
	private void windows() {
System.out.println("windows");//go to zebronics//4th
	}

}
