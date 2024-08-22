package pages;

import constants.IConstants;
import elements.Button;
import elements.DropDown;
import elements.Input;
import elements.ListBox;
import objects.Account;
import objects.Contact;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewContactModalWindow extends BasePage implements IConstants {

    @FindBy(xpath = "//button[@name='SaveEdit']")
    public WebElement saveButton;
    @FindBy(xpath = "//*[@name='SaveAndNew']")
    public WebElement saveAndNewButton;
    @FindBy(xpath = "//*[@name='CancelEdit']")
    public WebElement cancelButton;

    public NewContactModalWindow(WebDriver driver) {
        super(driver);
    }

    public NewContactModalWindow openPage(String url){
        driver.get(url);
        return this;
    }

    public void createContactWithExit(Contact contact) throws InterruptedException {
        new Input(driver, "First Name").writeTextInInput(contact.getFirstName());
        new Input(driver, "Last Name").writeTextInInput(contact.getLastName());
        new ListBox(driver).selectOptionFromListBox("Account Name", "asd");
        new Input(driver, "Phone").writeTextInInput(contact.getPhone());
        new Button(driver).clickButton(saveButton);
    }
}
