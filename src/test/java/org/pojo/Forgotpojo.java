package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpojo extends BaseClass {

	public Forgotpojo() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotBtn;
	
	@FindBy(xpath="//a[contains(text(),'Try Again')]")
	private WebElement tryAgain;
	
	@FindBy(xpath="//input[@placeholder='Email address or mobile number']")
	private WebElement searchBox;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement searchBtn;

	public WebElement getForgotBtn() {
		return forgotBtn;
	}

	public WebElement getTryAgain() {
		return tryAgain;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	

}


