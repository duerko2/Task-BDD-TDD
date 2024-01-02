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

  Scenario: Adding five numbers
    Given the stringCalculator
    When user inputs "1,2,3,4,5"
    Then the result should be 15

  Scenario: Adding numbers with newline
    Given the stringCalculator
    When user inputs "1\n2,3"
    Then the result should be 6
    
    
  Scenario: Using custom delimiter
    Given the stringCalculator
    When user inputs "//p\n1p2p3"
    Then the result should be 6

  Scenario: Adding with negative numbers
    Given the stringCalculator
    When user inputs "-1,2,-3"
    Then the result should fail with "negatives not allowed [-1, -3]"
