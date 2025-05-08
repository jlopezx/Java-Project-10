package package_10_3;
import java.util.Scanner;
/*CISC 190 Programming Assignment 10-1
 * Written by Joshua Lopez
 *CustomerDemo demostrates the Customer class which is a subclass of the Person class. 
 *In this demo, we ask the user to input a series of information pertaining to a customer. 
 *Once we have our info, we print the customer's info that was entered. */
public class CustomerDemo {

	public static void main(String[] args) {
		
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.print("Enter name of customer: ");
			String name = keyboard.nextLine();
			
			System.out.print("Enter address of customer: ");
			String address = keyboard.nextLine();
			
			System.out.print("Enter phone number of customer: ");
			String phoneNumber = keyboard.nextLine();
			
			System.out.print("Enter customer number: ");
			String customerNumber = keyboard.nextLine();
			
			System.out.print("Enter yes/no -- does the customer want to receive mail?:");
			String mailListString = keyboard.nextLine();
			
			boolean receiveMail = (mailListString.equalsIgnoreCase("yes") || mailListString.equalsIgnoreCase("y"));
			
			Customer customer = new Customer(name, address, phoneNumber, customerNumber, receiveMail);
			
			System.out.println();
			System.out.println("Customer:");
			System.out.println("Name: " + customer.getName());
			System.out.println("Address: " + customer.getAddress());
			System.out.println("Phone Number: " + customer.getNumber());
			System.out.println("Customer Number: " + customer.getCustomerNumber());
			System.out.println("Receive Mail?: " + customer.inMailList());
		}

	}

}
