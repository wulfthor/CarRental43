package carrental43;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class EmployeeTest {
	String filename;
	Employee admin;
	Garage garage;
	
	@Before
	public void setUp() {
		filename = "Data/cars.csv";
		admin = new Employee("Mette","Admin");
		garage = new Garage("Gentofte");
		garage.setAddress("Gentofte","2820", "Lindevej", "12");
	}
	
	@Test
	public void testImportCarsFromFilename() throws Exception {
		System.out.println("importCarsFromFilename");
		ArrayList<Car> myCar = admin.importCarsFromFilename(filename);
		for (Car car : myCar) {
			garage.addCar(car);
		}
		String retVal = garage.toString();
		System.out.print(retVal);
		int actual = myCar.size();
		int expected = 8;
		assertEquals(expected, actual);
	}
	
}
