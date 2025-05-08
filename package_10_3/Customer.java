package package_10_3;
/*CISC 190 Programming Assignment 10-1
 * Written by Joshua Lopez
 *Customer class is a subclass of the Person superclass. Customer includes extra fields such as the idNumber and mailList variables. 
 *It also passes in the name, address, and number variables in its constructor to the Person constructor using the super keyword*/
public class Customer extends Person{

	private String idNumber;
    private boolean mailList;

    public Customer(String name, String address, String number, String idNumber, boolean mailList) {
        super(name, address, number); // Call the superclass (Person) constructor
        this.idNumber = idNumber;
        this.mailList = mailList;
    }
    
    public String getCustomerNumber() {
        return idNumber;
    }

    public boolean inMailList() {
        return mailList;
    }

    public void setCustomerNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setReceiveMail(boolean receiveMail) {
        this.mailList = receiveMail;
    }

}
