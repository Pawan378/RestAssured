package TestRunner;

import cucumber.api.testng.AbstractTestNGCucumberTests;
//import cucumber.junit.Cucumber;

//import cucumber.testng.CucumberOptions;

@cucumber.api.CucumberOptions(
		features= {"src\\main\\resources"}
		)

public class TestNGRunnerTest extends AbstractTestNGCucumberTests {

}
