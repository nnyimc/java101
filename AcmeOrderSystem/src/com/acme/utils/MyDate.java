package com.acme.utils;

public class MyDate {
	public int month;
	public int day;
	public int year;
	
	{
		this.month = 1;
		this.day = 1;
		this.year = 2000;
	}
	
	public MyDate(){}
	
	public MyDate( int month, int day, int year ) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString() {
		return "Today's date is : " + month + "/" + day + "/" + year;
	}
	
	public void setDate( int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

}
