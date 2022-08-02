package com.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations {
	@BeforeSuite
	public void data() {
System.out.println("leo");
	}
@BeforeTest
public void email() {
System.out.println("leo@123");
}
@BeforeClass
public void password() {
System.out.println("leoroach");
}
@BeforeMethod
public void verify_Email() {
System.out.println("leo@123");
}
@Test
public void dress_Purchase() {
	System.out.println("gents");
}@Test
public void mobile_Pur() {
System.out.println("poco");
}
@AfterMethod
public void addtocart() {
System.out.println("fav products");
}
@AfterClass
public void checking() {
System.out.println("check");
}

@AfterTest
public void verifypurchasedetails() {
System.out.println("purchase details");
}

@AfterSuite
public void order() {
System.out.println("order");
}

}
