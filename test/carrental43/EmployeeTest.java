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
	Employee admin;
	Garage garage;
	
	@Before
	public void setUp() {
		admin = new Employee("Mette","Admin");
		garage = new Garage("Gentofte");
		garage.setAddress("Gentofte","2820", "Lindevej", "12");
	}

	@Test
	public void testfillGarageFromFile(String filename) {
		admin.fillGarageFromFile(filename);
		int expectedsize = 5;
		int actualsize = orderDetails.size();
		assertEquals(expectedsize, actualsize);

	}
	
}
