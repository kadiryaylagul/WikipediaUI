@wip
Feature: Wikipedia Tests

  Background:
    Given Navigate to URL

  Scenario: Login with valid credentials
    Given Select English language
    When Click Login Button
    Then Set Valid Username and Password to Input boxes
    And Click to Sign In Button
    Then Verify to successfull login

  Scenario: Validate language switch
    When Type "Heracles" in the search input field
    And Select "English" as the search language
    And Click the search button
    Then Validate that the first heading of the search results page matches "Heracles" (ignoring the case)
    And Verify that the search results page is available in "Español"
    And Validate that the search results page in the new language includes a link to the version in English