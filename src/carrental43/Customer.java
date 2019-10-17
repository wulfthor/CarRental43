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
	String street;
	String city;

	public Customer(String name, String custType, String email, String Country, String street, String city) {
		this.name = name;
		this.custType = custType;
		this.email = email;
		this.Country = Country;
		this.street = street;
		this.city = city;
	}

	public String getStreet() {
		return this.street;
	}

}
