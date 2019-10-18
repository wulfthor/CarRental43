package carrental43;

import com.sun.javafx.scene.shape.PathUtils;
import java.util.ArrayList;

public class Garage {
	String name;
	Address address;
	ArrayList<Car> carList;
	
	public Garage(String name) {
		this.name = name;
		this.address = null;
		this.carList = new ArrayList<Car>();
	}
	
	public void setAddress(String postalcity, String postalcode, String street, String streetNumber) {
		this.address = new Address(postalcity, postalcode, street, streetNumber);
	}

	public void addCar(Car car) {
		carList.add(car);
	}

	public String toString() {
		String retVal = "";
		for (Car car : carList) {
			retVal += car.toStringBasic();
		}
		return retVal;
	}
	
}
