package org.apache.maven.archetypes.com.maven_project;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
//using logger,datadriven
public class Runner_Drs_Pom extends Utility_Files  {
	public static  WebDriver driver= Utility_Files.get_brower("chrome");
    public static Page_Object_Manager manager=new  Page_Object_Manager(driver);	
    public static Logger log=Logger.getLogger(Runner_Drs_Pom.class);
	
	public static void dress() throws IOException {
		mouse_Actions((manager.getPH().getDress_clk()),"clickandhold");	
	}
	public static void eve_dress() throws IOException {
	click_On_Element(manager.getPH().getEve_drs());
	}
	//next page
	public static void collection() throws InterruptedException, IOException {
		js_click(manager.getPC().getCollection());
		Thread.sleep(3000);
	
	
	}
	public static void quantity() throws InterruptedException, IOException {
	clear_Element(manager.getPC().getQuantity());
Thread.sleep(3000);
sendkeys(manager.getPC().getQuantity(), "2");
	}
	
	public static void size() throws IOException {
	dropdown(manager.getPC().getSize(), "byvalue","3");
	}
	public static void colour() throws IOException {
		// TODO Auto-generated method stub
click_On_Element(manager.getPC().getColour());
		
	}
	public static void add_to_cart() throws InterruptedException, IOException {
	click_On_Element(manager.getPC().getAdd_to_cart());
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(5000);
	}
	public static void proceed() throws InterruptedException, IOException {
		js_click(manager.getPC().getProceed());
		
	}
	public static void summary_proceed() throws InterruptedException, IOException {
		js_click(manager.getS().getSummary_proceed());
	}
	
public static void email() throws IOException {

	
sendkeys(manager.getE().getEmail(), "cristianoronaldocr7506@gmail.com");	
}
public static void password() throws IOException {
	sendkeys(manager.getE().getPassword(), "cristiano@123");
	

}
public static void signup() throws InterruptedException, IOException {

	click_On_Element(manager.getE().getSignup());;
}
	public static void adrs_proceed() throws IOException {
	js_click(manager.getAP().getAdrs_proceed());
	}
	public static void term_con() throws IOException {
		click_On_Element(manager.getTC().getTerm_con());
	}
		public static void shipping_proceed() throws IOException {
		
		js_click(manager.getSP().getShipping_prcd());
		}
		public static void payment_by() throws IOException {
		
	js_click(manager.getPB().getpayment_By());
		}
	public static void confirm_order() throws IOException {
		js_click(manager.getPB().getConfirm_Order());
	}
	

	
	public static void main(String[] args) throws InterruptedException, IOException {
	PropertyConfigurator.configure("log4j.properties");
	driver.get("http://automationpractice.com/index.php");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	dress();
	eve_dress();
	log.info("home page completed");
	collection();
	quantity();
	size();
	colour();
	add_to_cart();
	proceed();
   log.warn("proceed page completed");
	summary_proceed();
	email();
	password();
	signup();
	adrs_proceed();
	term_con();
	shipping_proceed();
	log.info("shipping page completed");
	payment_by();
	log.fatal("paymentby page completed");
	confirm_order();
	}
	
}





