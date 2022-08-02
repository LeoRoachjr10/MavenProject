package org.apache.maven.archetypes.com.maven_project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Purchase_Term_con extends Utility_Files {
	public Pom_Purchase_Term_con(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	}


	public WebElement getTerm_con() throws IOException {
		term_con=find_Element(particular_cell(0, 13, 1));
		return term_con;
	}

	public WebDriver driver;
	
	private WebElement term_con;

}
