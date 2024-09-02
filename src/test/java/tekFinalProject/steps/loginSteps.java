package tekFinalProject.steps;


import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tekFinalProject.pages.SignInPage;
import tekFinalProject.utility.SeleniumUtility;

public class loginSteps extends SeleniumUtility {


    @Then("validate user is on customer service portal")
    public void validate_user_is_on_customer_service_portal() {
        String topLeftCornerText = getElementText(By.xpath("//*[contains(text(),'Customer Service Portal')]"));
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
