Feature: for plans scenarios
  @TestCase09
  Scenario: sign in then validate info on plans tab
    Given user clicks on Login button
    Then user enter username and password
    Then user clicks on Sign in button
    When user clicks on plans button
    Then validate rows of data is present
@TestCase10
    Scenario: sign in then validate dates on plans page
      Given user clicks on Login button
      Then user enter username and password
      Then user clicks on Sign in button
      When user clicks on plans button
      Then validate the dates on the table