package objects;

public class Account {
    private String accountName;
    private String website;
    private String type;
    private String description;
    private String phone;

    public Account(){

    }

    public Account(String accountName, String website, String type, String description, String phone) {
        this.accountName = accountName;
        this.website = website;
        this.type = type;
        this.description = description;
        this.phone = phone;
    }

    public String getAccountName() {
        return accountName;
    }

    public Account setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public Account setWebsite(String website) {
        this.website = website;
        return this;
    }

    public String getType() {
        return type;
    }

    public Account setType(String type) {
        this.type = type;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Account setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Account setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
