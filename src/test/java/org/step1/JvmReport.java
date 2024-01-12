package org.step1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static  void generateJvmReport(String jsonPath) {
		
		File f = new File(System.getProperty("C:\\Users\\91848\\eclipse-workspace\\Cucumber\\Allreport\\JvmReport"));
		
		Configuration c = new Configuration(f, "Facebook Application");
		c.addClassifications("Plotform", "Window");
		c.addClassifications("Sprint", "123");
		c.addClassifications("Jdk version", "1.8");
		
		List<String> l = new ArrayList<String>();
		l.add(jsonPath);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();

	}

}
