package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import utils.DriverFactory;


public class MaterHooks extends DriverFactory{

	@Before
	public void setup() {
		driver = getDriver();
	}
	
	@After
	public void shutDown() {
		if(driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}
}
