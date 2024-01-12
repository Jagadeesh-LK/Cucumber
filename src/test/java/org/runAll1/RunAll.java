package org.runAll1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\91848\\eclipse-workspace\\Cucumber\\src\\test\\resources\\feature2\\login.feature",glue="org.stepdefinition")

public class RunAll {

}
