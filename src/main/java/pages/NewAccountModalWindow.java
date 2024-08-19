package pages;

import elements.Button;
import elements.DropDown;
import elements.Input;
import objects.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountModalWindow extends BasePage {

    @FindBy(xpath = "//*[@name='SaveEdit']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@name='SaveAndNew']")
    public WebElement saveAndNewButton;

    @FindBy(xpath = "//*[@name='CancelEdit']")
    public WebElement cancelButton;

    public NewAccountModalWindow(WebDriver driver) {
        super(driver);
    }

    public  NewAccountModalWindow openPage(String url) {
        driver.get(url);
        return this;
    }

    public void createAccountWithExit(Account account) throws InterruptedException {
        new Input(driver, "Account Name").writeTextInInput(account.getAccountName());
        new Input(driver, "Website").writeTextInInput(account.getWebsite());
        new DropDown(driver, "Type").accountSelectOption(account.getType());
        new Input(driver, "Description").writeTextInTextarea(account.getDescription());
        new Input(driver, "Phone").writeTextInInput(account.getPhone());
        new Button(driver).clickButton(saveButton);
    }
}
