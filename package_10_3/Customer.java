package package_10_3;
/*CISC 190 Programming Assignment 10-1
 * Written by Joshua Lopez
 *Customer class is a subclass of the Person superclass. Customer includes extra fields such as the idNumber and mailList variables. 
 *It also passes in the name, address, and number variables in its constructor to the Person constructor using the super keyword*/
public class Customer extends Person{
	
	private String customerNumber;
	private boolean receiveMail;

    public Customer(String name, String address, String number, String idNumber, boolean receiveMail) {
        super(name, address, number); // Call the superclass (Person) constructor
        this.customerNumber = idNumber;
        this.receiveMail = receiveMail;
    }
    
    public String getCustomerNumber() {
        return customerNumber;
    }

    public boolean inMailList() {
        return receiveMail;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setReceiveMail(boolean receiveMail) {
        this.receiveMail = receiveMail;
    }

}
