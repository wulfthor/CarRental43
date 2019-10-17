/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental43;

/**
 *
 * @author thor
 */
public class Customer {

	String name;
	String custType;
	String email;
	String Country;
	Address address;

	public Customer(String name, String custType, String email, String Country) {
		this.name = name;
		this.custType = custType;
		this.email = email;
		this.Country = Country;
	}

	public String getStreet() {
		return this.address.getStreet();
	}
	public String getName() {
		return this.name;
	}

	public void setAddress(String postalcity, String postalcode, String street, String streetNumber) {
		this.address = new Address(postalcity, postalcode, street, streetNumber);

	}

	public String toString() {
		String retVal;
		retVal = "Name:  " + this.name + "\n";
		retVal += "email:  " + this.email + "\n";
		retVal += "custType:  " + this.custType + "\n";
		retVal += "country:  " + this.Country + "\n";
		retVal += "Address:  " + this.address + "\n";
		return retVal;
	}

}
