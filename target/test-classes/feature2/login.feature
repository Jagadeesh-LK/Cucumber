Feature: To validate facebook login using chrome browser

Scenario Outline:
To validate facebook login using valid username and invalid password

Given user have to validate facebook login using chrome browser

When user have to enter "<username>" and "<password>"

And user have to clik login button

Then user have to check is in invalid credential page

Examples:

|username|password|
|ak1@gmail.com|ak|
|bk1@gmail.com|bk|
|ck1@gmail.com|ck|
|dk1@gmail.com|dk|
|ek1@gmail.com|ek|





