package org.pojo;


import org.baseclass.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 extends BaseClass {
public static void main(String[] args) {
WebDriverManager.edgedriver().setup();
driver = new EdgeDriver();
launchUrl("https://www.facebook.com/");
maximizeBrowser();
PojoLogin l = new PojoLogin();
WebElement user = l.getTxtEmail();
toEnterText(user, "jaga@gmail.com");
WebElement password = l.getTxtPass();
toEnterText(password, "jaga006");
WebElement login = l.getBtnLogin();
toClick(login);
}

}