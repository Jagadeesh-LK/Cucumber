package org.run1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\91848\\eclipse-workspace\\Cucumber\\src\\test\\resources\\feature3\\lo.feature",glue="org.step",dryRun=false,monochrome=true,strict=true)

public class Run1 {

}
