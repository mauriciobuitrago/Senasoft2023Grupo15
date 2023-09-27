Feature: Register
  The user register in to the website

  Scenario: Successful register
    Given the user is on the register page
    When the user entered your credentials
    Then the user can see their account settings

  Scenario: Failed registration due to numerical data
    Given the user is on the register page
    When the user entered numerical credentials in Email
    Then the user may see a warning

  Scenario: Failed Registration due to special characters
    Given the user is on the register page
    When the user entered special characters in the email
    Then the user may see a warning

  Scenario: Register Fail
    Given the user is on the register page
    When the user entered incomplete credentials in the email field
    Then the user may see a warning


  Scenario: Failed registration empty fields in email
    Given the user is on the register page
    When The user did not enter data in the Email
    Then the user can see a warning about the field

