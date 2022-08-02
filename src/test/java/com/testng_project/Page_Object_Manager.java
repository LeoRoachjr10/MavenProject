package com.testng_project;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {
	public static WebDriver driver;
	public static Adactin_Pom adac;
	
	public Page_Object_Manager(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	
public static Adactin_Pom getAdac() {
	if (adac==null) {
		adac=new Adactin_Pom(driver);
		
	}	
	
	
	return adac;
	}


}




