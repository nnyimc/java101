package com.acme.testing;
import com.acme.utils.MyDate;

public class TestMyDate {
	public static void main(String[] args){
		
		MyDate date1 = new MyDate(11,11,1918);
		
		MyDate date2 = new MyDate();
		date2.day = 11;
		date2.month = 11;
		date2.year = 1918;
		
		MyDate date3 = new MyDate();
		date3.setDate(4,21,1968);
		
		MyDate date4 = new MyDate();
		
		String str1 = date1.toString();
		System.out.println(str1);
		
		String str2 = date2.toString();
		System.out.println(str2);
		
		String str3 = date3.toString();
		System.out.println(str3);
		
		String str4 = date4.toString();
		System.out.println(str4);
		
		// MyDate.leapYears();
	}
}
