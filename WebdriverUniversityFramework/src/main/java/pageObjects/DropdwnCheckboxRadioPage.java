package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.DriverFactory;

public class DropdwnCheckboxRadioPage extends DriverFactory{

	public DropdwnCheckboxRadioPage() {
		super();
	}
	
	public @FindBy(css="select#dropdowm-menu-1") WebElement javaOption;
	public @FindBy(css="select#dropdowm-menu-2") WebElement junitOption;
	public @FindBy(css="select#dropdowm-menu-3") WebElement frontEndOption;
	
	public @FindBy(css = "option[value='java']") WebElement choosenJava;
	public @FindBy(css = "option[value='junit']") WebElement choosenJUnit;
	public @FindBy(css = "option[value='javascript']") WebElement choosenJavaScript;
	
	//Checkboxes
	public @FindBy(css="input[value='option-1']") WebElement option1;
	public @FindBy(css="input[value='option-3']") WebElement option3;
	public @FindBy(css="input[value='option-4']") WebElement option4;
	
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
	
	public void selectInDropDown(WebElement element1, WebElement element2, WebElement element3, String value1, String value2, String value3) throws InterruptedException {
		Select programmingLanguage = new Select(element1);
		programmingLanguage.selectByVisibleText(value1);
		Select testFram = new Select(element2);
		testFram.selectByVisibleText(value2);
		Select frontEnd = new Select(element3);
		frontEnd.selectByVisibleText(value3);
	}
	
	public boolean verifyDropdownValuesAreSelected(WebElement element1, WebElement element2, WebElement element3) {
		if(element1.isSelected() || element2.isSelected() || element3.isSelected()) {
			return true;
		} else { 
			return false; 
		}
	}
	
	public void selectInCheckBox(WebElement element1, WebElement element3, WebElement element4) {
		element1.click();
		element3.click();
		element4.click();
	}
	
	public boolean verifyCheckboxValuesSelected(WebElement element1, WebElement element4) {
		if(element1.isSelected() || element4.isSelected()) {
			return true;
		} else {
			return false;
		}
	}
	
}
