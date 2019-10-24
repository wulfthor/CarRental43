package carrental43;
public class IdFactory {
	static int orderId;
	static int customerId;
	

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
