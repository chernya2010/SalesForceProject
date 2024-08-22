package objects;

public class Contact {
    private String accountName;
    private String firstName;
    private String lastName;
    private String phone;

    public Contact(){

    }

    public Contact(String accountName, String firstName, String lastName, String phone) {
        this.accountName = accountName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getAccountName() {
        return accountName;
    }

    public Contact setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Contact setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Contact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Contact setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
