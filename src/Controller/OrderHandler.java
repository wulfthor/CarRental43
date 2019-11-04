package Controller;

import Model.Order;
import com.sun.corba.se.spi.activation.EndpointInfoListHolder;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author thor
 */
public class OrderHandler {
	ArrayList<Order> activeOrders;

	public OrderHandler() {
		activeOrders = new ArrayList<>();
	}

	public void addOrderToList(Order order)  {
		activeOrders.add(order);
	}
	public void moveOrderToArchive(Order order) throws IOException  {
		activeOrders.remove(order);
		File fh = new File("Data/AllOrders");
		FileWriter fw = new FileWriter(fh,true);
		BufferedWriter  bw = new BufferedWriter(fw);
		bw.write(order.toStringtoFile());
		bw.newLine();
		bw.close();
	}

	public Order getOrderById(int id) {
		Order  tmpOrder = null;
		for (Order  o: activeOrders) {
			if (o.getOrderId() == id) {
				return o;
			}
		}
		return tmpOrder;
	}
}
