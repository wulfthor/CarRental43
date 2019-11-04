package Model;

import Util.IdFactory;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author thor
 */
public class Order {
	
		private String orderDateTime; 
		private LocalDate pickupDate; 
		private LocalTime pickupTime;
		private LocalDate deliverDate;
		private LocalTime deliverTime;
		private Customer customer;
		private double price;
		private Car car;
		private int orderId;

	public Order(LocalDate pickupDate, LocalTime pickupTime, LocalDate deliverDate, LocalTime deliverTime, Car car) {
		this.orderDateTime = new SimpleDateFormat("YYYY-MM-dd HH:mm").format(new Date());
		this.pickupDate = pickupDate;
		this.pickupTime = pickupTime;
		this.deliverDate = deliverDate;
		this.deliverTime = deliverTime;
		this.car = car;
		this.price = 0;
		this.orderId = IdFactory.getOrderId();
	}

	public void writeOrderToFile(String filename) {

	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public LocalDate getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(LocalDate pickupDate) {
		this.pickupDate = pickupDate;
	}

	public LocalTime getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(LocalTime pickupTime) {
		this.pickupTime = pickupTime;
	}

	public LocalDate getDeliverDate() {
		return deliverDate;
	}

	public void setDeliverDate(LocalDate deliverDate) {
		this.deliverDate = deliverDate;
	}

	public LocalTime getDeliverTime() {
		return deliverTime;
	}

	public void setDeliverTime(LocalTime deliverTime) {
		this.deliverTime = deliverTime;
	}

	public Car getCar() {
		return car;
	}
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String toStringtoFile() {
		String retString = "";
		retString+= orderId + ";";
		retString+= orderDateTime + ";";
		retString+= price + ";";
		retString += pickupDate + ";";
		retString+= pickupTime + ";";
		retString+= deliverDate + ";";
		retString+= deliverTime + ";";
		retString+= customer.getEmail()+ ";";
		retString+= customer.getName()+ ";";
		retString+= car.getId()+ ";";
		retString+= car.getMake()+ ";";
		retString+= car.getRegNr() + ";";
		return retString;
	}

	public String getOrderDateTime() {
		return orderDateTime;
	}

	public Customer getCustomer() {
		return customer;
	}

	public int getOrderId() {
		return orderId;
	}

	@Override
	public String toString() {
		String retString = "";
		retString+= "orderId: " + orderId;
		retString+= "orderedAt: " + orderDateTime;
		retString+= "price: " + price;
		retString += "pickupDate:  " + pickupDate;
		retString+= "pickupTime: " + pickupTime;
		retString+= "deliverDate: " + deliverDate;
		retString+= "deliverTime: " + deliverTime ;
		retString+= "customerEmail: " + customer.getEmail();
		retString+= "customerName: " + customer.getName();
		retString+= "car: " + car.getId() + ";" + car.getMake();
		return retString;
	}

	
	
	
}
