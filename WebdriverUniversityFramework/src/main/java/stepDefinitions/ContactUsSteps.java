package stepDefinitions;
import java.io.IOException;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ContactUsSteps extends DriverFactory {
	
	@Given("^User goes to the webdriveruniversity contact us form$")
	public void user_goes_to_the_webdriveruniversity_contact_us_form() throws IOException {
	    contactusPage.getContactUsPage();
	}

	@When("^User populates his Username$")
	public void user_populates_his_Username(DataTable data) throws Exception {
		contactusPage.populateFirstName(data, 0, 0);
	}

	@And("^User populates his Last Name$")
	public void user_populates_his_Last_Name(DataTable data) throws Exception {
		contactusPage.populateLastName(data, 0, 1);
	}

	@And("^User populates his email$")
	public void user_populates_his_email(DataTable data) throws Exception {
		contactusPage.populateEmail(data, 0, 0);
	}

	@And("^User leaves comment$")
	public void user_leaves_comment(DataTable data) throws Exception {
		contactusPage.populateComment(data, 0, 1);
	}

	@When("^User clicks Submit button$")
	public void user_clicks_Submit_button() throws Exception {
		contactusPage.clickOnSubmitButton();
	}

	@Then("^Message about successfull submittion is displaing$")
	public void message_about_successfull_submittion_is_displaing() throws Exception {
		contactusPage.successfullSubmissionNotification();
	}
	
}