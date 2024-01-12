package org.cucumber;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucu extends BaseClass {
	
	@Given("user have to login facebook using chrome browser")
	public void user_have_to_login_facebook_using_chrome_browser() {
		
		loadBrowserChrome();
		launchUrl("https://www.facebook.com/");
	   
	}

	@When("user have to enter valid user and invalid passord")
	public void user_have_to_enter_valid_user_and_invalid_passord() {
		
	    WebElement user = driver.findElement(By.id("email"));
	    toEnterText(user, "jaga@gmail.com");
	    
	    WebElement pass = driver.findElement(By.name("pass"));
	    toEnterText(pass, "12354578");
	    
	    
	}

	@When("user have to click login button")
	public void user_have_to_click_login_button() {
	    WebElement log = driver.findElement(By.name("login"));
	    toClick(log);
	}

	@Then("user have to reach invalid credentials page")
	public void user_have_to_reach_invalid_credentials_page() {
	    screenShot("C:\\Users\\91848\\eclipse-workspace\\Cucumber\\Shot\\face.jpg");
	}


	}

