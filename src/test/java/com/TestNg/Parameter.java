package com.TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	
	
	
	@Parameters({"name","pass"})
	@Test
	public void anish(String username,String password) {
		
		System.out.println(username +"   "+password);

	}
	
	
	
	
}
