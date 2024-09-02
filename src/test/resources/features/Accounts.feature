Feature: scenarios for account
  @TestCase11
  Scenario: Sign in with CSR credentials and verify accounts page info
    Given user clicks on Login button
    Then user enter username and password
    Then user clicks on Sign in button
    Then user clicks on Account button
    Then validate 5 row per page is default
  @TestCase12
    Scenario: Sign in with CSR credentials and change table records
      Given user clicks on Login button
      Then user enter username and password
      Then user clicks on Sign in button
      Then user clicks on Account button
      Then change the amount of records shown to "10"
      Then validate the record count to be 10
      Then change the amount of records shown to "25"
      Then validate the record count to be 25
      Then change the amount of records shown to "50"
      Then validate the record count to be 50