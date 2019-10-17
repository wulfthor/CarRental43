/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package carrental43;

/**
 *
 * @author thor
 */
public class CarRental43 {
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Employee booker = new Employee("Laura","Booker");
		Car car = new Car("Acura","MDX","S",4,6,265,17,4451,106,1997,19);
		Customer customer = new Customer("Anton Verner","Individual","test@verner.dk","DK");
		customer.setAddress("Odense C","5000", "Vildgade", "12");
		booker.getCustomerInfo();
		System.out.println(booker);
	}
	
}
