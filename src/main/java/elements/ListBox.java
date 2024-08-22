package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListBox {
    WebDriver driver;
    String label;

    private static final String SEARCH_FIELD_XPATH = "//label[contains(text(),'%s')]/ancestor::lightning-grouped-combobox/div/div/lightning-base-combobox/div[@class='slds-combobox_container']/div";
    private static final String SELECT_OPTION_FROM_LISTBOX_XPATH = "//label[contains(text(),'%s')]/ancestor::lightning-grouped-combobox[contains(@class,'slds-form-element')]//*[@title='%s']";

    public ListBox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public ListBox(WebDriver driver){
        this.driver = driver;
    }

    public void selectOptionFromListBox(String label, String option) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(String.format(SEARCH_FIELD_XPATH, label))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(String.format(SELECT_OPTION_FROM_LISTBOX_XPATH, label, option))).click();

    }
}
