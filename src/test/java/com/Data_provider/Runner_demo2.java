package com.Data_provider;

import org.testng.annotations.Test;

public class Runner_demo2 {
	//without extends
	@Test(dataProvider = "details",
			dataProviderClass = Provider_demo2.class )
	
	private void details(String id ,String name,String age) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);

	}
	
}
