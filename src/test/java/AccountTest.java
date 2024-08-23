import objects.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    @Test
    public void checkAccountExistInAccountListTest() throws InterruptedException {
        Account account1 = new Account();
        account1.setAccountName("Account" + numberGenerator.generateRandomInt(50))
                .setWebsite("www.account1.com")
                .setType("Customer")
                .setDescription("account1 description")
                .setPhone("65487954");
        loginPage
                .openPage(LOGIN_URL)
                .login(USERNAME, PASSWORD);
        newAccountModalWindow
                .openPage(NEW_ACCOUNT_MODAL_URL)
                .createAccountWithExit(account1);
        accountListPage
                .openPage(ACCOUNT_LIST_URL);
        Assert.assertEquals(accountListPage.getExistAccountName(account1.getAccountName()), account1.getAccountName());
        Assert.assertEquals(accountListPage.getExistPhoneByAccountName(account1.getAccountName()), account1.getPhone());
        Assert.assertEquals(accountListPage.getExistAccountOwnerByAccountName(account1.getAccountName()), "ACher");
    }

    @Test
    public void checkAccountDataOnAccountPageTest() throws InterruptedException {
        Account account2 = new Account();
        account2.setAccountName("Account" + numberGenerator.generateRandomInt(50))
                .setWebsite("www.account2.com")
                .setType("Analyst")
                .setDescription("account2 description")
                .setPhone("888888888");
        loginPage
                .openPage(LOGIN_URL)
                .login(USERNAME, PASSWORD);
        newAccountModalWindow
                .openPage(NEW_ACCOUNT_MODAL_URL)
                .createAccountWithExit(account2);
        Assert.assertEquals(accountPage.getFieldValueByName("Account Name"), account2.getAccountName());
        Assert.assertEquals(accountPage.getFieldValueByName("Website"), account2.getWebsite());
        Assert.assertEquals(accountPage.getFieldValueByName("Type"), account2.getType());
        Assert.assertEquals(accountPage.getFieldValueByName("Description"), account2.getDescription());
        Assert.assertEquals(accountPage.getFieldValueByName("Phone"), account2.getPhone());

    }
}
