package carrental43;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author thor
 */
public class Order {
	
		LocalDate pickupDate; 
		LocalTime pickupTime;
		LocalDate deliverDate;
		LocalTime deliverTime;
		String customerEmail;
		String customerName;
		Car car;
		int orderId;

	public Order(LocalDate pickupDate, LocalTime pickupTime, LocalDate deliverDate, LocalTime deliverTime, String customerEmail, String customerName, Car car) {
		this.pickupDate = pickupDate;
		this.pickupTime = pickupTime;
		this.deliverDate = deliverDate;
		this.deliverTime = deliverTime;
		this.customerEmail = customerEmail;
		this.customerName = customerName;
		this.car = car;
		this.orderId = IdFactory.getOrderId();
	}

	public void writeOrderToFile(String filename) {

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

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		String retString = "";
		retString+= "orderId: " + orderId;
		retString += "pickupDate:  " + pickupDate;
		retString+= "pickupTime: " + pickupTime;
		retString+= "deliverDate: " + deliverDate;
		retString+= "deliverTime: " + deliverTime + "\n";
		retString+= "customerEmail: " + customerEmail;
		retString+= "customerName: " + customerName;
		retString+= "car: " + orderId + "\n";
		return retString;
	}

	
	
	
}
