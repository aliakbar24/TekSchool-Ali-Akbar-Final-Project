package tekFinalProject.pages;

import org.openqa.selenium.By;

public class SignInPage {

    public static final By USERNAME_INPUT = By.name("username");
    public static final By PASSWORD_INPUT = By.name("password");
    public static final By SIGN_IN_BUTTON = By.xpath("//*[contains(text(), 'Sign In')]");
    public static final By ERROR_MESSAGE = By.xpath("//*[contains(@class, '1ykemat')]");
}
