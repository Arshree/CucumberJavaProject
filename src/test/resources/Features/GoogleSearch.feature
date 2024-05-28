Feature: feature to test google search funtionality

  Scenario: Validate google search is working
    Given user go to google browser
    When user enter text in searchbox
    And click search button
    Then user is navigated to search results
