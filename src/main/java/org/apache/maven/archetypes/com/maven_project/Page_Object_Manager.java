package org.apache.maven.archetypes.com.maven_project;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {
	public WebDriver driver;//--->null
	private Pom_Purchase_Home home;//----null
	private Pom_Purchase_Collection collection;
	private Pom_Purchase_Summary summary;
	private  Pom_Purchase_Email email;
	private  Pom_Purchase_Adrs_Proceed adrs_proceed;
	private  Pom_Purchase_Term_con term_con;
	private Pom_Purchase_Shipping_Prcd shp_prcd;
	private  Pom_Purchase_Payment_By payment;
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver=driver2;
			}

	public Pom_Purchase_Home getPH() {
		if(home==null) {
			 home=new Pom_Purchase_Home(driver);
		}
		
        return home;
	}
	
	public Pom_Purchase_Collection getPC() {
	if(collection==null) {
	collection=new Pom_Purchase_Collection(driver);
	}
	return collection;
	}
	
	public Pom_Purchase_Summary getS() {
		if(summary==null) {
		summary=new Pom_Purchase_Summary(driver);
		}
		return summary;
		}
	
	public Pom_Purchase_Email getE() {
		if(email==null) {
		email=new Pom_Purchase_Email(driver);
		}
		return email;
		}
	
	public  Pom_Purchase_Adrs_Proceed getAP() {
		if(adrs_proceed==null) {
		adrs_proceed=new Pom_Purchase_Adrs_Proceed(driver);
		}
		return adrs_proceed;
		}
	public  Pom_Purchase_Term_con getTC() {
	if(term_con==null) {
		term_con=new Pom_Purchase_Term_con(driver);
		}
		return term_con;
		}
	public  Pom_Purchase_Shipping_Prcd getSP() {
		if(shp_prcd==null) {
			shp_prcd=new Pom_Purchase_Shipping_Prcd(driver);
			}
			return shp_prcd ;
			}
	public  Pom_Purchase_Payment_By getPB() {
		if(payment==null) {
			payment=new Pom_Purchase_Payment_By(driver);
			}
			return payment ;
			}
}


