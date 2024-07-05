
Feature: Sauce Login

@SL1
Scenario Outline: Verify Successful login
Given User enter username "<username>" and password "<password>"
And User click on login button
Then User verify products screen displayed
Examples:
| username          | password     |
| standard_user     | secret_sauce |