 package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features="Features",
		glue={"StepDefintions","Hooks"},
		dryRun=false
		//plugin= {"json:test-output/jsonreport.json",
		//		"pretty","html:test-output/html-",
		//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				)
public class TestRun {
	
	

}
