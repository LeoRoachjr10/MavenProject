package org.apache.maven.archetypes.com.maven_project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Purchase_Collection extends Utility_Files {
	public WebDriver driver;
	public Pom_Purchase_Collection(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
			}
	private WebElement collection;
	
	private WebElement quantity;
	
	private WebElement size;
	
	private WebElement colour;
	
	private WebElement add_to_cart;

   private WebElement  proceed;

public WebElement getProceed() throws IOException {
	proceed=find_Element(particular_cell(0, 7, 1));
	return proceed;
}
public WebElement getAdd_to_cart() throws IOException {
	add_to_cart=find_Element(particular_cell(0, 6, 1));
		return add_to_cart;
	}
	public WebElement getColour() throws IOException {
		colour=find_Element(particular_cell(0, 5, 1));
		return colour;
	}
	public WebElement getSize() throws IOException {
		size=find_Element(particular_cell(0, 4, 1));
		return size;
	}
	public WebElement getCollection() throws IOException {
		collection =find_Element(particular_cell(0, 2, 1));
		return collection;
	}
	public WebElement getQuantity() throws IOException {
		quantity=find_Element(particular_cell(0, 3, 1));
		return quantity;
	}

}
