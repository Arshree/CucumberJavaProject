@Hooks
Feature: Login with using Hooks

  Scenario: Login application with using Hooks
    Given user is on login page
    When user enter valid credentials
    And user click login button
    Then user logout application
    
    Scenario: Login application with using Hooks
    Given user is on login page
    When user enter valid credentials
    And user click login button
    Then user logout application
