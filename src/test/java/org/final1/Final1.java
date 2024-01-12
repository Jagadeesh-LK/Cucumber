package org.final1;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.PojoLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Final1 extends BaseClass{
	
	public static PojoLogin p;
	
	@Given("facebook login using chrome browser")
	public void facebook_login_using_chrome_browser() {
		
		loadBrowserChrome();
		launchUrl("https://www.facebook.com/");
		maximizeBrowser();
	    
	}

	@When("enter valid login id and invalid password")
	public void enter_valid_login_id_and_invalid_password() {
		
		p = new PojoLogin();
		WebElement txtEmail = p.getTxtEmail();
		toEnterText(txtEmail, "jk@gmail.com");
		WebElement txtPass = p.getTxtPass();
		toEnterText(txtPass, "1234567");
		
		
	    
	}

	@When("click login button")
	public void click_login_button() {
		
		WebElement btnLogin = p.getBtnLogin();
		toClick(btnLogin);
	    
	}

	@Then("check wheather it is invalid credential page")
	public void check_wheather_it_is_invalid_credential_page() {
		
		String url = driver.getCurrentUrl();
		
		if (url.contains("privacy_mutation_token")) {
			
			System.out.println("invalid credential");
			
		} else {
			
			System.out.println("valid credential");
		}	
	    
	}

}
