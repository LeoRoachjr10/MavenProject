package org.apache.maven.archetypes.com.maven_project;


	import java.io.IOException;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	public class Pom_Purchase_Shipping_Prcd extends Utility_Files {
		public Pom_Purchase_Shipping_Prcd(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
		}


		public WebElement getShipping_prcd() throws IOException {
			Shipping_prcd=find_Element(particular_cell(0, 14, 1));
			return Shipping_prcd;
		}

		public WebDriver driver;
		
		private WebElement Shipping_prcd;

	}


