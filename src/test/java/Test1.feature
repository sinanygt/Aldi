Feature: Login Test
  Scenario: Go to aldi website and test login page
    Given Go to Aldi website
    And Click Cookies
    And Click Anmeldan
    And Click E-Mail adresse box
    And Write E-Mail adresse
    And Click Password box
    When Click submit button
    Then Verify success message