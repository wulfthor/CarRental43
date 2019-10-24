/*
the formula for a price:
baseprice * cyl * (weight/1000) * (HK/10)
num of days * baseprice
 */
package carrental43;

import java.time.Period;

/**
 *
 * @author thor
 */
public class PriceCalculator {
	Car myCar;
	Order myOrder;
	int basePrice;

	public PriceCalculator(Car myCar, Order myOrder) {
		this.myCar = myCar;
		this.myOrder = myOrder;
		this.basePrice = 2;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	public int calcDays(Order order) {
		Period days = order.pickupDate.until(order.deliverDate);
		return days.getDays();
	}

	public double getPrice() {
		double retValPrice;
		retValPrice = basePrice * myCar.getCyl() ;
		retValPrice *= myCar.getWeight()/1000 ;
		retValPrice *= myCar.getHK()/10;
		retValPrice *=calcDays(myOrder);
		return retValPrice;
	}
	
}
