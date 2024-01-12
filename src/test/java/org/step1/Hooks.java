package org.step1;

import org.baseclass.BaseClass;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BaseClass {

	@Before
	public void bef() {

		System.out.println("started");
		loadBrowserChrome();
		maximizeBrowser();
		applyWaitsToAllElements();

	}

	@Before(order=1)
	public void bef1() {
		System.out.println("bef1 started...");
	}

	@Before(order=2)
	public void bef3() {
		System.out.println("bef3 started...");

	}

	@Before(order=3)
	public void bef2() {
		System.out.println("bef2 started...");

	}

	@After
	public void aft() {

		System.out.println("ended");
	}
	
	@After(order=3)
	public void aft1() {
		
		System.out.println("aft1 ended...");
		
	}
	
	@After(order=2)
	public void aft2() {
		
		System.out.println("aft2 ended...");
		
	}
	
	@After(order=1)
	public void aft3() {
		
		System.out.println("aft3 ended...");
		
	}
	
	@AfterClass
	public static void aftexecute(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot t = (TakesScreenshot) driver;
			byte[] screen = t.getScreenshotAs(OutputType.BYTES);
			s.embed(screen, "image/png");
			
		}
		
		closeBrowser();
	}

}
