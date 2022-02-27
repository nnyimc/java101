package com.acme.domain;
import com.acme.utils.MyDate;

public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	public static double taxRate;
	
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
	
	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
}
