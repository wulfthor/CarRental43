package carrental43;

import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class EmployeeTest {
	Employee booker;
	Customer customer;
	Car car;
	
	@Before
	public void setUp() {
		booker = new Employee("Laura","Booker");
		car = new Car("Acura","MDX","S",4,6,265,17,4451,106,1997,19);
		customer = new Customer("Anton Verner","Individual","test@verner.dk","DK");
		customer.setAddress("Odense C","5000", "Vildgade", "12");
	}



	@Test
	public void getOrderDetailsFromCustomer() {
		HashMap<String, String> orderDetails = booker.getOrderDetailsFromCustomer(customer);
		int expectedsize = 5;
		int actualsize = orderDetails.size();
		assertEquals(expectedsize, actualsize);
	}

	/**
	 * Test of getCustomerInfo method, of class Employee.
	 */
	@Test
	public void testGetCustomerInfo() {
		System.out.println("getCustomerInfo");
		booker.getCustomerInfo();
	}

}
