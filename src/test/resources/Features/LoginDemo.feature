
Feature: Test login functionality

@smoke
  Scenario Outline: check login is successful with valid credentials on application
    Given user go to browser
    And user go to login page
    When user enters "<username>" and "<password>"
    And user click login button
    Then user click logout button

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
