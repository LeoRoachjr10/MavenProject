package com.TestNg;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Optional_Demo {
	@Parameters({"id","pass"})
	@Test
	public void data(@Optional("roach") String username,String password) {
		System.out.println(username);
		System.out.println(password);
//if we didnt give parameter for username it will take value from @optional
//otherwise we didnt give same values if its case sensitive also it takes @optionalk value 
		}

}
