Feature: Login
  The user will enter the information system
  Scenario: Login Succesful
    Given the user is on the login page
    When the user enters the credentials
    Then Then the user will observe the user page
  Scenario: Login Fail Email
  The user enters the information system with the wrong email address
    Given the user is on the login page
    When the user enters the wrong email and the correct password
    Then the login page gives an error