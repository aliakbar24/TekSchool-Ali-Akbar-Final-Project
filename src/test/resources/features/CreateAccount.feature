Feature: Scenarios for creating an account
  @TestCase02
  Scenario: Navigate to create an account page and validate title
    Given user navigates to create an account page
    Then validate page title as "Create Primary Account Holder"

  @TestCase03
  Scenario: Create an account and validate email on profile
    Given user clicks on create new primary account
    When user enters new account info
      | email            | random   |
      | title            | Mr      |
      | firstName        | Ali      |
      | lastName         | Akbar    |
      | gender           | Male     |
      | maritalStatus    | Single   |
      | employmentStatus | Student  |
      | dateOfBirth      | 10152001 |
    When user clicks on "Sign Up" button
    Then validate email address in account page match

    @TestCase04
    Scenario: Create an account with existing credentials
      When user enters credentials that already exits
        | email            | random   |
        | title            | Mr       |
        | firstName        | Ali      |
        | lastName         | Akbar    |
        | gender           | Male     |
        | maritalStatus    | Single   |
        | employmentStatus | Student  |
        | dateOfBirth      | 10152001 |
      When user clicks on "Sign Up" button
      Then error message will pop up
