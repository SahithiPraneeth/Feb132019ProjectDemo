package testrunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\karan_workspace\\CucumberProject\\src\\test\\java\\featurefolder1", 
	glue= {"stepdefs1"}, plugin= {"pretty", "json:target/cucumber-reports/Cucumber.json"}, 
	monochrome= true)

public class TestRunner {

}
