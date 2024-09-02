package tekFinalProject.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tekFinalProject.pages.CreateAccountPage;
import tekFinalProject.pages.HomePage;
import tekFinalProject.utility.RandomEmailGenerator;
import tekFinalProject.utility.SeleniumUtility;

import java.time.Duration;
import java.util.Map;

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

    //------------------------------------------------------------------------------------------------------------//
    private static String emailToUse;
    @Given("user clicks on create new primary account")
    public void user_clicks_on_create_new_primary_account() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clickOnElement(HomePage.CREATE_PRIMARY_ACCOUNT_BTN);
    }
    @When("user enters new account info")
    public void user_enters_new_account_info(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String email = data.get("email");
        String title = data.get("title");
        String firstName = data.get("firstName");
        String lastName = data.get("lastName");
        String gender = data.get("gender");
        String maritalStatus = data.get("maritalStatus");
        String employmentStatus = data.get("employmentStatus");
        String dateOfBirth = data.get("dateOfBirth");

        emailToUse = email.equalsIgnoreCase("random")
                ? RandomEmailGenerator.generateRandomEmail() : email;

        sendText(CreateAccountPage.EMAIL_INPUT, emailToUse);
        clickOnElement(CreateAccountPage.TITLE_INPUT);
        clickOnElement(By.xpath("//*[contains(@value, 'Mr.')]"));
        sendText(CreateAccountPage.FIRSTNAME_INPUT, firstName);
        sendText(CreateAccountPage.LASTNAME_INPUT, lastName);
        clickOnElement(CreateAccountPage.GENDER_INPUT);
        clickOnElement(By.xpath("//option[text()='Male']"));
        sendText(CreateAccountPage.MARITAL_INPUT, maritalStatus);
        clickOnElement(By.xpath("//option[text()='Single']"));
        clickOnElement(CreateAccountPage.MARITAL_INPUT);
        sendText(CreateAccountPage.EMPLOYMENT_INPUT, employmentStatus);
        sendText(CreateAccountPage.DOB_INPUT, dateOfBirth);
    }
    @Then("validate email address in account page match")
    public void validate_email_address_in_account_page_match() {
        boolean isEmailDisplayed = isElementDisplayed(By.xpath("//h2[text()='akbar.ali@gmail.com']"));
        Assert.assertTrue("The email address does not match on the account page!", isEmailDisplayed);

    }

    //----------------------------------------------------------------------------------------------------//

    @When("user enters credentials that already exits")
    public void user_enters_credentials_that_already_exits(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String email = data.get("email");
        String title = data.get("title");
        String firstName = data.get("firstName");
        String lastName = data.get("lastName");
        String gender = data.get("gender");
        String maritalStatus = data.get("maritalStatus");
        String employmentStatus = data.get("employmentStatus");
        String dateOfBirth = data.get("dateOfBirth");

        //sendText();
        clickOnElement(CreateAccountPage.TITLE_INPUT);
        clickOnElement(By.xpath("//*[contains(@value, 'Mr.')]"));
        sendText(CreateAccountPage.FIRSTNAME_INPUT, firstName);
        sendText(CreateAccountPage.LASTNAME_INPUT, lastName);
        clickOnElement(CreateAccountPage.GENDER_INPUT);
        clickOnElement(By.xpath("//option[text()='Male']"));
        sendText(CreateAccountPage.MARITAL_INPUT, maritalStatus);
        clickOnElement(By.xpath("//option[text()='Single']"));
        clickOnElement(CreateAccountPage.MARITAL_INPUT);
        sendText(CreateAccountPage.EMPLOYMENT_INPUT, employmentStatus);
        sendText(CreateAccountPage.DOB_INPUT, dateOfBirth);
    }
    @Then("error message will pop up")
    public void error_message_will_pop_up() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
