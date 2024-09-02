package tekFinalProject.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tekFinalProject.utility.SeleniumUtility;

import java.util.List;

public class AccountsSteps extends SeleniumUtility {

    @Then("validate {int} row per page is default")
    public void validate_row_per_page_is_default(int expectedRowPP) {
        List<WebElement> tableRow = getElements(By.xpath("//table/tbody/tr"));
        Assert.assertEquals("Validate rows", tableRow.size(), expectedRowPP);
    }
    @Then("change the amount of records shown to {string}")
    public void change_the_amount_of_records_shown_to(String rowPerPage) {
        selectFromDropDown(By.xpath("//table/following-sibling::div//select"),
                "show" + rowPerPage);
    }
    @Then("validate the record count to be {int}")
    public void validate_the_record_count_to_be(int rowPerPage) {
        List<WebElement> tableRow = getElements(By.xpath("//table/tbody/tr"));
        Assert.assertEquals("Validate new rows", tableRow.size(), rowPerPage);
    }

}
