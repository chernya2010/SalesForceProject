package pages;

import constants.IConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage implements IConstants {
    public static final String DATA_BY_LABEL_XPATH = "//*[@field-label='%s']//*[@data-output-element-id='output-field']";
    public static final String ACCOUNT_NAME_LINK_ON_CONTACT_PAGE_LABEL_XPATH = "//*[@field-label='%s']//div[@class='slds-grid']//slot//slot";

    /**
     * Instantiates a new Contact page.
     *
     * @param driver the driver
     */
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Get field value by name string.
     *
     * @param name the name
     * @return the string
     */
    public String getFieldValueByName(String name){
        return driver.findElement(By.xpath(String.format(DATA_BY_LABEL_XPATH, name))).getText();
    }

    /**
     * Get account on contact page by name string.
     *
     * @param name the name
     * @return the string
     */
    public String getAccountOnContactPageByName(String name){
        return driver.findElement(By.xpath(String.format(ACCOUNT_NAME_LINK_ON_CONTACT_PAGE_LABEL_XPATH, name))).getText();
    }
}