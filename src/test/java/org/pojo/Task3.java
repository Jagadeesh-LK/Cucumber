package org.pojo;

import org.baseclass.BaseClass;

public class Task3 extends BaseClass{
public static void main(String[] args) {
loadBrowserEdge();
launchUrl("https://adactinhotelapp.com/");
maximizeBrowser();
PojoLogin2 p = new PojoLogin2();
toEnterText(p.getUser(),"Jagak0013" );
toEnterText(p.getPass(),"JK0066" );
toClick(p.getLogin());
toClick(p.getLoc());
toClick(p.getSyd());
toClick(p.getHot());
toClick(p.getHo());
toClick(p.getRoom());
toClick(p.getStan());
toClick(p.getRo());
toClick(p.getOne());
toEnterText(p.getDatep(),"15/10/2023" );
toEnterText(p.getDatepi(),"16/10/2023" );
toClick(p.getAdult());
toClick(p.getOn());
toClick(p.getChild());
toClick(p.getOnee());
toClick(p.getChild());
toClick(p.getSub());
toClick(p.getRadio());
toClick(p.getCont());
toEnterText(p.getFirst(),"Jagadeesh" );
toEnterText(p.getLast(),"Kumaran" );
toEnterText(p.getAdd(),"Ranipet" );
toEnterText(p.getNum(),"9876543219" );
toEnterText(p.getNum(), "1234567891234567");
toClick(p.getType());
toClick(p.getExpress());
toClick(p.getMonth());
toClick(p.getJan());
toClick(p.getYear());
toClick(p.getYee());
toEnterText(p.getCvv(), "123");
toClick(p.getBook());
}
}
