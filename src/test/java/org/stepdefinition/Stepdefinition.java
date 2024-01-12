package org.stepdefinition;

import org.baseclass.BaseClass;
import org.pojo.PojoLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass{
	
	public static PojoLogin p;
	

@Given("user have to validate facebook login using chrome browser")
public void user_have_to_validate_facebook_login_using_chrome_browser() {
	loadBrowserChrome();
	launchUrl("https://www.facebook.com/");
	maximizeBrowser();
    
}

@When("user have to enter {string} and {string}")
public void user_have_to_enter_and(String email, String password) {
	
	p = new PojoLogin();
	
	toEnterText(p.getTxtEmail(), email);
	
	toEnterText(p.getTxtPass(), password);
    
}

@When("user have to clik login button")
public void user_have_to_clik_login_button() {
	
	toClick(p.getBtnLogin());
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
	}
   
}

@Then("user have to check is in invalid credential page")
public void user_have_to_check_is_in_invalid_credential_page() {
	
	String url = driver.getCurrentUrl();
    
	if (url.contains("privacy_mutation_token")) {
		
		System.out.println("invalid credential");
		
	} else {
		
		System.out.println("valid credential");

	}
}

}
