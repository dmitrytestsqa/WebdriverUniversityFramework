package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.DataTable;

public class Products_Page extends BasePage{

	public @FindBy (css = "div#container-special-offers div.section-title p") WebElement buttonSpecialOffers;
	public @FindBy (css = "div#container-product4 p") WebElement buttonGameConsoles;
	public @FindBy (css = "div.modal-footer button:nth-of-type(1)") WebElement buttonProceedPopUp;
	public @FindBy (css = "div.modal-body b") WebElement voucherNumber;
	public @FindBy (css = "div.modal-footer button:nth-of-type(1)") WebElement proceedButton;
	
	public Products_Page() throws IOException {
		super();
	}
	
	public Products_Page userOpensWebdriveruniversity(String url) throws IOException {
		getDriver().get(url);
		return new Products_Page();
	}
	
	public Products_Page clickonGameConsolesButton() throws Exception {
		waitAndClickElement(buttonGameConsoles);
		return new Products_Page();
	}
	
	public Products_Page validateAlertMessage() throws Exception{
		WaitUntilWebElementIsVisible(voucherNumber);
		Assert.assertTrue(voucherNumber.getText().toString().contains("NEWCUSTOMER"));
		waitAndClickElement(proceedButton);
		return new Products_Page();
	}
}