package pages;

import constants.IConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends BasePage implements IConstants {
    public static final String CONTACT_NAME_FIELD_XPATH = "//*[contains(@title,'%s')]";
    public static final String CONTACT_ACCOUNT_NAME_BY_CONTACT_NAME_XPATH = "//span[contains(@class,'forceInlineEditCell')]/ancestor::tr//a[contains(@title,'%s')]";
    public static final String CONTACT_PHONE_XPATH = "//*[contains(@title,'%s')]/ancestor::tbody//span[contains(@class,'forceOutputPhone')]";
    public static final String CONTACT_OWNER_BY_CONTACT_NAME_XPATH = "//*[contains(@title,'qwe')]/ancestor::tr//span[contains(@class,'uiOutputText')]";


    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    public ContactListPage openPage(String url){
        driver.get(url);
        return this;
    }

    public String getExistLastName(String contactLastName){
        return driver.findElement(By.xpath(String.format(CONTACT_NAME_FIELD_XPATH, contactLastName))).getText();
    }

    public String getExistPhoneByContactName(String contactName){
        return driver.findElement(By.xpath(String.format(CONTACT_PHONE_XPATH, contactName))).getText();
    }

    public String getExistContactOwnerByContactName(String contactOwner){
        return driver.findElement(By.xpath(String.format(CONTACT_OWNER_BY_CONTACT_NAME_XPATH, contactOwner))).getText();
    }

    public AccountPage clickOnContactName(String contactName){
        driver.findElement(By.xpath(String.format(CONTACT_NAME_FIELD_XPATH, contactName))).getText();
        return new AccountPage(driver);
    }

    public String getExistAccountNameByContactName(String contactName){
        return driver.findElement(By.xpath(String.format(CONTACT_ACCOUNT_NAME_BY_CONTACT_NAME_XPATH, contactName))).getText();
    }

    public AccountPage clickOnAccountName(String contactName){
        driver.findElement(By.xpath(String.format(CONTACT_ACCOUNT_NAME_BY_CONTACT_NAME_XPATH, contactName))).getText();
        return new AccountPage(driver);
    }
}
