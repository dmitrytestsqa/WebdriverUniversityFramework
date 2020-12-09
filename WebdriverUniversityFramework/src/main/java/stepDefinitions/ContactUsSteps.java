package stepDefinitions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import utils.DriverFactory;

public class ContactUsSteps extends DriverFactory {
	
	@Given("^User goes to the webdriveruniversity contact us form$")
	public void user_goes_to_the_webdriveruniversity_contact_us_form() {
	    getDriver().get("http://webdriveruniversity.com/Contact-Us/contactus.html");
	}

	@When("^User populates his Username$")
	public void user_populates_his_Username(DataTable arg1) {
		List<List<String>> name = arg1.raw();
		getDriver().findElement(By.cssSelector("input[name=first_name]")).sendKeys(name.get(0).get(0));
	}

	@And("^User populates his Last Name$")
	public void user_populates_his_Last_Name(DataTable arg1) {
		List<List<String>> lastName = arg1.raw();
		getDriver().findElement(By.cssSelector("input[name*=last]")).sendKeys(lastName.get(0).get(1));
	}

	@And("^User populates his email$")
	public void user_populates_his_email(DataTable arg1) {
	    List<List<String>> email = arg1.raw();
	    getDriver().findElement(By.cssSelector("input[placeholder*=Email]")).sendKeys(email.get(0).get(0));
	}

	@And("^User leaves comment$")
	public void user_leaves_comment(DataTable arg1) {
		List<List<String>> email = arg1.raw();
		getDriver().findElement(By.cssSelector("textarea[name=message]")).sendKeys(email.get(0).get(0));
	}

	@When("^User clicks Submit button$")
	public void user_clicks_Submit_button() {
		getDriver().findElement(By.cssSelector("input[type=submit]")).click();
	}

	@Then("^Message about successfull submittion is displaing$")
	public void message_about_successfull_submittion_is_displaing() {
	    WebElement notification = getDriver().findElement(By.cssSelector("div#contact_reply"));
	    Assert.assertEquals("thank you for your message!", notification.getText().toLowerCase());
	}
	
}