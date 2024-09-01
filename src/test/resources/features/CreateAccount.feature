Feature: Scenarios for creating an account
  @TestCase02
  Scenario: Navigate to create an account page and validate title
    Given user navigates to create an account page
    Then validate page title as "Create Primary Account Holder"
    
