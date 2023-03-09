package com.acme.utils;
public class MyDate {
	public int day;
	public int year;
	public int month;
	
	public MyDate() {}
	
	public MyDate(int m, int d, int y) {
		day = d;
		month = m;
		year = y;	
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
	public void setDate(int m, int d, int y) {
		day = d;
		month = m;
		year = y;
	}
	
	

}
