package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {
    public static final String DATA_BY_LABEL_XPATH = "//*[@field-label='%s']//*[@data-output" +
            "-element-id='output-field']";

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public String getFieldValueByName(String name) {
        return driver.findElement(By.xpath(String.format(DATA_BY_LABEL_XPATH, name))).getText();
    }
}
