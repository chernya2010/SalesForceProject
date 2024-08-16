package pages;

import constants.IConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage implements IConstants {
    public static final String ACCOUNT_NAME_FIELD_XPATH = "//*[contains(@title,'%s')]";
    public static final String PHONE_FIELD_XPATH = "//*[contains(@title,'qwe')]/ancestor::tbody//span[contains(@class,'forceOutputPhone')]";
    public static final String ACCOUNT_OWNER_BY_ACCOUNT_NAME_FIELD_XPATH = "//*[contains(@title,'%s')]/ancestor::tr//span[contains(@class,'uiOutputText')]";


    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    public AccountListPage openPage(String url){
        driver.get(url);
        return this;
    }

    public String getExistAccountName(String accountName){
        return driver.findElement(By.xpath(String.format(ACCOUNT_NAME_FIELD_XPATH, accountName))).getText();
    }

    public String getExistPhoneByAccountName(String phone){
        return driver.findElement(By.xpath(String.format(PHONE_FIELD_XPATH, phone))).getText();
    }

    public String getExistAccountOwnerByAccountName(String accountOwner){
        return driver.findElement(By.xpath(String.format(ACCOUNT_OWNER_BY_ACCOUNT_NAME_FIELD_XPATH, accountOwner))).getText();
    }

    public AccountPage clickOnAccountName(String accountName){
        driver.findElement(By.xpath(String.format(ACCOUNT_NAME_FIELD_XPATH, accountName))).getText();
        return new AccountPage(driver);
    }
}
