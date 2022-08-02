package Array;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	@DataProvider
	public String[][] data() {
String[][] details= {
		{"leo" ,"leo@123"},
		{"roach","roach@123"},
		{"prakash","praksh@123"},
	
};
return details;
	
}
	@Test(dataProvider = "data")
	public void data2(String name, String pass) {
System.out.println(name);
System.out.println(pass);
	}

	}

