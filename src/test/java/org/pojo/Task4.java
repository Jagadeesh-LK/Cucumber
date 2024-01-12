package org.pojo;
import java.io.IOException;

import org.baseclass.BaseClass;

public class Task4 extends BaseClass {
public static void main(String[] args) throws IOException {
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
toEnterText(p.getFirst(),readFromExcel1("Adactin", "Login", 1, 1) );
toEnterText(p.getLast(),readFromExcel1("Adactin", "Login", 2, 1));
toEnterText(p.getAdd(),readFromExcel1("Adactin", "Login", 3, 1));
toEnterText(p.getNum(),readFromExcel1("Adactin", "Login", 4, 1) );
toEnterText(p.getNum(), "1234567891234567");
toClick(p.getType());
toClick(p.getExpress());
toClick(p.getMonth());
toClick(p.getJan());
toClick(p.getYear());
toClick(p.getYee());
toEnterText(p.getCvv(), readFromExcel1("Adactin", "Login", 5, 1));
toClick(p.getBook());
}
}
