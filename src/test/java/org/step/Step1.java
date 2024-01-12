package org.step;

import org.baseclass.BaseClass;
import org.pojo.PojoLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step1 extends BaseClass {
	
	public static PojoLogin p;
	

@Given("user have to validate facebook login using chrome browser")
public void user_have_to_validate_facebook_login_using_chrome_browser() {
	
	loadBrowserChrome();
	launchUrl("https://www.facebook.com/");
	maximizeBrowser();
    
}

@When("user have to enter invalid user id and invalid password")
public void user_have_to_enter_invalid_user_id_and_invalid_password() {
	
	p = new PojoLogin();
	
	toEnterText(p.getTxtEmail(), "123@gmail.com");
	toEnterText(p.getTxtPass(), "123456");
    
}

@When("user have to enter valid user id and valid password")
public void user_have_to_enter_valid_user_id_and_valid_password() {
	
p = new PojoLogin();
	
	toEnterText(p.getTxtEmail(), "@gmail.com");
	toEnterText(p.getTxtPass(), "123");
    
    
}

@When("user have to click login button")
public void user_have_to_click_login_button() {
	
	p = new PojoLogin();
	
	toClick(p.getBtnLogin());
	
   
}

@Then("user have to verify wheather is in invalid credential page")
public void user_have_to_verify_wheather_is_in_invalid_credential_page() {
	
	String url = driver.getCurrentUrl();
	
	if (url.contains("privacy_mutation_token")) {
		
		System.out.println("invalid credential");
		
	} else {
		
		System.out.println("valid credential");

	}
    
}



}
