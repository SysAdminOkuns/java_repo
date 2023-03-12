package com.acme.testing;

import com.acme.utils.MyDate;

public class PassByExperiment {
	
	public static void main(String[] args) {
		MyDate date = new MyDate(1,20, 2008);
//		Passing by value for object
//		System.out.println("Before passing an object " + date);
//		passObject(date);
//		System.out.println("After passing an object " + date);
		
//		Passing by value for primitives
//		System.out.println("Before passing a primitive " + date);
//		passPrimitive(date.year);
//		System.out.println("After passing a primitive " + date);
		
//		Passing by value for String literals and String Object.
		String x = date.toString();
		System.out.println("Before passing a String " + x);
		passString(x);
		System.out.println("After passing a String " + x);
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		
//		Using the StringBuilder class(mutable String)
		StringBuilder sb = new StringBuilder(date.toString());
		System.out.println("Before passing a StringBuilder " + sb);
		passStringBuilder(sb);
		System.out.println("After passing a StringBuilder " + sb);
	}
	
	public static void passObject(MyDate d) {
		d.setYear(2009);
	}
	
	public static void passPrimitive(int i) {
		i = 2010;
	}
	
	public static void passString(String s) {
		int yearSlash = s.lastIndexOf('/');
		s = s.substring(0, yearSlash + 1);
		s += "2012";
		System.out.println("New date string: " + s);
	}
	
	public static void passStringBuilder(StringBuilder sb) {
		int yearSlash = sb.lastIndexOf("/");
		String myStr = sb.toString().substring(0, yearSlash + 1);
		sb.setLength(0);
		sb.append(myStr);
		sb.append("2013");
		System.out.println("New date string: " + sb.toString());
	}

}
