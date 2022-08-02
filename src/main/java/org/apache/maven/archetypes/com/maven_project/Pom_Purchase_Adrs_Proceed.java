package org.apache.maven.archetypes.com.maven_project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Purchase_Adrs_Proceed extends Utility_Files{

	public  WebDriver driver;
private WebElement adrs_proceed;

public Pom_Purchase_Adrs_Proceed(WebDriver driver2) {
this.driver=driver2; 
PageFactory.initElements(driver2, this);
}

public WebElement getAdrs_proceed() throws IOException {
	adrs_proceed=find_Element(particular_cell(0, 12, 1));
	return adrs_proceed;
}



}
	
