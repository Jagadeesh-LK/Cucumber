package org.step1;

import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.pojo.Forgotpojo;
import org.pojo.PojoAmazon;
import org.pojo.PojoLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step1 extends BaseClass {

	public static Forgotpojo f;

	public static PojoLogin p;

	public static PojoAmazon a;

	@Given("user have to validate forgot password of facebook using chrome browser")
	public void user_have_to_validate_forgot_password_of_facebook_using_chrome_browser() {
		loadBrowserChrome();
		launchUrl("https://www.facebook.com/");
		maximizeBrowser();
	}

	@When("user have to click forgot password button")
	public void user_have_to_click_forgot_password_button() {

		f = new Forgotpojo();

		toClick(f.getForgotBtn());

	}

	@When("user have to enter email or phone number in search box")
	public void user_have_to_enter_email_or_phone_number_in_search_box() {

		f = new Forgotpojo();

		toEnterText(f.getSearchBox(), "1234566789");

	}

	@Then("user have to click search button")
	public void user_have_to_click_search_button() {

		f = new Forgotpojo();

		toClick(f.getSearchBtn());

	}

	@Given("user have to validate facebook login using chrome browser")
	public void user_have_to_validate_facebook_login_using_chrome_browser() {
		launchUrl("https://www.facebook.com/");
	}

	@When("user have to enter invalid userid and invalid password")
	public void user_have_to_enter_invalid_userid_and_invalid_password() {

		p = new PojoLogin();

		toEnterText(p.getTxtEmail(), "123@gmail.com");
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

	@When("user have to enter invalid userid and valid password")
	public void user_have_to_enter_invalid_userid_and_valid_password() {

		p = new PojoLogin();

		toEnterText(p.getTxtEmail(), "jk@gmail.com");
		toEnterText(p.getTxtPass(), "123456");

	}

	@Given("user have to validate login for amazon using chrome browser")
	public void user_have_to_validate_login_for_amazon_using_chrome_browser() {

		launchUrl("https://www.amazon.com/");

	}

	@When("user have to enter valid phone number and invalid password")
	public void user_have_to_enter_valid_phone_number_and_invalid_password() {

		a = new PojoAmazon();
		
		driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
		
		
		moveElement(driver.findElement(By.xpath("//span[text()='Account & Lists']")));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		
		
		toClick(a.getSignIn());

		toEnterText(a.getPhoneNo(), "8489078432");

		toClick(a.getContin());

		toEnterText(a.getPass(), "1234356");

	}
	@Then("user have to verify wheather password incorrect is displayed")
	public void user_have_to_verify_wheather_password_incorrect_is_displayed() {

		String url = driver.getCurrentUrl();

		if (url.contains("ap/signin")) {

			System.out.println("invalid credential");

		} else {

			System.out.println("valid credential");

		}

	}

	@When("user have to click submit continue  button")
	public void user_have_to_click_submit_continue_button() {

		a = new PojoAmazon();

		toClick(a.getSubmit());

	}

	@When("user have to enter invalid phone number")
	public void user_have_to_enter_invalid_phone_number() {

		a = new PojoAmazon();
		
		driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
		
		moveElement(driver.findElement(By.xpath("//span[text()='Account & Lists']")));
		
		toClick(a.getSignIn());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}


		toEnterText(a.getPhoneNo(), "1234567891");

	

	}

	@Then("user have to verify wheather phone number incorrect is displayed")
	public void user_have_to_verify_wheather_phone_number_incorrect_is_displayed() {
		
		String url = driver.getCurrentUrl();
		

		if (url.contains("ap/signin")) {

			System.out.println("invalid credential");

		} else {

			System.out.println("valid credential");

		}

	}
		

	@When("user have to click continue button")
	public void user_have_to_click_continue_button() {
		
		a = new PojoAmazon();
		
		toClick(a.getContin());

	}
	
	@When("user have to enter Invalid userid and Invalid password")
	public void user_have_to_enter_Invalid_userid_and_Invalid_password(io.cucumber.datatable.DataTable d) {
		List<String> allData = d.asList();
		String email = allData.get(0);
		String pass = allData.get(2);
		System.out.println(email);
		System.out.println(pass);
		
		p = new PojoLogin();
		
		
		toEnterText(p.getTxtEmail(), email);
		toEnterText(p.getTxtPass(), pass);
	   
	}
	
	@When("user have to enter Invalid userid and Valid password")
	public void user_have_to_enter_Invalid_userid_and_Valid_password(io.cucumber.datatable.DataTable d) {
		
		List<List<String>> asl = d.asLists();
		String email = asl.get(1).get(0);
		String pass = asl.get(1).get(2);
		
		System.out.println(email);
		System.out.println(pass);
		
		p = new PojoLogin();
		
		
		toEnterText(p.getTxtEmail(), email);
		toEnterText(p.getTxtPass(), pass);   
	}
	

@When("user have to enter the Invalid userid and Invalid password")
public void user_have_to_enter_the_Invalid_userid_and_Invalid_password(io.cucumber.datatable.DataTable d) {
	
	Map<String, String> mp = d.asMap(String.class, String.class);
	String email = mp.get("email");
	String pass = mp.get("username");
	
	System.out.println(email);
	System.out.println(pass);
	
	p = new PojoLogin();
	
	toEnterText(p.getTxtEmail(), email);
	toEnterText(p.getTxtPass(), pass);  
	
	
   
}

@When("user have to enter the Invalid userid and Valid pasword")
public void user_have_to_enter_the_Invalid_userid_and_Valid_pasword(io.cucumber.datatable.DataTable d) {
	
	List<Map<String, String>> mp = d.asMaps();
	String email = mp.get(2).get("email");
	String pass = mp.get(1).get("password");
	
	System.out.println(email);
	System.out.println(pass);
	
	p = new PojoLogin();
	
	toEnterText(p.getTxtEmail(), email);
	toEnterText(p.getTxtPass(), pass);  
	
	
	    
}

}
