package objects;

/**
 * The type Contact.
 */
public class Contact {
    private String accountName;
    private String firstName;
    private String lastName;
    private String phone;

    /**
     * Instantiates a new Contact.
     */
    public Contact(){

    }

    /**
     * Instantiates a new Contact.
     *
     * @param accountName the account name
     * @param firstName   the first name
     * @param lastName    the last name
     * @param phone       the phone
     */
    public Contact(String accountName, String firstName, String lastName, String phone) {
        this.accountName = accountName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    /**
     * Gets account name.
     *
     * @return the account name
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets account name.
     *
     * @param accountName the account name
     * @return the account name
     */
    public Contact setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     * @return the first name
     */
    public Contact setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     * @return the last name
     */
    public Contact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     *
     * @param phone the phone
     * @return the phone
     */
    public Contact setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
