package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.DataTable;
import org.junit.Assert;


public class ContactUs_Page extends BasePage {

	 public @FindBy(css = "input[name='first_name']") WebElement textFiels_FirstName;
	 public @FindBy(css = "input[name='last_name']") WebElement textField_Lastame;
	 public @FindBy(css = "input[name='email']") WebElement textField_email;
	 public @FindBy(css = "textarea[name='message']") WebElement textField_comment;
	 public @FindBy(css = "input[value='RESET']") WebElement button_reset;
	 public @FindBy(css = "input[value='SUBMIT']") WebElement submit_button;
	 public @FindBy(css = "div#contact_reply h1") WebElement successfullNotification;
	
	public ContactUs_Page() throws IOException {
		super();
	}
	
	public ContactUs_Page getContactUsPage() throws IOException {
		getDriver().get("http://webdriveruniversity.com/Contact-Us/contactus.html");
		return new ContactUs_Page();
	}
	
	public ContactUs_Page populateFirstName(DataTable data, int row, int column) throws Exception {
		List<List<String>> name = data.raw();
		sendKeysToWebElement(textFiels_FirstName, name.get(row).get(column));
		return new ContactUs_Page();
	}
	
	public ContactUs_Page populateLastName(DataTable arg1, int row, int column) throws Exception {
		List<List<String>> data = arg1.raw();
		sendKeysToWebElement(textField_Lastame, data.get(row).get(column));
		return new ContactUs_Page();
	}
	
	public ContactUs_Page populateEmail (DataTable email, int row, int column) throws Exception {
		List<List<String>> data = email.raw();
		sendKeysToWebElement(textField_email, data.get(row).get(column));
		return new ContactUs_Page();
	}
	
	public ContactUs_Page populateComment (DataTable comment, int row, int column) throws Exception {
		List<List<String>> data = comment.raw();
		sendKeysToWebElement(textField_comment, data.get(row).get(column));
		return new ContactUs_Page();
	}
	
	public ContactUs_Page clickOnSubmitButton() throws Exception {
		waitAndClickElement(submit_button);
		return new ContactUs_Page();
	}
	
	public ContactUs_Page successfullSubmissionNotification() throws Exception {
		WebElement thanksMessage = getDriver().findElement(By.cssSelector("div#contact_reply h1"));
		WaitUntilWebElementIsVisible(successfullNotification);
		Assert.assertEquals("thankyouforyourmessage!", thanksMessage.getText().toLowerCase().replace(" ", ""));
		return new ContactUs_Page();
	}
}