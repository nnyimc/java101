package com.acme.domain;
import com.acme.utils.MyDate;

public class Order {
	private MyDate orderDate;
	private double orderAmount = 0.00;
	private String customer;
	private String product;
	private int quantity;
	public static double taxRate;
	public final static double TAX_ABSORPTION_THRESHOLD = 1500d;
	
	static {
		Order.taxRate = 0.05; 
	}
	
	public Order(MyDate d, double amt, String c){
		orderDate=d;
		if (isPositive(amt)) {
			orderAmount=amt;
		}
		customer=c;
		product = "Anvil";
		quantity = 1;
	}
	
	public Order(MyDate d, double amt, String c,String p, int q){
		this(d, amt, c);
		product=p;
		if (isPositive(q)) {
			quantity=q;
		}
		
	}
	
	public static void setTaxRate(double taxRate) {
		Order.taxRate = taxRate;
	}
	
	public static void computeTaxes(double amount) {
		 System.out.println( "The tax for " + amount +  " is: " + amount * Order.taxRate);
	}
	
	public double computeTaxes() {
		System.out.println( "The tax for " +  this.orderAmount +  " is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
	}
	
	public char jobSize() {
		if (quantity <= 25) {
			return 'S';
		} else if (quantity < 75) {
			return 'M';
		} else if (quantity <=150) {
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
					return orderAmount - (orderAmount/100);
				} else {
					return orderAmount - (orderAmount/100) + computeTaxes();
				}
			case 'L':
				if (orderAmount > TAX_ABSORPTION_THRESHOLD) {
					return orderAmount - ((orderAmount/100)*2);
				} else {
					return orderAmount - ((orderAmount/100)*2) + computeTaxes();
				}
			default:
				if (orderAmount > TAX_ABSORPTION_THRESHOLD) {
					return orderAmount - ((orderAmount/100)*3);
				} else {
					return orderAmount - ((orderAmount/100)*3) + computeTaxes();
				}		
		}
	}
	
	public MyDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(MyDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		if ( isPositive(orderAmount) ) {
			this.orderAmount = orderAmount;
		}
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if ( isPositive(quantity) ) {
			this.quantity = quantity;
		}
	}


	private boolean isPositive(double orderAmount) {
		if ( orderAmount > 0) {
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

	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
}
