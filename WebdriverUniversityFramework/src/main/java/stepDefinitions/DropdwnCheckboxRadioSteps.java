package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class DropdwnCheckboxRadioSteps extends DriverFactory{

	@Given("^User goes to the Index page and clicks DropdownCheckboxRadio link$")
	public void user_goes_to_the_Index_page_and_clicks_DropdownCheckboxRadio_link() throws Throwable {
		getDriver().get("http://webdriveruniversity.com/");
		indexPage.clickButton(indexPage.dropDownLink);
	}

	@When("^User chooses Java, JUnit and JavaScript values in the Dropdown section$")
	public void user_chooses_Java_JUnit_and_JavaScript_values_in_the_Dropdown_section() throws Throwable {
		dropdwnCheckboxRadio.returnToChildWindow();
		dropdwnCheckboxRadio.selectInDropDown(dropdwnCheckboxRadio.javaOption, dropdwnCheckboxRadio.junitOption, dropdwnCheckboxRadio.frontEndOption, "JAVA", "JUnit", "JavaScript");
	}

	@Then("^User can see chosen values in the Dropdown section$")
	public void user_can_see_chosen_values_in_the_Dropdown_section() throws Throwable {
		dropdwnCheckboxRadio.verifyDropdownValuesAreSelected(dropdwnCheckboxRadio.choosenJava, dropdwnCheckboxRadio.choosenJUnit, dropdwnCheckboxRadio.choosenJavaScript);
	}

	@When("^User chooses option(\\d+) and option(\\d+) in the Checkbox section$")
	public void user_chooses_option_and_option_in_the_Checkbox_section(int arg1, int arg2) throws Throwable {
		dropdwnCheckboxRadio.selectInCheckBox(dropdwnCheckboxRadio.option1, dropdwnCheckboxRadio.option3, dropdwnCheckboxRadio.option4); 
	}

	@Then("^User can see chosen option(\\d+) and option(\\d+) in the Checkbox section$")
	public void user_can_see_chosen_option_and_option_in_the_Checkbox_section(int arg1, int arg2) throws Throwable {
		dropdwnCheckboxRadio.verifyCheckboxValuesSelected(dropdwnCheckboxRadio.option1, dropdwnCheckboxRadio.option4);
	}

	@When("^User choose blue and orange values in the Radio buttons section$")
	public void user_choose_blue_and_orange_values_in_the_Radio_buttons_section() throws Throwable {
		
	}

	@Then("^User can see Blue and Orange chosen values in the Radio buttons section$")
	public void user_can_see_Blue_and_Orange_chosen_values_in_the_Radio_buttons_section() throws Throwable {
		
	}

	@When("^User select Pumpkin and Grape values in the SelectedDisabled section$")
	public void user_select_Pumpkin_and_Grape_values_in_the_SelectedDisabled_section() throws Throwable {
		
	}

	@Then("^User can see selected Pumpkin and Grape values$")
	public void user_can_see_selected_Pumpkin_and_Grape_values() throws Throwable {
		
	}

	
}
