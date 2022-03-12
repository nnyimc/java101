package com.acme.testing;

import com.acme.domain.Good.UnitOfMeasureType;
import com.acme.domain.Order;
import com.acme.domain.Service;
import com.acme.domain.Solid;
import com.acme.utils.MyDate;

public class TestOrders {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyDate date1 = new MyDate(1, 20, 2008);
		Solid s1 = new Solid("Acme Anvil", 1668, 0.3,
				 UnitOfMeasureType.CUBIC_METER, false, 500, 0.25, 0.3);
		Order anvilOrder = new Order(date1, 2000.00, "Wile E Coyote", s1, 10);
		System.out.println(anvilOrder);
		anvilOrder.computeTaxes();

		MyDate date2 = new MyDate(4, 10, 2008);
		Solid s2 = new Solid("Acme Balloon", 1401, 15,
				 UnitOfMeasureType.CUBIC_FEET, false, 10, 5, 5);
		Order balloonsOrder = new Order(date2, 1000.00, "Bugs Bunny", s2, 125);
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
		
		balloonsOrder.setQuantity(-2);
		
		System.out.println("The volume of the anvil is: " + anotherAnvil.getProduct().getName());
		System.out.println("The length of the anvil is: " + ( (Solid) anotherAnvil.getProduct() ).getLength());

		MyDate date4 = new MyDate(2,3,2020);
		Service service1 = new Service("Road Runner Eradication", 10, false);
		Order birdEradication = new Order (date4, 20000, "Daffy Duck", service1, 2);
		System.out.println("The total bill for " + birdEradication + " is " + birdEradication.computeTotal());
		
	}

}
