package org.apache.maven.archetypes.com.maven_project;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runner_adactin extends Utility_Files {
			
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LEO\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement username_Txt = driver.findElement(By.xpath("//input[@id='username']"));
		username_Txt.sendKeys("Leoroach");
		WebElement password_Txt = driver.findElement(By.xpath("//input[@id='password']"));
		password_Txt.sendKeys("leo9944");
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
		Thread.sleep(2000);
		WebElement location_Clk = driver.findElement(By.xpath("//select[@id='location']"));
		Select location_Clk1=new Select(location_Clk);
		location_Clk1.selectByValue("Melbourne");
		
		WebElement hotels_Clk = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select hotels_Clk1=new Select(hotels_Clk);
		hotels_Clk1.selectByValue("Hotel Creek");
		
		WebElement room_Clk = driver.findElement(By.xpath("//select[@id='room_type']"));
	 Select room_Clk1=new Select(room_Clk);
	 room_Clk1.selectByValue("Deluxe");
	 
		WebElement num = driver.findElement(By.xpath("//select[@id='room_nos']"));
		 Select num1=new Select(num);
num1.selectByValue("2");

WebElement check_In = driver.findElement(By.xpath("//input[@id='datepick_in']"));
check_In.sendKeys("07/12/2022");

WebElement check_Out = driver.findElement(By.xpath("//input[@id='datepick_in']"));
check_Out.sendKeys("10/12/2022");
 
WebElement adult_Room = driver.findElement(By.xpath("//select[@id='adult_room']"));
Select adult_Room1=new Select(adult_Room);
adult_Room1.selectByValue("2");

WebElement child_Room = driver.findElement(By.xpath("//select[@id='child_room']"));
Select child_Room1=new Select(child_Room);
child_Room1.selectByValue("2");

WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
search.click();
Thread.sleep(2000);
WebElement radio = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
radio.click();
WebElement continue1 = driver.findElement(By.xpath("//input[@id='continue']"));
  continue1.click();
  
  WebElement name_clarify = driver.findElement(By.xpath("//input[@name='first_name']"));
  name_clarify.sendKeys("Leo");
  WebElement lastname_clarify = driver.findElement(By.id("last_name"));
  lastname_clarify.sendKeys("roach");
  WebElement billing_add = driver.findElement(By.id("address"));
 billing_add.sendKeys("chenNAI");
  WebElement credit_card = driver.findElement(By.id("cc_num"));
  credit_card.sendKeys("1233455678909058");
  
  WebElement card_type = driver.findElement(By.xpath("//select[@name='cc_type']"));
  Select ca=new Select(card_type);
  ca.selectByValue("VISA");
  
  WebElement mnth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
  Select mn=new Select(mnth);
		  mn.selectByValue("1");
		  WebElement yr = driver.findElement(By.id("cc_exp_year"));
		  Select y=new Select(yr);
		  y.selectByValue("2021");
		  WebElement ccv = driver.findElement(By.id("cc_cvv"));
		  
		  ccv.sendKeys("123");
		  
		  WebElement book = driver.findElement(By.id("book_now"));
		  book.click();
  TakesScreenshot ts=(TakesScreenshot)driver;
File source = ts.getScreenshotAs(OutputType.FILE);
  File destination=new File("C:\\Users\\LEO\\eclipse-workspace\\Selenium\\snap\\screenshot_1.png");
  FileUtils.copyFile(source, destination);
Thread.sleep(3000);
  




driver.quit();
		
	}

}



