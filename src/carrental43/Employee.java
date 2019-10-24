package carrental43;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {
	int empId;
	String name;
	String role;
	Customer customer;
	Car car;
	Garage garage;
	OrderForm orderForm;
	Scanner myScan;
	
	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
		this.empId++;
		this.customer = null;
		this.car = null;
		this.myScan = new Scanner(System.in);
		this.garage = new Garage("Lyngby");
	}
	
	
	public void getCarsFromGarage( Garage garage) {
		garage.showCars();
	}
	
	public void showMenu() throws FileNotFoundException {
		int choice = 0;
		while (choice != 7){
			
			System.out.println("Welcome to the car rental");
			System.out.println("Main Menu - enter a number");
			System.out.println("0) Init");
			System.out.println("1) Show cars");
			System.out.println("2) Get customer info");
			System.out.println("3) Order car");
			System.out.println("4) Import car");
			System.out.println("5) Create garage");
			System.out.println("6) Run statistics");
			System.out.println("7) Exit");
			System.out.println("Enter a number: ");
			choice = myScan.nextInt();
			switch(choice) {
				case 0:
					initGarage("Data/testcars.csv");
					break;
				case 1:
					showCars();
					break;
				case 2:
					getCustomerInfo();
					break;
				case 3:
					orderCarRental();
					break;
				case 4:
					importCarFromFile();
					break;
				case 5:
					createGarage();
					break;
				case 6:
					runStats();
					break;
			}
		}
	}
	
	public void showCars(){
		int retFromCar = 0;
		while (retFromCar != -1) {
			this.garage.showCars();
			System.out.println("Enter number: (and -1 to return to main menu)");
			retFromCar = myScan.nextInt();
		}
	}
	
	public void getCustomerInfo(){
	}
	public void orderCarRental(){
		int choice = 0;
		// get ordered car
		// get details on carhire (name, pickup and deliver)
		Car myCar = null;
		while (choice != -1) {
			System.out.println("Welcome to the oder car dialog");
			System.out.println(" type -1 will return to main menu");
			System.out.println("Enter number of the car you want: ");
			int carChoice = myScan.nextInt();
			while (myCar == null) {
				myCar = garage.getCar(carChoice);
			}
			System.out.println("You have chosen: " + myCar);
			System.out.println("Enter Date of pickup (YYYY-MM-DD): ");
			String dateString = myScan.next();
			LocalDate pickupDate = LocalDate.parse(dateString);
			
			System.out.println("Enter time of pickup (HH-MM): ");
			String timeString = myScan.next();
			LocalTime pickupTime = LocalTime.parse(timeString);
			
			System.out.println("Enter Date of return (YYYY-MM-DD): ");
			String deliverDayString = myScan.next();
			LocalDate deliverDate = LocalDate.parse(deliverDayString);
			
			System.out.println("Enter time of delivery (HH-MM): ");
			String deliverString = myScan.next();
			myScan.nextLine();
			LocalTime deliverTime = LocalTime.parse(deliverString);
			
			System.out.println("Enter your email-address: ");
			String customerEmail = myScan.nextLine();
			
			System.out.println("Enter your name: ");
			String customerName = myScan.nextLine();
			Order myOrder = new Order(pickupDate, pickupTime, deliverDate, deliverTime, customerEmail, customerName, car);
			System.out.println("Order details: " );
			System.out.println(myOrder);
			myOrder.toString();
			System.out.println("Do you want to edit order? (y/n) " );
			String answer = myScan.nextLine();
			if (answer.equals("y")) {
				choice = -1;
			} else {
				choice = -1;
			}
		}
	}
	
	public void importCarFromFile(){
	}
	public void createGarage(){
	}
	public void runStats(){
	}
	public void initGarage(String filename) throws FileNotFoundException {
		this.garage.fillWithCars(filename);
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