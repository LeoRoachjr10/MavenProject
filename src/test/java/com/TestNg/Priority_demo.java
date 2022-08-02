package com.TestNg;

import org.testng.annotations.Test;

public class Priority_demo {
	
	    
		@Test (priority = -2)
		private void school() {
System.out.println("school");
		}
		
		@Test(priority = 2)
        private void pg() {
       System.out.println("pg");
		}
@Test(priority = 1)
private void ug() {
	System.out.println("ug");

}

@Test(priority = -1)
private void diploma() {
System.out.println("diploma");
}

}
