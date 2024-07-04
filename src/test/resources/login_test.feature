Feature: Login


  @LoginTest @LT1
  Scenario: Verify successful login
    Given User on login screen
    When User enter login credentials
    And User click on submit button
    Then User verify products page displayed

  @LoginTest @LT2
  Scenario: Verify unSuccessful login
    Given User on login screen
    When User enter login credentials "standard_user" and "secret_sauce"
    And User click on submit button
    Then User verify products page displayed

  @LoginTest @LT3
  Scenario: Verify Successful login with Data in row
    Given User on login screen
    When User enter login credentials using below row
      | standard_user | secret_sauce | 98765433221 | siva@yopmail.com |
    And User click on submit button
    Then User verify products page displayed

  @LoginTest @LT4
  Scenario: Verify Successful login with row as header
    Given User on login screen
    When User enter login credentials using row header
      | username      | password     | phone       | email            |
      | standard_user | secret_sauce | 98765433221 | siva@yopmail.com |
    And User click on submit button
    Then User verify products page displayed

  @LoginTest @LT5
  Scenario Outline: Verify unSuccessful login
    Given User on login screen
    When User enter login credentials "<username>" and "<password>"
    And User click on submit button
    Then User verify products page displayed
    Examples:
      | username          | password     |
      | standard_user     | secret_sauce |
      | advanced_user     | secret_sauce |
      | professional_user | secret_sauce |

  @LoginTest @LT6
  Scenario: Verify Successful login and save the value and reuse runtime
    Given User on login screen
    When User enter login credentials using row header
      | username      | password     | phone       | email            |
      | standard_user | secret_sauce | 98765433221 | siva@yopmail.com |
    And User click on submit button
    Then User verify username "standard_user" displayed