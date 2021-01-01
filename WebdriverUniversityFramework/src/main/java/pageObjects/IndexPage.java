package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IndexPage extends BasePage {

	public IndexPage() throws IOException {
		super();
	}

	public @FindBy(css = "div.col-md-12 a#button-clicks") WebElement buttonClicksButton;
	
	public IndexPage clickButton(WebElement element) throws IOException {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		return new IndexPage();
	}
	
}