package org.run2;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step1.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\91848\\eclipse-workspace\\Cucumber\\src\\test\\resources\\feature4",glue="org.step1",dryRun=false,monochrome=true,
plugin={"pretty","html:C:\\Users\\91848\\eclipse-workspace\\Cucumber\\Allreport\\HtmlReport",
		"json:C:\\Users\\91848\\eclipse-workspace\\Cucumber\\Allreport\\JsonReport\\fb.json",
		"junit:C:\\Users\\91848\\eclipse-workspace\\Cucumber\\Allreport\\JunitReport\\face.xml"})

public class Run2 {
	
	@AfterClass
	public static void report() {
		JvmReport.generateJvmReport(System.getProperty("C:\\Users\\91848\\eclipse-workspace\\Cucumber\\Allreport\\JsonReport\\fb.json"));

	}

}
