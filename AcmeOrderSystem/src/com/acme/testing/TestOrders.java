package com.acme.testing;

import com.acme.domain.Order;
import com.acme.utils.MyDate;

public class TestOrders {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyDate date1 = new MyDate(1, 20, 2008);
		Order anvilOrder = new Order(date1, 2000.00, "Wile E Coyote", "Anvil", 10);
		System.out.println(anvilOrder);
		anvilOrder.computeTaxes();

		MyDate date2 = new MyDate(4, 10, 2008);
		Order balloonsOrder = new Order(date2, 1000.00, "Bugs Bunny", "Balloon", 125);
		System.out.println(balloonsOrder);
		balloonsOrder.computeTaxes();

		System.out.println("The tax Rate is currently: " + Order.taxRate);
		Order.computeTaxes(3000.00);

		Order.setTaxRate(0.06);
		System.out.println("The tax Rate is currently: " + Order.taxRate);
		Order.computeTaxes(3000.00);
		anvilOrder.computeTaxes();
		balloonsOrder.computeTaxes();

		MyDate date3 = new MyDate(5, 20, 2008);
		Order anotherAnvil = new Order(date3, 200, "Road Runner");
		System.out.println(anotherAnvil);

		System.out.println("The total bill for: " + anvilOrder + " is " + anvilOrder.computeTotal());
		System.out.println("The total bill for: " + balloonsOrder + " is " + balloonsOrder.computeTotal());
	}

}
