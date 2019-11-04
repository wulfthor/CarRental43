package carrental43;

import Model.Order;
import Model.Car;
import Core.PriceCalculator;
import Model.Customer;
import java.time.LocalDate;
import java.time.LocalTime;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PriceCalculatorTest {
	Car myCar;
	Order myOrder;
	PriceCalculator priceCalculator;
	Customer myCustomer;
	
	@Before
	public void setUp() {
		String make = "Acura";
		String model = "RSX";
		String type = "S";
		String regNr = "XY34221";
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
		myCustomer = new Customer(customerName, "private", customerEmail, "DK");
		myCustomer.setAddress("Odense", "5000", "Gravervej", "12");
		int orderId = 123;
		myCar = new Car(make, model, type, doors, cyl, HK, MPG, weight, length, year, milage, regNr);
		myOrder = new Order(pickupDate, pickupTime, deliverDate, deliverTime, myCar);
		myOrder.setCustomer(myCustomer);
		priceCalculator = new PriceCalculator(myCar,myOrder);
	}
	
	@Test
	public void testSomeMethod() {
		// TODO review the generated test code and remove the default call to fail.
		double expectedPrice = 1280.0;
		double actualPrice = priceCalculator.getPrice();
		assertEquals(expectedPrice, actualPrice, 0.0001);
	}
	
}
