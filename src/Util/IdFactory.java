package Util;
public class IdFactory {
	static int orderId;
	static int carId;
	static int customerId;
	

	public static int getCarId() {
		carId += 1000;
		carId++;
		return carId;
	}

	public static int getOrderId() {
		orderId += 100;
		orderId++;
		return orderId;
	}

	public int getCustomerId() {
		customerId++;
		customerId += 10000;
		return customerId;
	}
}
