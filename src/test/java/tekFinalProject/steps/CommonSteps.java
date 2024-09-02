package tekFinalProject.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import tekFinalProject.pages.HomePage;
import tekFinalProject.pages.PlansPage;
import tekFinalProject.pages.SignInPage;
import tekFinalProject.utility.SeleniumUtility;

import java.util.List;

public class CommonSteps extends SeleniumUtility {

    @Given("user click on {string} link")
    public void userClickOnLinks(String linkText) {
        clickOnElement(By.linkText(linkText));
    }
    @When("user clicks on {string} button")
    public void user_click_on_button(String buttonVisibleText) {
        try {
            String buttonXpath = "//button[text()='" + buttonVisibleText + "']";
            clickOnElement(By.xpath(buttonXpath));
        } catch (TimeoutException ex) {
            String buttonXpath = "//*[text()='" + buttonVisibleText + "']/..";
            clickOnElement(By.xpath(buttonXpath));
        }
    }
    @When("user enter {string} on {string} field")
    public void userEnterTextToAnyField(String text, String fieldName) {
        String xpath = " //label[text()='" + fieldName + "']/..//input";
        sendText(By.xpath(xpath), text);
    }
    @When("wait for {} seconds")
    public void waitForSeconds(Integer seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    @Given("user clicks on Login button")
    public void user_clicks_on_login_button(){
        clickOnElement(HomePage.LOGIN_LINK);
    }
    @When("user enter username and password")
    public void user_enter_username_and_password() {
        sendText(SignInPage.USERNAME_INPUT, "supervisor");
        sendText(SignInPage.PASSWORD_INPUT, "tek_supervisor");
    }

    @Then("user clicks on Sign in button")
    public void user_clicks_on_button(String buttonName) {
        if (buttonName.equalsIgnoreCase("Sign in")) {
            clickOnElement(SignInPage.SIGN_IN_BUTTON);
        }
    }

    @When("user clicks on the profile button")
    public void user_clicks_on_the_profile_button() {
        clickOnElement(By.xpath("//*[contains(@type,'button')]"));
    }

    @When("user clicks on plans button")
    public void user_clicks_on_plans_button() {
        clickOnElement(PlansPage.PLANS_BTN);
    }

    @Then("user clicks on Account button")
    public void user_clicks_on_account_button() {
        clickOnElement(By.linkText("Accounts"));
    }
}
