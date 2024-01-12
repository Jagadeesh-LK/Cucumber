Feature: To validate facebook login using chrome browser

Background:

Given user have to validate facebook login using chrome browser
@Sanity @Regression
Scenario: To validate facebook login by invalid userid and invalid password

When user have to enter the Invalid userid and Invalid password

|username|jagadeesh|
|passwword|123456|
|email|greens123@gmail.com|

And user have to click login button

Then user have to verify wheather is in invalid credential page

Scenario: To validate facebook login by invalid userid and valid password

When user have to enter the Invalid userid and Valid pasword
|Username|email|password|
|selenium|jk@gmail.com|4676532|
|java|rj@gmail.com|ghjdfs|
|python|ak@gmail.com|987654|
|aws|ls@gmail.com1237654||

And user have to click login button

Then user have to verify wheather is in invalid credential page




