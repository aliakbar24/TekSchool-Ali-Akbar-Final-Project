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
    private static String emailToUse;
    @Given("user navigates to create an account page")
    public void userNavigatesToCreateAccountPage() {
        clickOnElement(CreateAccountPage.CREATE_ACCOUNT_BTN);
    }

    @Then("validate page title as {string}")
    public void validate_page_title_as(String expectedTitle) {
        String pageTitle = getElementText(By.xpath("//h2[text()='Create Primary Account Holder']"));
        Assert.assertEquals("Create Primary Account Holder", expectedTitle, pageTitle);
    }

    //------------------------------------------------------------------------------------------------------------//
    @Given("user clicks on create new primary account")
    public void user_clicks_on_create_new_primary_account() {
        clickOnElement(HomePage.CREATE_PRIMARY_ACCOUNT_BTN);
    }
    @When("user enters new account info")
    public void user_enters_new_account_info() {

        sendText(CreateAccountPage.EMAIL_INPUT, emailToUse);
        clickOnElement(CreateAccountPage.TITLE_INPUT);
        clickOnElement(By.xpath("//*[contains(@value, 'Mr.')]"));
        sendText(CreateAccountPage.FIRSTNAME_INPUT, "Ali");
        sendText(CreateAccountPage.LASTNAME_INPUT, "Akbar");
        clickOnElement(CreateAccountPage.GENDER_INPUT);
        clickOnElement(By.xpath("//option[text()='Male']"));
        clickOnElement(CreateAccountPage.MARITAL_INPUT);
        clickOnElement(By.xpath("//option[text()='Single']"));
        clickOnElement(CreateAccountPage.MARITAL_INPUT);
        sendText(CreateAccountPage.EMPLOYMENT_INPUT, "Student");
        sendText(CreateAccountPage.DOB_INPUT, "10/15/2001");
    }
    @Then("validate email address in account page match")
    public void validate_email_address_in_account_page_match() {
        boolean isEmailDisplayed = isElementDisplayed(By.xpath("//h2[text()='akbar.ali@gmail.com']"));
        Assert.assertTrue("The email address does not match on the account page!", isEmailDisplayed);

    }

    @Then("fill out username password and confirm password")
    public void fill_out_username_password_and_confirm_password() {
        sendText(CreateAccountPage.USERNAME_INPUT, "Ali01");
        sendText(CreateAccountPage.PASSWORD_INPUT, "Akbar@123");
        sendText(CreateAccountPage.CONFIRM_PASSWORD_INPUT, "Akbar@123");
    }


    @Then("user click on submit button")
    public void userClickOnSubmitButton() {
        clickOnElement(By.xpath("//button[text()='Submit']"));
    }

    //----------------------------------------------------------------------------------------------------//


    @When("user enters credentials that already exits")
    public void user_enters_credentials_that_already_exits() {

        sendText(CreateAccountPage.EMAIL_INPUT, "akbar.ali@gmail.com");
        clickOnElement(CreateAccountPage.TITLE_INPUT);
        clickOnElement(By.xpath("//*[contains(@value, 'Mr.')]"));
        sendText(CreateAccountPage.FIRSTNAME_INPUT, "Ali");
        sendText(CreateAccountPage.LASTNAME_INPUT, "Akbar");
        clickOnElement(CreateAccountPage.GENDER_INPUT);
        clickOnElement(By.xpath("//option[text()='Male']"));
        clickOnElement(CreateAccountPage.MARITAL_INPUT);
        clickOnElement(By.xpath("//option[text()='Single']"));
        clickOnElement(CreateAccountPage.MARITAL_INPUT);
        sendText(CreateAccountPage.EMPLOYMENT_INPUT, "Student");
        sendText(CreateAccountPage.DOB_INPUT, "10/15/2001");
    }
    @Then("error message will pop up")
    public void error_message_will_pop_up() {
        String errorMessage = getElementText(By.xpath("//div[text()='ERROR']"));
        Assert.assertEquals("ERROR", errorMessage);
        System.out.println(errorMessage);
    }



}
