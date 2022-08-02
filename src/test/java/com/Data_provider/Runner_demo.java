package com.Data_provider;

import org.testng.annotations.Test;

public class Runner_demo extends Data_Provider_demo {
	//with extends
	@Test(dataProvider = "details")
	public void collect(String id,String name,String age) {
System.out.print(id);
System.out.print(name);
System.out.print(age);
System.out.println();
	}
	
	
	

}
