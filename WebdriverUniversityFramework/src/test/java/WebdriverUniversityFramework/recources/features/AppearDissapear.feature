Feature: Accordion buttons are clickable and work correctly

Scenario: User goes to the Accordion page and clicks on every accordion button
Given User opens index page and clicks on the AccordionTextAffects button
When User clicks on the Manual testing button
Then User sees special text for Manual testing button
When User clicks on the Cucumber BDD button
Then User sees special text for Cucumber BDD button
When User clicks on the Automation testing button
Then User sees special text for Automation testing button
When User clicks on the Keep clicking button
Then User sees special text for Automation testing button