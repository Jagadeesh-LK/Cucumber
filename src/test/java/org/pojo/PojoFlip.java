package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoFlip extends BaseClass {
	
	public PojoFlip() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement log;
	
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement otp;
	
	@FindBy(xpath="//span[text()='Please enter valid Email ID/Mobile number']")
	private WebElement error;

	public WebElement getError() {
		return error;
	}

	public WebElement getLog() {
		return log;
	}

	public WebElement getOtp() {
		return otp;
	}

}
