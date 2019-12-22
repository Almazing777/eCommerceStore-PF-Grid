Feature: Sign up Feature

  Scenario: Existing user sign up
#  Given user open browser
    Given user open register page
    When user input email "azat@testpro.io"
    And user input password "Qwerty1"
    And user input username "azat"
    And user clicks sign up button
    Then Error message should appear
#  And user closes the browser
