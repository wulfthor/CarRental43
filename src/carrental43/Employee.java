package carrental43;

import java.io.File;
import java.io.FileNotFoundException;
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