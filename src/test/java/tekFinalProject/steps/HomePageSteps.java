package tekFinalProject.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tekFinalProject.utility.SeleniumUtility;

public class HomePageSteps extends SeleniumUtility {

    @Then("validate homepage title TEK Insurance UI")
    public void validateHomepageTitle() {
        String pageTitle = getElementText(By.xpath("//*[contains(@class, 'css-1at26de')]"));
        Assert.assertEquals("TEK Insurance App", pageTitle);
    }

    @Then("validate Create Primary Account button is visible")
    public void validateCreateAccountButton() {
        boolean createAccountBtn = isElementDisplayed(By.xpath("//*[contains(@class, 'css-1jp0m7c')]"));
        Assert.assertTrue(createAccountBtn);
    }


}
