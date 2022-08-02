package com.testng_project;

import org.apache.maven.archetypes.com.maven_project.Utility_Files;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.listner.Rerun_class;

public class Adactin_TestNg extends Utility_Files {
	public static WebDriver driver=Utility_Files.get_brower("chrome");
	public static Page_Object_Manager manager= new Page_Object_Manager(driver);
	
	@Test(retryAnalyzer = Rerun_class.class)
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
	

}
