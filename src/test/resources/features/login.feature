Feature: scenario for correct and incorrect credentials
 @TestCase05
  Scenario: User uses valid credentials to log in
    Given user clicks on Login button
    When user enter username and password
    Then user clicks on "Sign in" button
    Then validate user is on customer service portal

   @TestCase06
    Scenario: User uses invalid credentials for log in
      Given user clicks on Login button
      Then user enters "<username>" and "<password>"
      Then user clicks on Sign in button
      Then user should see error
        | username   | password       |
        | wrongname  | tek_supervisor |
        | supervisor | wrongpassword  |
        | wrongname  | wrongpassword  |

