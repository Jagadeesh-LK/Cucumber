package org.pojo;


import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoLogin1 extends BaseClass {

public PojoLogin1() {
PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//input[@placeholder='First Name']")
private WebElement firstName;
@FindBy(xpath = "//input[@placeholder='Last Name']")
private WebElement lastName;
@FindBy(xpath = "//input[@placeholder='UserName']")
private WebElement userName;
@FindBy(xpath = "//input[@placeholder='Password']")
private WebElement password;
//@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
//private WebElement captcha;
//@FindBy(xpath = "//button[text()='Register']")
//private WebElement register;

public WebElement getFirstName() {
return firstName;
}

public WebElement getLastName() {
return lastName;
}

public WebElement getUserName() {
return userName;
}

public WebElement getPassword() {
return password;
}

//public WebElement getCaptcha() {
//return captcha;
//}

//public WebElement getRegister() {
//return register;
//}
}