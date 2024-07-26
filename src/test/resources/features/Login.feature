
Feature: User Login

  Scenario: Login with different credentials
    Given Deanz login with "HAIPT1" and ""
    When he enters open Trade Finance page
    And he fill the form with right data
    Then he should be able to create a new LC

