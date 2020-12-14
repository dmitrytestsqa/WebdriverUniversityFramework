package stepDefinitions;

import cucumber.api.java.Before;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import utils.DriverFactory;


public class MaterHooks extends DriverFactory{
	
	@Before
	public void setup() {
		driver = getDriver();
	}
	
	@After
	public void tearDownAndScreenshotOnFailure(Scenario scenario) {
		try {
			if(driver != null && scenario.isFailed()) {
				scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
			if(driver != null) {
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
		} catch (Exception e) {
			System.out.println("Methods failed: tearDownAndScreenshotOnFailure" + e.getLocalizedMessage());
		}
	}
}