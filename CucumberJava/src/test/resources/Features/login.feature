
Feature: feature to test login functionality

  Scenario Outline: Check login is succesfull with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And click on login button
    Then user is navigated to home page

    Examples:
    | username | password |
    | rupali@attagis.com | Path@092020 |
