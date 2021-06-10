package pageObjects;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.junit.Assert;

public class ClickButtonsPage extends BasePage{

	public ClickButtonsPage() throws IOException {
		super();
	}
	
	public String webElementMessage = "Congratulations!";
	public String javaScriptMessage = "It/’/s that Easy!! Well I think it is.....";
	public String actionMoveMessage = "Well done! the Action Move & Click can become very useful!";

	public @FindBy (css = "span#button1") WebElement webElementClickButton;
	public @FindBy (css = "span#button2") WebElement javaScriptClickButton;
	public @FindBy (css = "span#button3") WebElement actionMoveClickButton;
	public @FindBy (css = "div#myModalClick * h4") WebElement webElementNotification;
	public @FindBy (css = "div#myModalJSClick * h4") WebElement javaScriptNotification;
	public @FindBy (css = "div#myModalMoveClick * h4") WebElement actionMoveNotification;
	public @FindBy (css = "div#myModalClick div.modal-footer button") WebElement webElementModalCloseButton;
	public @FindBy (css = "div#myModalJSClick div.modal-footer button") WebElement javaScriptModalCloseButton;
	public @FindBy (css = "div#myModalMoveClick div.modal-footer button") WebElement moveClickModalCloseButton;
	
	
	public void returnToChildWindow() throws IOException {
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
	
	public void buttonClick(WebElement element) throws IOException {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public void jsButtonClick(WebElement element) throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].click();", element);
	}
	
	public void actionMoveClick(WebElement element) {
		this.wait.until(ExpectedConditions.elementToBeClickable(element));
		Actions actions = new Actions(getDriver());
		actions.moveToElement(element).click().build();
	}
	
	public void validateAlertMessageAndClose(String notificationMessageWebElement, WebElement notification, WebElement closeButton) throws IOException, InterruptedException {
		this.wait.until(ExpectedConditions.visibilityOf(notification));
		Assert.assertEquals(notification.getText(), notificationMessageWebElement);
		wait.until(ExpectedConditions.elementToBeClickable(closeButton)).click();
	}
	
}