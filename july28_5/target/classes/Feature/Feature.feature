Feature: Flipkart login feature

@RegressionTest @End2End
Scenario: Flipkart login test Scenario
Given User is already on login page

@End2End
Scenario: compare title actual vs expected
Given title of the page is Flipkart

@SmokeTest @RegressionTest  @FunctionalTest
Scenario: User enters his credential
Given user enters username and password
|username|password|
|9894506053|Msft@2020|

@RegressionTest @SmokeTest  @FunctionalTest
Scenario: User clicks on login button
Given user clicks on login button

@FunctionalTest 
Scenario: compare home page title actual vs expected
Given user is on Home page

@SmokeTest 
Scenario: User quits 
Given user closes the browser


