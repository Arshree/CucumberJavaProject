@SmokeFeature
Feature: feature to test login scenario
@smoketest
  Scenario: Check login is Successful with valid credentials in googel
    Given user is on login page
    When user enters u_name and pass
    And clicks login button
    Then user is navigates to the home page
