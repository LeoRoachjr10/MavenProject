package org.apache.maven.archetypes.com.maven_project;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Purchase_Payment_By extends Utility_Files {
	public Pom_Purchase_Payment_By(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	}


	public WebElement getpayment_By() throws IOException {
	payment_By	=find_Element(particular_cell(0, 15, 1));
		return payment_By;
	}

	public WebDriver driver;
	
	private WebElement payment_By;
	private WebElement confirm_Order;
	


	public WebElement getConfirm_Order() throws IOException {
	confirm_Order=	find_Element(particular_cell(0, 16, 1));
		return confirm_Order;
	}


}
