package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Feature", glue="stepdefinition")
public class Runner extends AbstractTestNGCucumberTests {

	
    }