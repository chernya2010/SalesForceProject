package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    WebDriver driver;
    String label;

    private static final String ACCOUNT_DROPDOWN_XPATH = "//*[contains(text(),'%s')]/ancestor::*[contains(@slot,'inputField')]//button";
    private static final String ACCOUNT_DROPDOWN_OPTION_XPATH = "//div[contains(@class,'slds-combobox_container')]//lightning-base-combobox-item//*[contains(@title,'%s')]";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void accountSelectOption(String option) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(String.format(ACCOUNT_DROPDOWN_XPATH, label))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(String.format(ACCOUNT_DROPDOWN_OPTION_XPATH, option))).click();

    }
}
