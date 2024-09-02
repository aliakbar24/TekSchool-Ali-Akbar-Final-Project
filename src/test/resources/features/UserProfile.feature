Feature: user profile scenarios
  @TestCase07
  Scenario: Login with CSR credentials and validate profile info
    Given user clicks on Login button
    Then user enter username and password
    Then user clicks on Sign in button
    When user clicks on the profile button
    Then validate the information

@TestCase08
    Scenario: Login with CSR and then log out
      Given user clicks on Login button
      Then user enter username and password
      Then user clicks on Sign in button
      When user clicks on the profile button
      Then user click on logout button
      Then validate user is on homepage
