package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoAmazon extends BaseClass {
	
	public PojoAmazon() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	private WebElement signIn;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement phoneNo;
	
	@FindBy(id="continue")
	private WebElement contin;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(id="signInSubmit")
	private WebElement submit;

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getContin() {
		return contin;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
