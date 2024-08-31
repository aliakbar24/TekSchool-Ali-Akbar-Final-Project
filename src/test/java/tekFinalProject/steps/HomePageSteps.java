package tekFinalProject.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tekFinalProject.utility.SeleniumUtility;

public class HomePageSteps extends SeleniumUtility {

    @Then("validate homepage title TEK Insurance UI")
    public void validateHomepageTitle() {
        String pageTitle = getElementText(By.className("chakra-heading css-1at26de"));
        Assert.assertEquals("TEK Insurance App", pageTitle);
    }

}
