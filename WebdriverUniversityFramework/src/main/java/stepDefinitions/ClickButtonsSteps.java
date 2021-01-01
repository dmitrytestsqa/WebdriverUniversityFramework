package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ClickButtonsSteps extends DriverFactory{

	@Given("^User goes to the WebDrverUniversity index page$")
	public void user_goes_to_the_WebDrverUniversity_index_page() throws Throwable {
		getDriver().get("http://webdriveruniversity.com/");
	}

	@When("^User clicks button clics link$")
	public void user_clicks_button_clics_link() throws Throwable {
		indexPage.clickButton(indexPage.buttonClicksButton);
	}

	@And("^User clicks WebElement button$")
	public void user_clicks_WebElement_button() throws Throwable {
		clickButtonsPage.returnToChildWindow();
		clickButtonsPage.buttonClick(clickButtonsPage.webElementClickButton);
	}

	@Then("^User sees congratulation message for WebElement button$")
	public void user_sees_congratulation_message_for_WebElement_button() throws Throwable {
		clickButtonsPage.validateAlertMessageAndClose(clickButtonsPage.webElementMessage, clickButtonsPage.webElementNotification, clickButtonsPage.webElementModalCloseButton);
	}

	@When("^User clicks JavaScript button$")
	public void user_clicks_JavaScript_button() throws Throwable {
		clickButtonsPage.jsButtonClick(clickButtonsPage.javaScriptClickButton);
	}

	@Then("^User sees congratulation message for JavaScript button$")
	public void user_sees_congratulation_message_for_JavaScript_button() throws Throwable {
		clickButtonsPage.validateAlertMessageAndClose(clickButtonsPage.javaScriptMessage, clickButtonsPage.javaScriptNotification, clickButtonsPage.javaScriptModalCloseButton);
		clickButtonsPage.jsButtonClick(clickButtonsPage.javaScriptModalCloseButton);
	}

	@When("^User clicks ActionMove&Click button$")
	public void user_clicks_ActionMove_Click_button() throws Throwable {
		clickButtonsPage.jsButtonClick(clickButtonsPage.actionMoveClickButton);
	}

	@Then("^User sees congratulation message for ActionMove&Click button$")
	public void user_sees_congratulation_message_for_ActionMove_Click_button() throws Throwable {
		clickButtonsPage.validateAlertMessageAndClose(clickButtonsPage.actionMoveMessage, clickButtonsPage.actionMoveNotification, clickButtonsPage.moveClickModalCloseButton);
	}
	
}