@Login
Feature: To validate login for amazon using chrome browser

Background:

Given user have to validate login for amazon using chrome browser
@Sanity @Regression
Scenario: To validate login for amazon using valid phone number and invalid password

When user have to enter valid phone number and invalid password

And user have to click submit continue  button

Then user have to verify wheather password incorrect is displayed
@Sanity @Smoke
Scenario: To validate login for amazon using invalid phone number 

When user have to enter invalid phone number 

And user have to click continue button

Then user have to verify wheather phone number incorrect is displayed





