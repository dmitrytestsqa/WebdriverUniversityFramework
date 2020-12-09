package stepDefinitions;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ProductsSteps extends DriverFactory{
	
	@Given("^user goes to the \"([^\"]*)\" webdriveruniversity$")
	public void user_goes_to_the_webdriveruniversity(String arg1) throws Throwable {
		getDriver().get(arg1);
	}

	@When("^user clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String selector) throws Throwable {
		getDriver().findElement(By.cssSelector(selector)).click();
	}

	@Then("^user presented with a promo alert$")
	public void user_presented_with_a_promo_alert() {
		getDriver().findElement(By.cssSelector("div.modal-footer button:nth-of-type(1)")).click();
	}
	
}
