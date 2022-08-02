package org.apache.maven.archetypes.com.maven_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Purchase_Home extends Utility_Files {
public  WebDriver driver;//null...
	public Pom_Purchase_Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	private WebElement dress_clk;//---null

	public WebElement getDress_clk() throws IOException {
		 dress_clk = find_Element( particular_cell(0, 0, 1));
		return dress_clk;
	}

	public WebElement getEve_drs() throws IOException {
		WebElement eve_clk = find_Element( particular_cell(0, 1, 1));
		return eve_clk;
	}

	private WebElement eve_clk;
	
	

	
}
