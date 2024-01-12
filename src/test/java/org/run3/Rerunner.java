package org.run3;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step1.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="@Rerun\\failed.txt",glue="org.step1",dryRun=false,monochrome=true,
plugin={"rerun:C:\\Users\\91848\\eclipse-workspace\\Cucumber\\Rerun\\failed.txt"})

public class Rerunner {
	
	@AfterClass
	public static void report() {
		JvmReport.generateJvmReport(System.getProperty("C:\\Users\\91848\\eclipse-workspace\\Cucumber\\Allreport\\JsonReport\\fb.json"));

	}


}
