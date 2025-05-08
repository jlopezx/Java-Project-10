package package_10_3;
/*CISC 190 Programming Assignment 10-1
 * Written by Joshua Lopez
 *Person class is a superclass. It includes the basics of a person such as the name, address, and number.*/

public class Person {
	
    private String name;
    private String address;
    private String number;

    public Person(String n, String a, String num) {
        name = n;
        address = a;
        number = num;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setNumber(String n) {
        number = n;
    }
}
