package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Mahesh Mohan\\Documents\\Automation\\POC1\\POC1\\poc1\\src\\main\\java\\Features\\login.feature",
		glue={"StepDefinitions"} )
	
public class TestRunner {

}
