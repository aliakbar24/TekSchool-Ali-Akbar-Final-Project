package tekFinalProject.pages;

import org.openqa.selenium.By;

public class CreateAccountPage {
    public static final By EMAIL_INPUT = By.name("email");
    public static final By TITLE_INPUT = By.name("title");
    public static final By FIRSTNAME_INPUT = By.name("firstName");
    public static final By LASTNAME_INPUT = By.name("lastName");
    public static final By GENDER_INPUT = By.name("gender");
    public static final By MARITAL_INPUT = By.name("maritalStatus");
    public static final By EMPLOYMENT_INPUT = By.name("employmentStatus");
    public static final By DOB_INPUT = By.name("dateOfBirth");
    public static final By CREATE_ACCOUNT_BTN = By.linkText("Create Primary Account");
    public static final By USERNAME_INPUT = By.name("username");
    public static final By PASSWORD_INPUT = By.name("password");
    public static final By CONFIRM_PASSWORD_INPUT = By.name("confirm");
    public static final By SUBMIT_BTN = By.xpath("//button[text()='Submit']");
}
