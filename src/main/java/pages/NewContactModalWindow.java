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

    /**
     * Instantiates a new New contact modal window.
     *
     * @param driver the driver
     */
    public NewContactModalWindow(WebDriver driver) {
        super(driver);
    }

    /**
     * Open page new contact modal window.
     *
     * @param url the url
     * @return the new contact modal window
     */
    public NewContactModalWindow openPage(String url){
        driver.get(url);
        return this;
    }

    /**
     * Create contact with exit.
     *
     * @param contact the contact
     * @throws InterruptedException the interrupted exception
     */
    public void createContactWithExit(Contact contact) throws InterruptedException {
        new Input(driver, "First Name").writeTextInInput(contact.getFirstName());
        new Input(driver, "Last Name").writeTextInInput(contact.getLastName());
        new ListBox(driver).selectOptionFromListBox("Account Name", "asd");
        new Input(driver, "Phone").writeTextInInput(contact.getPhone());
        new Button(driver).clickButton(saveButton);
    }
}
