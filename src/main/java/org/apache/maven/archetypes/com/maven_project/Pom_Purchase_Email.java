package org.apache.maven.archetypes.com.maven_project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Purchase_Email extends Utility_Files {
	
	public WebDriver driver;
	 private WebElement email;
	
	 public Pom_Purchase_Email(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	 }

	public WebElement getEmail() throws IOException {
	   email=find_Element(particular_cell(0, 9, 1));
		return email;
	}
	 private WebElement password;

	public WebElement getPassword() throws IOException {
		password=find_Element(particular_cell(0, 10, 1));
		return password;
	}
	private WebElement Signup;

	public WebElement getSignup() throws IOException {
		Signup=find_Element(particular_cell(0, 11, 1));
		return Signup;
	}
}
	

