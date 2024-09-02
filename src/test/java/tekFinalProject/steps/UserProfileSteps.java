package tekFinalProject.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tekFinalProject.utility.SeleniumUtility;

public class UserProfileSteps extends SeleniumUtility {
    @Then("validate the information")
    public void validate_the_information() {
        boolean isInfoPresent = isElementDisplayed(By.xpath("//*[contains(@class, 'css-6phkm9')]"));
        Assert.assertTrue(isInfoPresent);
    }

    //_______________________________________Scenario 2____________________________________________//

    @Then("user click on logout button")
    public void user_click_on_logout_button() {
        clickOnElement(By.xpath("//button[contains(text(), 'Logout')]"));
    }
    @Then("validate user is on homepage")
    public void validate_user_is_on_homepage() {
        boolean pageHeader = isElementDisplayed(By.xpath("//*[contains(text(), 'Lets get you started')]"));
        Assert.assertTrue(pageHeader);
    }
}
