package tekFinalProject.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tekFinalProject.utility.SeleniumUtility;

public class CreateAccountSteps extends SeleniumUtility {

    @Given("user navigates to create an account page")
    public void userNavigatesToCreateAccountPage() {
        clickOnElement(By.xpath("//*[contains(@class, 'css-1jp0m7c')]"));
    }

    @Then("validate page title as {string}")
    public void validate_page_title_as(String expectedTitle) {
        String pageTitle = getElementText(By.xpath("//*[contains(@class, 'css-1jb3vzl')]"));
        Assert.assertEquals("Page title does not match the expected value.", expectedTitle, pageTitle);
    }
}
