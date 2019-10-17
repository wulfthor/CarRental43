package carrental43;

/**
 *
 * @author thor
 */
public class Address {

	int addressId;
	String street;
	String number;
	String postalcode;
	String postalcity;

	public Address(String postalcity, String postalcode, String street, String number) {
		this.addressId++ ;
		this.street = street;
		this.number = number;
		this.postalcity = postalcity;
		this.postalcode = postalcode;
	}

	public int getAddressId() {
		return addressId;
	}

	public String getStreet() {
		return street;
	}

	public String getNumber() {
		return number;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public String getPostalcity() {
		return postalcity;
	}
	
}
