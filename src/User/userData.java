package User;
public class userData {
    private static String firstName;
    private static String lastName;
    private static String NIC;
    private static String contactNo;
    private static String email;
    private static String password;
    private static String cardNumber;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getNIC() {
        return NIC;
    }
    public String getContactNo() {
        return contactNo;
    }
    public String getPassword() {
        return password;
    }
    public String getCardNumber() {
        return cardNumber;
    }
}
