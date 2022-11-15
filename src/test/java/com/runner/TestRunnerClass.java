package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@smoke",features = "src\\test\\resources\\feature", glue = "com.Stepdefinition", dryRun = false, monochrome = true)
public class TestRunnerClass {
	

}
