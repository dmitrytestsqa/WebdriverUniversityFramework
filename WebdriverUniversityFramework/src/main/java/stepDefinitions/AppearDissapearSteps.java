package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AppearDissapearSteps extends DriverFactory{
	
	@Given("^User opens index page and clicks on the AccordionTextAffects button$")
	public void user_opens_index_page_and_clicks_on_the_AccordionTextAffects_button() throws Throwable {
		getDriver().get("http://webdriveruniversity.com/");
		indexPage.clickButton(indexPage.accordionButton);
		
	}

	@When("^User clicks on the Manual testing button$")
	public void user_clicks_on_the_Manual_testing_button() throws Throwable {
		appearDissapearPage.returnToChildWindow();
		appearDissapearPage.clickButton(appearDissapearPage.manualTestinfButton);
	}

	@Then("^User sees special text for Manual testing button$")
	public void user_sees_special_text_for_Manual_testing_button() throws Throwable {
		Assert.assertEquals(true, appearDissapearPage.textIsActive(appearDissapearPage.manualTestingActive));
	}

	@When("^User clicks on the Cucumber BDD button$")
	public void user_clicks_on_the_Cucumber_BDD_button() throws Throwable {
		appearDissapearPage.clickButton(appearDissapearPage.cucumberButton);
	}

	@Then("^User sees special text for Cucumber BDD button$")
	public void user_sees_special_text_for_Cucumber_BDD_button() throws Throwable {
		appearDissapearPage.textIsActive(appearDissapearPage.cucumberButton);
	}

	@When("^User clicks on the Automation testing button$")
	public void user_clicks_on_the_Automation_testing_button() throws Throwable {
		appearDissapearPage.clickButton(appearDissapearPage.automationButton);
	}

	@Then("^User sees special text for Automation testing button$")
	public void user_sees_special_text_for_Automation_testing_button() throws Throwable {
		appearDissapearPage.textIsActive(appearDissapearPage.automationButton);
	}

	@When("^User clicks on the Keep clicking button$")
	public void user_clicks_on_the_Keep_clicking_button() throws Throwable {
		appearDissapearPage.clickButton(appearDissapearPage.keepClickingButton);
	}

	@Then("^User sees special text for Keep clicking button$")
	public void user_sees_special_text_for_Keep_clicking_button() throws Throwable {
		appearDissapearPage.textIsActive(appearDissapearPage.keepClickingButton);
	}
}