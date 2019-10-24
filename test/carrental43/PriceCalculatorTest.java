package carrental43;

import java.time.LocalDate;
import java.time.LocalTime;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PriceCalculatorTest {
	Car myCar;
	Order myOrder;
	PriceCalculator priceCalculator;
	
	@Before
	public void setUp() {
		String make = "Acura";
		String model = "RSX";
		String type = "S";
		int doors = 2;
		int cyl = 4;
		int HK = 200;
		int MPG = 24;
		int weight = 2778;
		int length = 101;
		int year = 1998;
		int milage = 12000;
		
		LocalDate pickupDate = LocalDate.now();
		LocalTime pickupTime = LocalTime.of(10,30);
		LocalDate deliverDate = pickupDate.plusDays(4);
		LocalTime deliverTime = LocalTime.of(12,30);
		String customerEmail = "kurt@gmail.com";
		String customerName = "Kurt Verner";
		int orderId = 123;
		myCar = new Car(make, model, type, doors, cyl, HK, MPG, weight, length, year, milage);
		myOrder = new Order(pickupDate, pickupTime, deliverDate, deliverTime, customerEmail, customerName, myCar);
		priceCalculator = new PriceCalculator(myCar,myOrder);
	}
	
	@Test
	public void testSomeMethod() {
		// TODO review the generated test code and remove the default call to fail.
		int expectedPrice = 1200;
		int actualPrice = priceCalculator.getPrice();
		assertEquals(expectedPrice, actualPrice);
	}
	
}
