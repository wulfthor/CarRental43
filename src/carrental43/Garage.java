package carrental43;

import com.sun.javafx.scene.shape.PathUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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

	public void fillWithCars(String filename) throws FileNotFoundException {
		Car tmpCar = null;
		/*
		Data-reminder
		
		Obs;Make;Model;Cylinders;Horsepower;MPG_City;MPG_Highway;Weight;Wheelbase;Year;Milage
		380;Toyota;Corolla CE 4dr;4;130;32;40;2502;102;2016;12378
		String make, String model, String type, int doors, int cyl, int HK, int MPG, int weight, int length, int year, int milage
		*/
		int carcounter = 0;
		String line ="";
		String[] lineArr = new String[12];
		String[] typeArr = new String[3];
		File myFH = new File(filename);
		Scanner myScanner = new Scanner(myFH);
		//must skip headers
		myScanner.nextLine();
		while (myScanner.hasNextLine()) {
			carcounter++;
			int fieldcounter=1;
			
			String make = "";
			String model = "";
			String type = "";
			int doors = 0;
			int cyl = 0;
			int id = 0;
			int HK = 0;
			int MPG = 0;
			int weight = 0;
			int length = 0;
			int year = 0;
			int milage = 0;
			
			// now handle each field
			line = myScanner.nextLine();
			lineArr = line.split(";");
			// handle make
			id = carcounter;
			make = lineArr[fieldcounter];
			fieldcounter++;
			// handle model,type and doors
			typeArr = lineArr[fieldcounter].split(" ");
			fieldcounter++;
			int limit=typeArr.length;
			int typecounter=0;
			String tmpString = lineArr[2];
			if (tmpString.contains("dr")) {
				// TODO: should filter door-number with regex
				// missing fields
				int idx = tmpString.indexOf("dr");
				String retVal = tmpString.substring(idx-1, idx);
			} else {
				doors = 4;
				while(typecounter<limit-1) {
					typecounter++;
					model += typeArr[typecounter];
				}
			}
			// handle cyl
			cyl = Integer.parseInt(lineArr[fieldcounter]);
			fieldcounter++;
			// handle horsepower
			HK = Integer.parseInt(lineArr[fieldcounter]);
			fieldcounter++;
			// handle Miles Per Gallon and incr twice for skip next
			MPG = Integer.parseInt(lineArr[fieldcounter]);
			fieldcounter++;
			fieldcounter++;
			// handle Weight
			weight = Integer.parseInt(lineArr[fieldcounter]);
			fieldcounter++;
			// handle wheelbase (længde mellem akslerne)
			length = Integer.parseInt(lineArr[fieldcounter]);
			fieldcounter++;
			// handle year
			year = Integer.parseInt(lineArr[fieldcounter]);
			fieldcounter++;
			// handle milage
			milage = Integer.parseInt(lineArr[fieldcounter]);
			fieldcounter++;
			// now create car
			tmpCar = new Car(make,model,type,doors,cyl,HK,MPG,weight,length,year,milage);
			tmpCar.setId(id);
			carList.add(tmpCar);
		}
	}

	public void addCar(Car car) {
		carList.add(car);
	}
	public void showCars() {
		for (Car car : carList) {
			System.out.println(car);
		}
	}

	public String toString() {
		String retVal = "";
		for (Car car : carList) {
			retVal += car.toString();
		}
		return retVal;
	}
	
}
