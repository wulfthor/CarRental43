/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental43;

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
	Scanner bookerScanner;
	HashMap<String, String> orderDetailsMap;

	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
		this.empId++;
		bookerScanner = new Scanner(System.in);
		orderDetailsMap = new HashMap<>();
	}

	public void getCustomerInfo() {
		System.out.println("Welcome to out CarRental");
		System.out.println("What is your name?");
		String name = bookerScanner.nextLine();
		System.out.println("What is your email?");
		String email = bookerScanner.nextLine();
		System.out.println("Are you individual or company(Ans: Individual or Company)");
		String custType = bookerScanner.nextLine();
		System.out.println("What country are you from? (DK,UK,DE,SE,NO)");
		String country = bookerScanner.nextLine();
		this.customer = new Customer(name, custType, email, country);
	}

	public HashMap<String, String> getOrderDetailsFromCustomer(Customer customer) {
		System.out.println("Let me take your order " + customer.getName());
		System.out.println("Enter date and time of day for pickup");
		String timeStartString = bookerScanner.nextLine();
		orderDetailsMap.put("starttime", timeStartString);
		System.out.println("Enter date and time of day for delivery");
		String timeStopString = bookerScanner.nextLine();
		orderDetailsMap.put("stoptime", timeStopString);
		System.out.println("Enter carnumber from list");
		String carnumber = bookerScanner.nextLine();
		orderDetailsMap.put("car", carnumber);
		return orderDetailsMap;
	}

	public String toString() {
		String retVal;
		retVal = "Name: " + this.name + "\n";
		retVal += "Role: "+ this.role + "\n";
		retVal += "Id: "+ this.empId + "\n";
		retVal += "Customer: "+ this.customer + "\n";
		return retVal;
	}
	

}
