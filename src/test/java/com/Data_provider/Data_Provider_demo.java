package com.Data_provider;

import org.testng.annotations.DataProvider;

public class Data_Provider_demo {
	
	@DataProvider
	public String[][] details() {
     String[][] data= {
    	 {"123","leo","25"},
    	 {"124","roach","26"},
    	 {"125","prakash","27"},
     };
     return data;
	}
		
	

}
