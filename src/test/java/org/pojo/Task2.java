package org.pojo;



import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 extends BaseClass {
public static void main(String[] args) {
WebDriverManager.edgedriver().setup();
driver = new EdgeDriver();
launchUrl("https://demoqa.com/register");
maximizeBrowser();
PojoLogin1 l = new PojoLogin1();
WebElement firstName = l.getFirstName();
toEnterText(firstName, "JAGADEESHAN");
WebElement lastName = l.getLastName();
toEnterText(lastName, "KUMARAN");
WebElement userName = l.getUserName();
toEnterText(userName, "JK006");
WebElement password = l.getPassword();
toEnterText(password, "jagadeesh");
//WebElement captcha = l.getCaptcha();
//toClick(captcha);
//WebElement register = l.getRegister();
//toClick(register);
}

}
