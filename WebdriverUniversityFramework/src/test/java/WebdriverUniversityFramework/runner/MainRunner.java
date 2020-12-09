package WebdriverUniversityFramework.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"C:\\Users\\Dmitry\\git\\repository2\\WebdriverUniversityFramework\\src\\test\\java\\WebdriverUniversityFramework\\features"},
		glue = {"stepDefinitions"},
		dryRun = false,
		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"},
		monochrome = true
				)

public class MainRunner {

}