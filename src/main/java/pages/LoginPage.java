package pages;

import constants.IConstants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage implements IConstants {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameInput;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordInput;
    @FindBy(xpath = "//*[@id='Login']")
    public WebElement loginButton;

    public LoginPage openPage(String url){
        driver.get(url);
        return this;
    }

    public LoginPage login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        return this;
    }
}
