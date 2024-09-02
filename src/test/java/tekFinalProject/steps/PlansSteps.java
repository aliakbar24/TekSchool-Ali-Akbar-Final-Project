package tekFinalProject.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tekFinalProject.utility.SeleniumUtility;

public class PlansSteps extends SeleniumUtility {
    @Then("validate rows of data is present")
    public void validate_rows_of_data_is_present() {
        boolean isTableDisplayed = isElementDisplayed(By.xpath("//div[contains(@class, 'css-spiuz6')]"));
        Assert.assertTrue(isTableDisplayed);
    }
    //_____________________________________________Scenario 2_________________________________________________________//

    @Then("validate the dates on the table")
    public void validate_the_dates_on_the_table() {
    String createDate = getElementText(By.xpath("(//td[@class='css-13y9y23'])[3])"));
    Assert.assertEquals("August 21,2024", createDate);
    String expireDate = getElementText(By.xpath("(//td[@class='css-13y9y23'])[4]"));
    Assert.assertEquals("August 22, 2024", expireDate);
    }

}
