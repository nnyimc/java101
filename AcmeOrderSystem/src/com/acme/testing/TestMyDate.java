package com.acme.testing;
import com.acme.utils.MyDate;

public class TestMyDate {
	public static void main(String[] args){
		
		MyDate date1 = new MyDate(11,11,1918);
		
		MyDate date2 = new MyDate();
		date2.setDay(11);
		date2.setMonth(11);
		date2.setYear(1918);
		
		MyDate date3 = new MyDate();
		date3.setDate(4,99,1968);
		
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
		
		MyDate date = new MyDate(1, 20, 2008);
	    System.out.println("Before passing an object " + date);
	    PassByExperiment.passObject(date);
	    System.out.println("After passing an object " + date);
	    
	    System.out.println("Before passing a primitive " + date.getYear());
	    PassByExperiment.passPrimitive(date.getYear());
	    System.out.println("After passing a primitive " + date.getYear());
	    
	    String referenceToDate = date.toString();
	    System.out.println("Before passing a String " + referenceToDate);
	    PassByExperiment.passString(referenceToDate);
	    System.out.println("After passing a String " + referenceToDate);
	    
	    StringBuilder stringBuilder = new StringBuilder();
	    System.out.println("Before the call, StringBuilder= " + stringBuilder);
	    PassByExperiment.passStringBuilder(stringBuilder);
	    System.out.println("After the call StringBuilder= " + stringBuilder);
	}
}
