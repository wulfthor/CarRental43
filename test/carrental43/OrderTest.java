package carrental43;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class OrderTest {
	LocalDate pickupDate;
	LocalTime pickupTime;
	LocalDate deliverDate;
	LocalTime deliverTime;
	Customer myCustomer;
	Address myAddress;
	String targetFile;
	String allOrderFile;
	Order myOrder;
	Car myCar1;
	Car myCar2;
	PriceCalculator myPriceCalculator;
	Scanner myScanner;
	double price;
	
	
	@Before
	public void setUp() {
		String make = "Acura";
		String model = "RSX";
		String type = "S";
		String regNr = "BR23441";
		int doors = 2;
		int cyl = 4;
		int HK = 200;
		int MPG = 24;
		int weight = 2778;
		int length = 101;
		int year = 1998;
		int milage = 12000;
		
		String make2 = "Volkswagen";
		String model2 = "Phaeton";
		String type2 = "W12";
		String regNr2 = "XR65221";
		int doors2 = 4;
		int cyl2 = 12;
		int HK2 = 420;
		int MPG2 = 12;
		int weight2 = 5399;
		int length2 = 118;
		int year2 = 2009;
		int milage2 = 86763;
		
		//ArrayList<Car> cars = new ArrayList<>();
		pickupDate = LocalDate.now();
		pickupTime = LocalTime.of(10,30);
		deliverDate = pickupDate.plusDays(4);
		deliverTime = LocalTime.of(12,30);
		allOrderFile = "Data/allOrders.txt";
		myCustomer = new Customer("Anton Verner","Individual","test@verner.dk","DK");
		myCustomer.setAddress("Odense C","5000", "Vildgade", "12");
		int orderId = 123;
		myCar1 = new Car(make, model, type, doors, cyl, HK, MPG, weight, length, year, milage, regNr);
		//myCar2 = new Car(make2, model2, type2, doors2, cyl2, HK2, MPG2, weight2, length2, year2, milage2);
		//cars.add(myCar1);
		//cars.add(myCar2);
	}
	
	
	/**
	 * Test of getPickupDate method, of class Order.
	 */
	@Test
	public void testGetPickupDate() {
		System.out.println("getPickupDate");
		myOrder = new Order(pickupDate, pickupTime, deliverDate, deliverTime, myCar1);
		myOrder.setCustomer(myCustomer);
			LocalDate expResult = null;
			LocalDate result = myOrder.getPickupDate();
			assertEquals(expResult, result);
	}
	
	
	
	/**
	 * Test of setPrice method, of class Order.
	 */
	@Test
	public void testSetPrice() {
		System.out.println("setPrice");
		myOrder = new Order(pickupDate, pickupTime, deliverDate, deliverTime, myCar1);
		myOrder.setCustomer(myCustomer);
		myPriceCalculator = new PriceCalculator(myCar1, myOrder);
		double price = myPriceCalculator.getPrice();
		myOrder.setPrice(price);
		double actual = myOrder.getPrice();
		double expected = 12.0;
		assertEquals(expected, actual,0.01);
		// TODO review the generated test code and remove the default call to fail.
	}
}
