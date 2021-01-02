package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.DriverFactory;

public class AppearDissapearPage extends DriverFactory {
	
	public AppearDissapearPage() {
		super();
	}

	public @FindBy (css = "button#manual-testing-accordion") WebElement manualTestinfButton;
	public @FindBy (css = "div.col-lg-12 button[class='accordion active']") WebElement manualTestingActive;
	public @FindBy (css = "button#cucumber-accordion") WebElement cucumberButton;
	public @FindBy (css = "button#automation-accordion") WebElement automationButton;
	public @FindBy (css = "button#click-accordion") WebElement keepClickingButton;
	public @FindBy (xpath = "//p[text()='LOADING COMPLETE.']") WebElement loading;
	
	public void returnToChildWindow() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		Iterator<String> i1 = child.iterator();
		
		while (i1.hasNext()) {
	          String ChildWindow = i1.next();
	          if (!parent.equalsIgnoreCase(ChildWindow)) {
	              driver.switchTo().window(ChildWindow);
	           }
	       }
	}
	
	public void clickButton(WebElement button) {
		wait.until(ExpectedConditions.visibilityOf(loading));
		button.click();
	}
	
	public boolean textIsActive(WebElement element) {
		if(wait.until(ExpectedConditions.attributeContains(element, "class", "accordion active"))) {
			return true;
		} else {
			return false;
		}
	}
		
}