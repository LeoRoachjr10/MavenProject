package com.testng_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v101.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Pom {
  public static WebDriver driver;
  @FindBy(id="username")
private WebElement username;

  public Adactin_Pom(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
  }

public WebElement getUsername() {
	return username;
}


public WebElement getPassword() {
	return password;
}


@FindBy(id="password")
  private WebElement password;


@FindBy(id="login")
private WebElement login;




public WebElement getLogin() {
	return login;
}

}
