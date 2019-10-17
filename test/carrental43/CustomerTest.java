/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental43;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class CustomerTest {
	Customer myCustomer;
	
	@Before
	public void setUp() {
		myCustomer = new Customer("Anton Verner","Individual","test@verner.dk","DK","Vildgade 12","5000 Odense C");
	}

	@Test
	public void testgetStreet() {
		String expected = "Vildgade 12";
		String actual = myCustomer.getStreet();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testgetAddress() {
		String expected = "Vildgade 12";
		String actual = myCustomer.Address.getStreet();
		assertEquals(expected, actual);
	}
}
