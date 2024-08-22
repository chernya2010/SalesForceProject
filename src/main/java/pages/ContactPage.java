package pages;

import constants.IConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage implements IConstants {
    public static final String DATA_BY_LABEL_XPATH = "//*[@field-label='%s']//*[@data-output-element-id='output-field']";
    public static final String ACCOUNT_NAME_LINK_ON_CONTACT_PAGE_LABEL_XPATH = "//*[@field-label='%s']//div[@class='slds-grid']//slot//slot";

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public String getFieldValueByName(String name){
        return driver.findElement(By.xpath(String.format(DATA_BY_LABEL_XPATH, name))).getText();
    }

    public String getAccountOnContactPageByName(String name){
        return driver.findElement(By.xpath(String.format(ACCOUNT_NAME_LINK_ON_CONTACT_PAGE_LABEL_XPATH, name))).getText();
    }
}