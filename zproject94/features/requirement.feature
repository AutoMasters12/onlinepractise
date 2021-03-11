@fun
Feature: Flights functinalities

  Scenario Outline: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters "<username>" and "<password>"
    Then Message displayed Login Successfully

    Examples: 
      | username   | password |
      | testuser_1 | Test@34 |
      | testuser_2 | Test@33 |
      | testuser_2 | Test@15333 |
      | testuser_2 | Test@1333 |
      | testuser_2 | Test@122253 |
      | testuser_2 | Test@15223 |
