package com.TestNg;

import org.testng.annotations.Test;

public class Group_of_groups {

public class Groups_demo {
	@Test(groups = "music")
	private void spotify() {
System.out.println("spotify");
	}

	@Test(groups = "entertainment")
	private void hotstar() {
System.out.println("hotstar");
	}
	
	@Test(groups="music")
	private void gaana() {
System.out.println("gaana");

	}
	@Test(groups="entertainment")
	private void netflix() {
System.out.println("netflix");
	}
}
}
