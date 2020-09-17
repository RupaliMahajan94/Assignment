Feature: feature to test search

  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters test
    And hits enter
    Then user navigated to search result
