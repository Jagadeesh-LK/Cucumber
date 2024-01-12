package org.baseclass;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.List;
	import java.util.Set;
	
	
	import java.io.FileInputStream;
	
	import java.io.FileOutputStream;
	
	import java.text.SimpleDateFormat;
	import java.util.Date;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.Alert;
	
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;

import io.cucumber.core.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {

		public static WebDriver driver;
		public static Actions action;
		public static Robot r;
		public static Alert a;
		public static JavascriptExecutor js;
		public static Select s;

		public static FileInputStream fin;
		public static Workbook book;
		public static FileOutputStream fos;
		public static Sheet sheet;
		public static Cell c;

		public static String readFromExcel1(String filename,String sheetName, int rowNo, int cellNo) throws IOException {

			File f = new File("C:\\Users\\91848\\eclipse-workspace\\Maven11AM\\DataFiles\\"+filename+".xlsx");
			FileInputStream fin = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(fin);
			Sheet sh = book.getSheet(sheetName);
			Row r = sh.getRow(rowNo);
			Cell c = r.getCell(cellNo);

			int type = c.getCellType();
			String name = "";
			if (type == 1) {
				name = c.getStringCellValue();
			}

			else if (DateUtil.isCellDateFormatted(c)) {
				Date da = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yy");
				name = sim.format(da);

			} else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				String.valueOf(l);
			}
			return name;

		}

		public static void writeExcel1(String filename,String sheetName,int number,int number1,int number2,String name1,String name2 ) throws IOException {
			
			File f = new File("C:\\Users\\91848\\eclipse-workspace\\Maven11AM\\DataFiles\\"+filename+".xlsx");
			Workbook book = new XSSFWorkbook();
			Sheet sh = book.createSheet(sheetName);
			Row r = sh.createRow(number);
			Cell c1 = r.createCell(number1);
			Cell c2 = r.createCell(number2);
			c1.setCellValue(name1);
			c2.setCellValue(name2);
			FileOutputStream fos = new FileOutputStream(f);
			book.write(fos);
			System.out.println("written...");
			
		}
		
		public static void writeExcel2(String filename,String sheetName,int number,int number1,int number2,String name1,String name2) throws IOException {
				
			File f = new File("C:\\Users\\91848\\eclipse-workspace\\Maven11AM\\DataFiles\\"+filename+".xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(fis);
			Sheet sh = book.getSheet(sheetName);
			Row r= sh.createRow(number);
			Cell c1 = r.createCell(number1);
			Cell c2 = r.createCell(number2);
			c1.setCellValue(name1);
			c2.setCellValue(name2);
			FileOutputStream fos = new FileOutputStream(f);
			book.write(fos);
			System.out.println("written...");	
		}
		
		public static void writeExcel3(String sheetName,String name,String name1,String name2,int number,int number1) throws IOException {
			
			File f = new File("C:\\Users\\91848\\eclipse-workspace\\Maven11AM\\DataFiles\\Data.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(fis);
			Sheet sh = book.getSheet(sheetName);
			Row r = sh.getRow(number);
			Cell c = r.getCell(number1);
			String s = c.getStringCellValue();
			
			if (s.startsWith(name)) {
				c.setCellValue(name1);
			} else {
				c.setCellValue(name2);
			}
			
			FileOutputStream fos = new FileOutputStream(f);
			book.write(fos);
			System.out.println("written...");	
		}
		
		public static void getDateAndTime() {
			Date d = new Date();
			System.out.println(d);

		}
		
		public static void loadBrowserChrome() {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		public static void loadBrowserEdge() {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		
		public static void loadBrowserFire() {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		// 1-Launch Url
		public static void launchUrl(String url) {
			driver.get(url);

		}

		// 2-Close Browser
		public static void closeBrowser() {
			driver.close();
		}

		// 3-Quit Browser
		public static void quitBrowser() {
			driver.quit();
		}

		// 4-SendKeys
		public static void toEnterText(WebElement element, String text) {
			element.sendKeys(text);
		}

		// 5-Click
		public static void toClick(WebElement element) {
			element.click();
		}

		// 6-Maximize Browser
		public static void maximizeBrowser() {
			driver.manage().window().maximize();
		}

		// 7-Minimize Browser
		public static void minimizeBrowser() {
			driver.manage().window().maximize();
		}

		// 8-Current Page Title
		public static String currentPageTitle() {
			String title = driver.getTitle();
			return title;
		}

		// 9-Current Page Url
		public static String currentPageUrl() {
			return driver.getCurrentUrl();
		}

		// 10-Existing Text
		public static String existTexts(WebElement element) {
			return element.getText();
		}

		// 11-Entered Text
		public static String attributeValue(WebElement element, String attributeName) {
			return element.getAttribute(attributeName);
		}

		// 12-Move To Element
		public static void moveElement(WebElement element) {
			action.moveToElement(element).perform();
		}

		// 13-Drag And Drop
		public static void dragDrop(WebElement source, WebElement destination) {
			action.dragAndDrop(source, destination);
		}

		// 14-Right Click
		public static void rClick(WebElement element) {
			action.contextClick(element).perform();
		}

		// 15-To Select
		public static void doubleclick(WebElement element) {
			action.doubleClick(element).perform();
		}

		// 16-Key Up
		public static void upKey() {
			action.keyUp(Keys.SHIFT).build().perform();
		}

		// 17-Key Down
		public static void downKey(WebElement element, String text) {
			action.keyDown(Keys.SHIFT).sendKeys(element, text).build().perform();
		}

		// 18-Press Key
		public static void pressKey() {
			try {
				r = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		// 19-Release Key
		public static void releaseKey() {
			try {
				r = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		// 20-Alert Accept
		public static void acceptAlert() {
			driver.switchTo().alert();
			a.accept();
		}

		// 21-Alert Dismiss
		public static void dismissAlert() {
			driver.switchTo().alert();
			a.dismiss();
		}

		// 22-Alert Sendkeys
		public static void sendKeysAlert(String text) {
			driver.switchTo().alert();
			a.sendKeys(text);
			a.accept();
		}

		// 23-Alert GetText
		public static String getTextAlert() {
			driver.switchTo().alert();
			return a.getText();

		}

		// 24-Java Script Set Value
		public static void setValue(WebElement element, String text) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','text')", element);

		}

		// 25-Java Script get Value
		public static Object getValue(WebElement element) {
			js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].getAttribute('value')", element);
		}

		// 26-Java script click
		public static void clickValue(WebElement element) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click", element);
		}

		// 27-Java script Scroll Down
		public static void downScroll(WebElement element) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollintoView(true)", element);
		}

		// 28-Java script Scroll up
		public static void upScroll(WebElement element) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollintoView(false)", element);
		}

		// 29-Java script Style
		public static void style(WebElement element, String text) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','text')", element);
		}

		// 30-Take Screen Shot
		public static void screenShot(String dest) {
			TakesScreenshot t = (TakesScreenshot) driver;
			File sou = t.getScreenshotAs(OutputType.FILE);
			File destin = new File(dest);
			try {
				FileUtils.copyFile(sou, destin);
			} catch (IOException e) {
				
			}
		}

		// 31-Visibility Enabled
		public static boolean iEnabled(WebElement element) {
			return element.isEnabled();
		}

		// 32-Visibility Displayed
		public static boolean iDisplayed(WebElement element) {
			return element.isDisplayed();
		}

		// 33-Visibility Displayed
		public static boolean iSelected(WebElement element) {
			return element.isSelected();
		}

		// 34-Navigate To Url
		public static void toUrl(String text) {
			driver.navigate().to(text);
		}

		// 35-Navigate Forward
		public static void toForward() {
			driver.navigate().forward();
		}

		// 36-Navigate Back
		public static void toBack() {
			driver.navigate().back();
		}

		// 37-Navigate Forward
		public static void toRefresh() {
			driver.navigate().refresh();
		}

		// 38-Frame id
		public static void frameId(String text) {
			driver.switchTo().frame(text);
		}

		// 39-Frame name
		public static void frameName(String text) {
			driver.switchTo().frame(text);
		}

		// 40-Frame Webelement
		public static void frameWebelement(WebElement element) {
			driver.switchTo().frame(element);
		}

		// 41-Frame Index
		public static void frameIndex(int index) {
			driver.switchTo().frame(index);
		}

		// 42-Frame Default Content
		public static void frameDefaultContent() {
			driver.switchTo().defaultContent();
		}

		// 43-Frame Parent
		public static void frameParent() {
			driver.switchTo().parentFrame();
		}

		// 44-Windows Handling Url
		public static void handlingUrl(String text) {
			driver.switchTo().window(text);
		}

		// 45-Windows Handling Title
		public static void handlingTitle(String text) {
			driver.switchTo().window(text);
		}

		// 46-Windows Handling Windowsid
		public static void handlingWindowsid(String text) {
			driver.switchTo().window(text);
		}

		// 47-Windows Handling Window Parent Id
		public static String handlingWindowParentId() {
			String pId = driver.getWindowHandle();
			return pId;
		}

		// 48-Windows Handling Window All Id
		public static Set<String> handlingWindowAllId() {
			Set<String> aId = driver.getWindowHandles();
			return aId;
		}

		// 49-Waits Pause
		public static void pauseExecution(long milliseconds) {
			try {
				Thread.sleep(milliseconds);
			} catch (InterruptedException e) {
				
			}
		}

		// 50-waits To All Elements
		public static void applyWaitsToAllElements() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		// 51-SELECT CLASS BY Value
		public static void byVal(WebElement element, String value) {
			s = new Select(element);
			s.selectByValue(value);
		}

		// 52-SELECT CLASS BY Index
		public static void byInd(WebElement element, int index) {
			s = new Select(element);
			s.selectByIndex(index);
		}

		// 53-SELECT CLASS BY Text
		public static void byTex(WebElement element, String text) {
			s = new Select(element);
			s.selectByVisibleText(text);
			;
		}

		// 54-DESELECT CLASS BY Text
		public static void debyTex(WebElement element, String text) {
			s = new Select(element);
			s.deselectByVisibleText(text);
			;
		}

		// 55-DESELECT CLASS BY Index
		public static void debyInd(WebElement element, int index) {
			s = new Select(element);
			s.deselectByIndex(index);
		}

		// 56-DESELECT CLASS BY Value
		public static void debyVal(WebElement element, String value) {
			s = new Select(element);
			s.deselectByValue(value);
		}

		// 57-DESELECT CLASS BY All
		public static void debyAll(WebElement element) {
			s = new Select(element);
			s.deselectAll();
		}

		// 58-DESELECT CLASS Is Multiple
		public static boolean debyVal(WebElement element) {
			return s.isMultiple();
		}

		// 59-SELECT CLASS All Option
		public static List<WebElement> allOp(WebElement element) {
			s = new Select(element);
			List<WebElement> allOp = s.getOptions();
			return allOp;
		}

		// 60-SELECT CLASS All Select
		public static void allSl(WebElement element) {
			s = new Select(element);
			List<WebElement> allSl = s.getOptions();
			for (WebElement uniSl : allSl) {
				String text = uniSl.getText();
				System.out.println(text);
			}
		}

		// 61-SELECT CLASS First Select
		public static WebElement firstSel(WebElement element) {
			s = new Select(element);
			WebElement option = s.getFirstSelectedOption();
			return option;
		}
		
		@AfterClass
		public static void screen(Scenario s) {
			
			if (s.isFailed()) {
				
				TakesScreenshot t = (TakesScreenshot) driver;
				byte[] screen = t.getScreenshotAs(OutputType.BYTES);
				s.embed(screen, "image/png");
				
			}
	}
		
	}



