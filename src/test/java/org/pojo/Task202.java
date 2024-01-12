package org.pojo;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
public class Task202 extends BaseClass {
public static void main(String[] args) throws IOException {
loadBrowserEdge();
launchUrl("https://demoqa.com/register");
maximizeBrowser();
PojoLogin1 p = new PojoLogin1();
WebElement firstN = p.getFirstName();
toEnterText(firstN, readFromExcel1("Demo Register", "task1", 1, 1));
WebElement lastN = p.getLastName();
toEnterText(lastN, readFromExcel1("Demo Register", "task1", 2, 1));
WebElement userN = p.getUserName();
toEnterText(userN, readFromExcel1("Demo Register", "task1", 3, 1));
WebElement passW = p.getPassword();
toEnterText(passW, readFromExcel1("Demo Register", "task1", 4, 1));
}
}
