/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental43;

import java.io.FileNotFoundException;

/**
 *
 * @author thor
 */
public class CarRental43 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO code application logic here
		Employee emp = new Employee("Laura", "Booker");
		emp.showMenu();
	}
	
}
