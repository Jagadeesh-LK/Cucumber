package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PojoLogin2 extends BaseClass {
public PojoLogin2() {
PageFactory.initElements( driver, this);
}
@FindBy(id="username")
private WebElement user;
@FindBy(id="password")
private WebElement pass;
@FindBy(id="login")
private WebElement login;
@FindBy(id="location")
private WebElement loc;
@FindBy(xpath="//option[text()='Sydney']")
private WebElement Syd;
@FindBy(id="hotels")
private WebElement hot;
@FindBy(xpath="//option[text()='Hotel Creek']")
private WebElement Ho;
@FindBy(id="room_type")
private WebElement room;
@FindBy(xpath="//option[text()='Standard']")
private WebElement Stan;
@FindBy(id="room_nos")
private WebElement ro;
@FindBy(xpath="(//option[text()='1 - One'])[1]")
private WebElement One;
@FindBy(id="datepick_in")
private WebElement datep;
@FindBy(id="datepick_out")
private WebElement datepi;
@FindBy(id="adult_room")
private WebElement adult;
@FindBy(xpath="(//option[text()='1 - One'])[2]")
private WebElement On;
@FindBy(id="child_room")
private WebElement child;
@FindBy(xpath="(//option[text()='1 - One'])[3]")
private WebElement Onee;
@FindBy(id="Submit")
private WebElement Sub;
@FindBy(id="radiobutton_0")
private WebElement radio;
@FindBy(id="continue")
private WebElement cont;
@FindBy(id="first_name")
private WebElement first;
@FindBy(id="last_name")
private WebElement last;
@FindBy(id="address")
private WebElement add;
@FindBy(id="cc_num")
private WebElement num;
@FindBy(id="cc_type")
private WebElement type;
@FindBy(xpath="//option[text()='American Express']")
private WebElement Express;
@FindBy(id="cc_exp_month")
private WebElement month;
@FindBy(xpath="//option[text()='January']")
private WebElement Jan;
@FindBy(id="cc_exp_year")
private WebElement year;
@FindBy(xpath="//option[text()='2030']")
private WebElement yee;
@FindBy(id="cc_cvv")
private WebElement cvv;
@FindBy(id="book_now")
private WebElement book;
public WebElement getUser() {
return user;
}
public WebElement getPass() {
return pass;
}
public WebElement getLogin() {
return login;
}
public WebElement getLoc() {
return loc;
}
public WebElement getSyd() {
return Syd;
}
public WebElement getHot() {
return hot;
}
public WebElement getHo() {
return Ho;
}
public WebElement getRoom() {
return room;
}
public WebElement getStan() {
return Stan;
}
public WebElement getRo() {
return ro;
}
public WebElement getOne() {
return One;
}
public WebElement getDatep() {
return datep;
}
public WebElement getDatepi() {
return datepi;
}
public WebElement getAdult() {
return adult;
}
public WebElement getOn() {
return On;
}
public WebElement getChild() {
return child;
}
public WebElement getOnee() {
return Onee;
}
public WebElement getSub() {
return Sub;
}
public WebElement getRadio() {
return radio;
}
public WebElement getCont() {
return cont;
}
public WebElement getFirst() {
return first;
}
public WebElement getLast() {
return last;
}
public WebElement getAdd() {
return add;
}
public WebElement getNum() {
return num;
}
public WebElement getType() {
return type;
}
public WebElement getExpress() {
return Express;
}
public WebElement getMonth() {
return month;
}
public WebElement getJan() {
return Jan;
}
public WebElement getYear() {
return year;
}
public WebElement getYee() {
return yee;
}
public WebElement getCvv() {
return cvv;
}
public WebElement getBook() {
return book;
}
}
