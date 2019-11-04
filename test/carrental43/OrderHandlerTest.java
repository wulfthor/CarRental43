package carrental43;

import Controller.OrderHandler;
import Model.Order;
import Model.Car;
import Core.PriceCalculator;
import Model.Customer;
import Model.Address;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class OrderHandlerTest {
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
	Scanner myScanner;
	PriceCalculator priceCalculator;
	OrderHandler myOrderHandler;
	double price;
	
	
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
		
		String make2 = "Volkswagen";
		String model2 = "Phaeton";
		String type2 = "W12";
		String regNr = "AH23145";
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
		myCar1.setReturned("N");
		myOrder = new Order(pickupDate, pickupTime, deliverDate, deliverTime, myCar1);
		myOrder.setCustomer(myCustomer);
		priceCalculator = new PriceCalculator(myCar1,myOrder);
		price = priceCalculator.getPrice();
		myOrder.setPrice(price);
		
	}
	@Test
	public void testaddOrderToList() {
		myOrderHandler = new OrderHandler();
		myOrderHandler.addOrderToList(myOrder);
	}
	
	@Test
	public void testwriteToFile() throws IOException {
		myOrderHandler = new OrderHandler();
		myOrderHandler.moveOrderToArchive(myOrder);
	}
	
}
