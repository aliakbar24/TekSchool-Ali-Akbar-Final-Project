package tekFinalProject.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import tekFinalProject.utility.SeleniumUtility;

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
}
