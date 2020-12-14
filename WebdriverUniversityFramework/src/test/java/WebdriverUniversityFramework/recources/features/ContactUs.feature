Feature: User leaves his contact information on the Page Object Model page

Scenario: Submit valid contact information via contact us form

Given User goes to the webdriveruniversity contact us form
When User populates his Username
|Sergo|Paul|Bruno|
And User populates his Last Name
|Alfred|Space|Brown|
And User populates his email
|sdfsd@mail.com|
And User leaves comment
|comment one|comment two|
When User clicks Submit button
Then Message about successfull submittion is displaing