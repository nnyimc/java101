package com.acme.domain;

import com.acme.domain.Good.UnitOfMeasureType;
import com.acme.utils.MyDate;

public class Order {
	private MyDate orderDate;
	private double orderAmount = 0.00;
	private String customer;
	private Product product;
	private int quantity;
	public static double taxRate;
	public final static double TAX_ABSORPTION_THRESHOLD = 1500d;
	private static Rushable rushable;

	static {
		Order.taxRate = 0.05;
	}

	public Order(MyDate d, double amt, String c) {
		setOrderDate(d);
		if (isPositive(amt)) {
			orderAmount = amt;
		}
		customer = c;
		product = new Solid("Anvil", 1, 0.95, UnitOfMeasureType.CUBIC_FEET, false, 98.27, 0.91, 1.10);
		quantity = 1;
	}

	public Order(MyDate d, double amt, String c, Product p, int q) {
		this(d, amt, c);
		product = p;
		if (isPositive(q)) {
			quantity = q;
		}

	}

	public static void setTaxRate(double taxRate) {
		Order.taxRate = taxRate;
	}

	public static void computeTaxes(double amount) {
		System.out.println("The tax for " + amount + " is: " + amount * Order.taxRate);
	}

	public double computeTaxes() {
		System.out.println("The tax for " + this.orderAmount + " is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
	}

	public char jobSize() {
		if (quantity <= 25) {
			return 'S';
		} else if (quantity < 75) {
			return 'M';
		} else if (quantity <= 150) {
			return 'L';
		}
		return 'X';
	}

	public double computeTotal() {
		switch (jobSize()) {
		case 'S':
			if (orderAmount > TAX_ABSORPTION_THRESHOLD) {
				return orderAmount;
			} else {
				return orderAmount + computeTaxes();
			}
		case 'M':
			if (orderAmount > TAX_ABSORPTION_THRESHOLD) {
				return orderAmount - (orderAmount / 100);
			} else {
				return orderAmount - (orderAmount / 100) + computeTaxes();
			}
		case 'L':
			if (orderAmount > TAX_ABSORPTION_THRESHOLD) {
				return orderAmount - ((orderAmount / 100) * 2);
			} else {
				return orderAmount - ((orderAmount / 100) * 2) + computeTaxes();
			}
		default:
			if (orderAmount > TAX_ABSORPTION_THRESHOLD) {
				return orderAmount - ((orderAmount / 100) * 3);
			} else {
				return orderAmount - ((orderAmount / 100) * 3) + computeTaxes();
			}
		}
	}

	public static Rushable getRushable() {
		return rushable;
	}

	public static void setRushable(Rushable rushable) {
		Order.rushable = rushable;
	}

	public boolean isPriorityOrder() {
		boolean priorityOrder = false;
		if (rushable != null) {
			priorityOrder = rushable.isRushable(orderDate, orderAmount);
		}
		return priorityOrder;
	}

	public MyDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(MyDate orderDate) {
		 if (isHoliday(orderDate)) {
			 System.out.println("Order date, " + orderDate + ", cannot be set to a holiday!");
		 } else {
			 this.orderDate = orderDate;
		 }
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		if (isPositive(orderAmount)) {
			this.orderAmount = orderAmount;
		}
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (isPositive(quantity)) {
			this.quantity = quantity;
		}
	}

	private boolean isPositive(double orderAmount) {
		if (orderAmount > 0) {
			return true;
		}
		return false;
	}

	public static double getTaxRate() {
		return taxRate;
	}

	public static double getTaxAbsorptionThreshold() {
		return TAX_ABSORPTION_THRESHOLD;
	}

	private boolean isHoliday(MyDate proposedDate) {
		boolean result = false;
		for (MyDate holiday : MyDate.getHolidays()) {
			if (holiday.equals(proposedDate)) {
				result = true;
			}
		}
		return result;
	}

	public String toString() {
		return quantity + " ea. " + product + " for " + customer;
	}

}
