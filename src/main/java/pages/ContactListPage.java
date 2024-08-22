package pages;

import constants.IConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends BasePage implements IConstants {

    public static final String CONTACT_NAME_FIELD_XPATH = "//*[contains(@title,'%s')]";
    public static final String CONTACT_ACCOUNT_NAME_BY_CONTACT_NAME_XPATH = "//span[contains(@class,'forceInlineEditCell')]/ancestor::tr//a[contains(@title,'%s')]";
    public static final String CONTACT_PHONE_XPATH = "//*[contains(@title,'%s')]/ancestor::tbody//span[contains(@class,'forceOutputPhone')]";
    public static final String CONTACT_OWNER_BY_CONTACT_NAME_XPATH = "//*[contains(@title,'qwe')]/ancestor::tr//span[contains(@class,'uiOutputText')]";

    /**
     * Instantiates a new Contact list page.
     *
     * @param driver the driver
     */
    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Open page contact list page.
     *
     * @param url the url
     * @return the contact list page
     */
    public ContactListPage openPage(String url){
        driver.get(url);
        return this;
    }

    /**
     * Get exist last name string.
     *
     * @param contactLastName the contact last name
     * @return the string
     */
    public String getExistLastName(String contactLastName){
        return driver.findElement(By.xpath(String.format(CONTACT_NAME_FIELD_XPATH, contactLastName))).getText();
    }

    /**
     * Get exist phone by contact name string.
     *
     * @param contactName the contact name
     * @return the string
     */
    public String getExistPhoneByContactName(String contactName){
        return driver.findElement(By.xpath(String.format(CONTACT_PHONE_XPATH, contactName))).getText();
    }

    /**
     * Get exist contact owner by contact name string.
     *
     * @param contactOwner the contact owner
     * @return the string
     */
    public String getExistContactOwnerByContactName(String contactOwner){
        return driver.findElement(By.xpath(String.format(CONTACT_OWNER_BY_CONTACT_NAME_XPATH, contactOwner))).getText();
    }

    /**
     * Click on contact name account page.
     *
     * @param contactName the contact name
     * @return the account page
     */
    public AccountPage clickOnContactName(String contactName){
        driver.findElement(By.xpath(String.format(CONTACT_NAME_FIELD_XPATH, contactName))).getText();
        return new AccountPage(driver);
    }

    /**
     * Get exist account name by contact name string.
     *
     * @param contactName the contact name
     * @return the string
     */
    public String getExistAccountNameByContactName(String contactName){
        return driver.findElement(By.xpath(String.format(CONTACT_ACCOUNT_NAME_BY_CONTACT_NAME_XPATH, contactName))).getText();
    }

    /**
     * Click on account name account page.
     *
     * @param contactName the contact name
     * @return the account page
     */
    public AccountPage clickOnAccountName(String contactName){
        driver.findElement(By.xpath(String.format(CONTACT_ACCOUNT_NAME_BY_CONTACT_NAME_XPATH, contactName))).getText();
        return new AccountPage(driver);
    }
}
