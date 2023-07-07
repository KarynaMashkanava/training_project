package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "login-button")
    protected WebElement loginButton;

    @FindBy(id = "user-name")
    protected WebElement usernameInput;

    @FindBy(xpath = "//input[@type = 'password']")
    protected WebElement passwordInput;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
