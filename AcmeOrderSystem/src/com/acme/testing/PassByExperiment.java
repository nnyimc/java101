package com.acme.testing;

import com.acme.utils.MyDate;

public class PassByExperiment {
	public static void passObject(MyDate d) {
		d.setYear(2009);
	}
	
	public static void passPrimitive(int i) {
		i = 2010;
	}
	
	public static void passString(String s) {
		int yearSlash = s.lastIndexOf('/');
		s = s.substring(0, yearSlash+1);
		s += 2012;
		System.out.println("New date string: " + s);
	}
	
	public static void passStringBuilder(StringBuilder stringBuilder) {
		stringBuilder.append("15/15/2015");
	}
}
