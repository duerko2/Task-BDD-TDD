Feature: add two numbers

  Scenario: adding empty strings
    Given the stringCalculator
    When user inputs ""
    Then the result should be 0

  Scenario: Adding one number
    Given the stringCalculator
    When user inputs "1"
    Then the result should be 1

  Scenario: Adding one number
    Given the stringCalculator
    When user inputs "3"
    Then the result should be 3

  Scenario: Adding two numbers
    Given the stringCalculator
    When user inputs "1,2"
    Then the result should be 3