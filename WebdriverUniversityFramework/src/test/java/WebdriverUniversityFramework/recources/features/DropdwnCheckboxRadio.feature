Feature: Dropdown, checkboxes, radio buttons and selected/deselect are work correctly

Scenario: User goes to the Dropdown Menu(s), Checkboxe(s) & Radio Button(s) page and verify that all sections work correctly
Given User goes to the Index page and clicks DropdownCheckboxRadio link
When User chooses Java, JUnit and JavaScript values in the Dropdown section
Then User can see chosen values in the Dropdown section
When User chooses option1 and option4 in the Checkbox section
Then User can see chosen option1 and option4 in the Checkbox section
When User choose blue and orange values in the Radio buttons section
Then User can see Blue and Orange chosen values in the Radio buttons section
When User select Pumpkin and Grape values in the SelectedDisabled section
Then User can see selected Pumpkin and Grape values