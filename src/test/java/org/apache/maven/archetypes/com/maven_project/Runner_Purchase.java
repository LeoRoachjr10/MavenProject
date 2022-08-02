
	package org.apache.maven.archetypes.com.maven_project;


	import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	public class Runner_Purchase extends Utility_Files{

		public static  WebDriver driver;
		
		public static void dress() {
			WebElement Dresses = find_Element("//li[@id='category-thumbnail']/div//following-sibling::div//following::a[.='Dresses']");
mouse_Actions(Dresses, "click");

		}
		public static void eve_dress() {
			WebElement eve_Drs =find_Element("//li[@id='category-thumbnail']/div//following-sibling::div//following::a[.='Dresses']//following::a[.='Evening Dresses']");
		click_On_Element(eve_Drs);
		}
		
		public static void collection() throws InterruptedException {

		WebElement collection = find_Element("//div[@id='center_column']/div/following-sibling::h1/following-sibling::div/div/ul/following-sibling::form/div/following::div[@class='top-pagination-content clearfix']/form/following-sibling::div/following-sibling::div/following::ul/li/div/div/div/a/img");
		Thread.sleep(3);
		js_click(collection);
		}
		public static void quantity() {
		WebElement quantity = find_Element("//input[@id='quantity_wanted']");
				quantity.clear();
			quantity.sendKeys("2");
		}
		public static void size() {
		
		WebElement size=find_Element("//select[@id='group_1']");
		Select s=new Select(size);
		s.selectByValue("3");
		}
		public static void colour() {
			// TODO Auto-generated method stub
			WebElement colour = find_Element("//a[@id='color_24']");
	click_On_Element(colour);
			
		}
		public static void add_to_cart() throws InterruptedException {
		WebElement add_to_cart =find_Element("//button[@type='submit']/span[.='Add to cart']");
		click_On_Element(add_to_cart);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		}
		public static void proceed() throws InterruptedException {
			WebElement proceed = find_Element("//div[@class='button-container']/span/following::a[@title='Proceed to checkout']/span");
			js_click(proceed);
			
		}
		public static void summary_proceed() throws InterruptedException {
			WebElement summary_proceed = find_Element("//a[@class='button btn btn-default standard-checkout button-medium']/span");
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Thread.sleep(3000);
			js_click(summary_proceed);
		}
		
	public static void email() {

		WebElement email = find_Element("//input[@id='email']");
		email.sendKeys("cristianoronaldocr7506@gmail.com");
	}
	public static void password() {
		WebElement pswd = find_Element("//input[@id='passwd']");
		pswd.sendKeys("cristiano@123");

	}
	public static void signup() throws InterruptedException {

		WebElement signup = find_Element("//button[@id='SubmitLogin']");
		signup.click();
		Thread.sleep(3000);
	}
		public static void adrs_proceed() {
			WebElement adrs_proceed = find_Element("//button[@class='button btn btn-default button-medium']/span");
		js_click(adrs_proceed);
		}
		public static void term_con() {
			WebElement term_con = find_Element("//input[@id='cgv']");
			term_con.click();
		}
			public static void shipping_proceed() {
			
			WebElement shipping_proceed = driver.findElement(By.xpath("//button[@name='processCarrier']/span"));
			js_click(shipping_proceed);
			}
			public static void payment_by() {
			
			WebElement payment_by = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		js_click(payment_by);
			}
		public static void confirm_order() {
			WebElement confirm_order = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
			js_click(confirm_order);
		}
	
		
		public static void main(String[] args) throws InterruptedException, IOException {
			
		driver=get_brower("chrome");
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		dress();
		eve_dress();
		collection();
		quantity();
		size();
		colour();
		add_to_cart();
		proceed();
		summary_proceed();
		email();
		password();
		signup();
		adrs_proceed();
		term_con();
		shipping_proceed();
		payment_by();
		confirm_order();
        screenshot("C:\\\\Users\\\\LEO\\\\eclipse-workspace\\\\Selenium\\\\snap5");
		}
		
	}




