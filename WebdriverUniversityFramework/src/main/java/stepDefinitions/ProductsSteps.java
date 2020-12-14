package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ProductsSteps extends DriverFactory{
	
	@Given("^user goes to the \"([^\"]*)\" webdriveruniversity$")
	public void user_goes_to_the_webdriveruniversity(String url) throws Throwable {
		productsPage.userOpensWebdriveruniversity(url);
	}

	@When("^user clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String selector) throws Exception {
		productsPage.clickonGameConsolesButton();
	}

	@Then("^user presented with a promo alert$")
	public void user_presented_with_a_promo_alert() throws Exception {
		productsPage.validateAlertMessage();
	}
	
}