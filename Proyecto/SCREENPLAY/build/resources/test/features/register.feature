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
