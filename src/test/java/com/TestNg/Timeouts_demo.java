package com.TestNg;

import org.apache.maven.archetypes.com.maven_project.Utility_Files;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeouts_demo extends Utility_Files {
	
public static WebDriver driver;


@Test(timeOut = 10000)//timeout lowerthan browser excute time 
//threadTimeoutexception
private void browerlaunch() {
driver=get_brower("chrome");
driver.get("https://www.facebook.com/");
 driver.findElement(By.id("emai")).sendKeys("abc");

}
}
