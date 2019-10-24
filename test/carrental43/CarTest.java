package carrental43;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class CarTest {
	Car myCar;
	
	@Before
	public void setUp() {
		// String make, String model, String type, int doors, int cyl, int HK, int MPG,int weight, int length, int year, int milage
		//Obs;Make;Model;Cylinders;Horsepower;MPG_City;MPG_Highway;Weight;Wheelbase;Year;Milage
		//1;Acura;MDX;6;265;17;23;4451;106;1997;19
		//2;Acura;RSX Type S 2dr;4;200;24;31;2778;101;1998;12000
		myCar = new Car("Acura","RSX","S",4,6,265,17,4451,106,1997,19);
	}

	@Test
	public void testgetMake() {
		String expected = "Acura";
		String actual = myCar.getMake();
		assertEquals(expected, actual);
	}

	
}
