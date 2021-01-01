Feature: All click buttons are work correctly

Scenario: User goes to the Button Clicks page and clicks on every Click Me button

Given User goes to the WebDrverUniversity index page
When User clicks button clics link
And User clicks WebElement button
Then User sees congratulation message for WebElement button
When User clicks JavaScript button
Then User sees congratulation message for JavaScript button
When User clicks ActionMove&Click button
Then User sees congratulation message for ActionMove&Click button