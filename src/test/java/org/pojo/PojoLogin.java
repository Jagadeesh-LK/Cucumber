package org.pojo;


import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoLogin extends BaseClass {
public PojoLogin() {
PageFactory.initElements(driver, this);
}
@CacheLookup
@FindBy(id = "email")
private WebElement txtEmail;
@CacheLookup
@FindBy(name = "pass")
private WebElement txtPass;
@CacheLookup
@FindBy(name = "login")
private WebElement btnLogin;

public WebElement getTxtEmail() {
return txtEmail;
}

public WebElement getTxtPass() {
return txtPass;
}

public WebElement getBtnLogin() {
return btnLogin;
}

}
