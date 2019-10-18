package carrental43;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class Employee {
	int empId;
	String name;
	String role;
	Customer customer;
	Car car;
	
	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
		this.empId++;
		this.customer = null;
		this.car = null;
	}
	
	public ArrayList<Car> importCarsFromFilename(String filename) throws FileNotFoundException {
		ArrayList<Car> myImpCars = new ArrayList<>();
		Car tmpCar = null;
		// Obs;Make;Model;Cylinders;Horsepower;MPG_City;MPG_Highway;Weight;Wheelbase;Year;Milage
		// 380;Toyota;Corolla CE 4dr;4;130;32;40;2502;102;2016;12378
		//String make, String model, String type, int doors, int cyl, int HK, int MPG, int weight, int length, int year, int milage
		String line ="";
		String[] lineArr = new String[12];
		String[] typeArr = new String[3];
		File myFH = new File(filename);
		Scanner myScanner = new Scanner(myFH);
		//must skip headers
		myScanner.nextLine();
		while (myScanner.hasNextLine()) {
			int fieldcounter=1;
			
			String make = "";
			String model = "";
			String type = "";
			int doors = 0;
			int cyl = 0;
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
			make = lineArr[fieldcounter];
			fieldcounter++;
			// handle model,type and doors
			typeArr = lineArr[fieldcounter].split(" ");
			fieldcounter++;
			int limit=typeArr.length;
			int typecounter=0;
			if (lineArr[2].contains("dr")) {
				// TODO: should filter door-number with regex
				doors = 2;
				while(typecounter<limit-2) {
					typecounter++;
					model += typeArr[typecounter];
				}
			} else {
				doors = 4;
				while(typecounter<limit-1) {
					typecounter++;
					model += typeArr[typecounter];
				}
			}
			/*
			System.out.println(lineArr[2]);
			System.out.println("MODEL: " + model);
			System.out.println("MAKE: " + make);
*/
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
			//String make, String model, String type, int doors, int cyl, int HK, int MPG, int weight, int length, int year, int milage
			tmpCar = new Car(make,model,type,doors,cyl,HK,MPG,weight,length,year,milage);
			myImpCars.add(tmpCar);
		}
		return myImpCars;
	}
	
	
	public String toString() {
		String retVal;
		retVal = "Name: " + this.name + "\n";
		retVal += "Role: "+ this.role + "\n";
		retVal += "Id: "+ this.empId + "\n";
		if (!(this.customer == null)) {
			retVal += "Customer: "+ this.customer + "\n";
		}
		return retVal;
	}
	
	
}