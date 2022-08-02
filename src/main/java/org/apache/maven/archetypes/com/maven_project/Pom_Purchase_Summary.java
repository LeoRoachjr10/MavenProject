package org.apache.maven.archetypes.com.maven_project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Purchase_Summary extends Utility_Files{
	
public WebDriver driver;

	private WebElement summary_proceed;

public Pom_Purchase_Summary(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}

public WebElement getSummary_proceed() throws IOException {
	summary_proceed=find_Element(particular_cell(0, 8, 1));
	return summary_proceed;
}

}
