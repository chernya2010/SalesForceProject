package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * The type List box.
 */
public class ListBox {
    WebDriver driver;
    String label;

    private static final String SEARCH_FIELD_XPATH = "//label[contains(text(),'%s')]/ancestor::lightning-grouped-combobox/div/div/lightning-base-combobox/div[@class='slds-combobox_container']/div";
    private static final String SELECT_OPTION_FROM_LISTBOX_XPATH = "//label[contains(text(),'%s')]/ancestor::lightning-grouped-combobox[contains(@class,'slds-form-element')]//*[@title='%s']";

    /**
     * Instantiates a new List box.
     *
     * @param driver the driver
     * @param label  the label
     */
    public ListBox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    /**
     * Instantiates a new List box.
     *
     * @param driver the driver
     */
    public ListBox(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Select option from list box.
     *
     * @param label  the label
     * @param option the option
     * @throws InterruptedException the interrupted exception
     */
    public void selectOptionFromListBox(String label, String option) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(String.format(SEARCH_FIELD_XPATH, label))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(String.format(SELECT_OPTION_FROM_LISTBOX_XPATH, label, option))).click();

    }
}
