package com.listner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Facebook_pom {
	public WebDriver driver;//--null
	
	@FindBy(id="email")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	@FindBy(id="pass")
	private WebElement password;
	

}
