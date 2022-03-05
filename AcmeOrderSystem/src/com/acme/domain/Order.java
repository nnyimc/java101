package com.acme.domain;
import com.acme.utils.MyDate;

public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	public static double taxRate;
	public static double TAX_ABSORPTION_THRESHOLD = 1500d;
	
	static {
		Order.taxRate = 0.05; 
	}
	
	public Order(MyDate d, double amt, String c){
		orderDate=d;
		orderAmount=amt;
		customer=c;
		product = "Anvil";
		quantity = 1;
	}
	
	public Order(MyDate d, double amt, String c,String p, int q){
		this(d, amt, c);
		product=p;
		quantity=q;
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
	
	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
}
