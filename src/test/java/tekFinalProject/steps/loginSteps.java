package tekFinalProject.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ro.Si;
import org.junit.Assert;
import org.openqa.selenium.By;
import tekFinalProject.pages.HomePage;
import tekFinalProject.pages.SignInPage;
import tekFinalProject.utility.SeleniumUtility;

public class loginSteps extends SeleniumUtility {

    @Given("user clicks on Login button")
    public void user_clicks_on_login_button(){
        clickOnElement(HomePage.LOGIN_LINK);
    }
    @When("user enter username and password")
    public void user_enter_username_and_password() {
        sendText(SignInPage.USERNAME_INPUT, "supervisor");
        sendText(SignInPage.PASSWORD_INPUT, "tek_supervisor");
        clickOnElement(SignInPage.SIGN_IN_BUTTON);
    }
    @Then("validate user is on customer service portal")
    public void validate_user_is_on_customer_service_portal() {
        String topLeftCornerText = getElementText(By.xpath("*[contains(text(),'Customer Service Portal')]"));
        Assert.assertEquals("Customer Service Portal", topLeftCornerText);
    }

    //______________________________________________Scenario 2_____________________________________________________//

    @Then("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        sendText(SignInPage.USERNAME_INPUT, username);
        sendText(SignInPage.PASSWORD_INPUT, password);
        clickOnElement(SignInPage.SIGN_IN_BUTTON);
    }
    @Then("user should see error")
    public void user_should_see_error(String expectedError) {
        String errorMessage = getElementText(SignInPage.ERROR_MESSAGE);
        Assert.assertEquals(expectedError, errorMessage);

    }
}
