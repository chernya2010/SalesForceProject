import constants.IConstants;
import generators.NumberGenerator;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest implements ITestCostants, IConstants {
    WebDriver driver;

    AccountPage accountPage;
    AccountListPage accountListPage;
    HomePage homePage;
    LoginPage loginPage;
    NewAccountModalWindow newAccountModalWindow;
    NumberGenerator numberGenerator;
    ContactPage contactPage;
    ContactListPage contactListPage;
    NewContactModalWindow newContactModalWindow;

    public void initPages(){
        accountPage = new AccountPage(driver);
        accountListPage = new AccountListPage(driver);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        newAccountModalWindow = new NewAccountModalWindow(driver);
        contactPage = new ContactPage(driver);
        contactListPage = new ContactListPage(driver);
        newContactModalWindow = new NewContactModalWindow(driver);
    }

    public void initUtils(){
        numberGenerator = new NumberGenerator();
    }

    @BeforeMethod
    public void initTest(){
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        options.addArguments("--disable-popup-blocking");
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options.setExperimentalOption("prefs", prefs);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
        initPages();
        initUtils();
    }

    @AfterMethod
    public void endTest(){
        driver.close();
    }
}
