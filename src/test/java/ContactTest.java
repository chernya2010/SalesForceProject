import objects.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    /**
     * Check contact exist in contact list test.
     *
     * @throws InterruptedException the interrupted exception
     */
    @Test
    public void checkContactExistInContactListTest() throws InterruptedException {
        Contact contact1 = new Contact();
        contact1.setLastName("Lastname" + numberGenerator.generateRandomInt(50))
                .setAccountName("asd")
                .setPhone(String.valueOf(numberGenerator.generateRandomInt(1000000)));
        loginPage
                .openPage(LOGIN_URL)
                .login(USERNAME, PASSWORD);
        newContactModalWindow
                .openPage(NEW_CONTACT_MODAL_URL)
                .createContactWithExit(contact1);
        contactListPage
                .openPage(CONTACT_LIST_URL);
        Assert.assertEquals(contactListPage.getExistLastName(contact1.getLastName()), contact1.getLastName());
        Assert.assertEquals(contactListPage.getExistAccountNameByContactName(contact1.getAccountName()), contact1.getAccountName());
        Assert.assertEquals(contactListPage.getExistPhoneByContactName(contact1.getLastName()), contact1.getPhone());
        Assert.assertEquals(contactListPage.getExistContactOwnerByContactName(contact1.getLastName()), "ACher");
    }

    /**
     * Check contact data on contact page test.
     *
     * @throws InterruptedException the interrupted exception
     */
    @Test
    public void checkContactDataOnContactPageTest() throws InterruptedException {
        Contact contact2 = new Contact();
        contact2.setFirstName("Firstname" + numberGenerator.generateRandomInt(50))
                .setLastName("Lastname" + numberGenerator.generateRandomInt(50))
                .setAccountName("asd")
                .setPhone(String.valueOf(numberGenerator.generateRandomInt(1000000)));
        loginPage
                .openPage(LOGIN_URL)
                .login(USERNAME, PASSWORD);
        newContactModalWindow
                .openPage(NEW_CONTACT_MODAL_URL)
                .createContactWithExit(contact2);
        Assert.assertEquals(contactPage.getFieldValueByName("Name"), contact2.getFirstName() + " " + contact2.getLastName());
        Assert.assertEquals(contactPage.getAccountOnContactPageByName("Account Name"), contact2.getAccountName());
        Assert.assertEquals(contactPage.getFieldValueByName("Phone"), contact2.getPhone());

    }
}
