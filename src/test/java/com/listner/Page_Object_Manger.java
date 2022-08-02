package com.listner;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manger {
public WebDriver driver;
private Facebook_pom facebook;

public void Page_Object_Manager(WebDriver driver) {
this.driver=driver;
}


public Facebook_pom getuserfacebook() {
	if (facebook==null) {
		facebook=new Facebook_pom();
	
}
	return facebook;

}

}
