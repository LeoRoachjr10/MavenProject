package com.listner;

import org.apache.maven.archetypes.com.maven_project.Utility_Files;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testng_project.Page_Object_Manager;

public class Runner_Tranformer extends Utility_Files  {
	
		public static WebDriver driver=Utility_Files.get_brower("chrome");
		public static Page_Object_Manager manager= new Page_Object_Manager(driver);
		
		@Test
		public void Adactin() {
	  get_url("https://adactinhotelapp.com/index.php");
	sendkeys(manager.getAdac().getUsername(), "leo");
	sendkeys(manager.getAdac().getPassword(), "roach");
	click_On_Element(manager.getAdac().getLogin());
	String expectedurl="https://adactinhotelapp.com/index.php";
	String actual=driver.getCurrentUrl();
	Assert.assertEquals(expectedurl,actual);
	System.out.println("hotel purchase");

		}
		
////		@Test
//		public void facebook() {
//get_url("https://www.facebook.com/");
//WebElement login = find_Element("//input[@id='email']");
//sendkeys(login, "leo1");
//
//WebElement pass = find_Element("//input[@id='pass']");
//sendkeys(pass, "leo");
//		}
//		

	}


