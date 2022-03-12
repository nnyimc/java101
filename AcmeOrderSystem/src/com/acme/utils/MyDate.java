package com.acme.utils;

public class MyDate {
	private byte month;
	private byte day;
	private short year;
	
	{
		this.month = 1;
		this.day = 1;
		this.year = 2000;
	}
	
	public MyDate(){
		
	}
	
	public MyDate( int month, int day, int year ) {
		if (valid(day, month, year)) {
			this.day = (byte) day;
			this.month = (byte) month;
			this.year = (short) year;
		}
	}
	
	public String toString() {
		return "Today's date is : " + month + "/" + day + "/" + year;
	}
	
	public void setDate( int month, int day, int year) {
		if ( valid(day, month, year)) {
			this.month = (byte) month;
			this.day = (byte) day;
			this.year = (short) year;
		}
	}
	
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if ( valid(day, month, year)) {
			this.month = (byte) month;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if ( valid(day, month, year)) {
			this.day = (byte) day;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if ( valid(day, month, year)) {
			this.year = (short) year;
		}
	}
	
	private boolean valid(int day, int month, int year){
		 if (day > 31 || day < 1 || month > 12 || month < 1 ){
		 System.out.println("Attempting to create a non-valid date "
		+ month + "/" + day + "/" + year);
		 return false;
		 }
		 switch (month){
		 case 4:
		 case 6:
		 case 9:
		 case 11: return (day <= 30);
		 case 2: return day <= 28 || ( day == 29 && year % 4 == 0) ;
		 }
		 return true;
		}


	public static void leapYears() {
		for (int i = 1752; i <=2020; i++ ) {
			if (i % 4 == 0 && i % 100 != 0 ) {
				System.out.println(i + " is a leap year!");
			}
		}
	}
	
	public boolean equals(Object o) {
		if (o instanceof MyDate) {
			MyDate date = (MyDate) o;
			if ( (date.day == day) && (date.month == month) && (date.year == year) ) {
				return true;
			}
		}
		return false;
	}

}
