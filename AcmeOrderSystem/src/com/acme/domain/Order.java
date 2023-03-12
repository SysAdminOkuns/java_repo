package com.acme.domain;

import com.acme.utils.MyDate;

public class Order {
	private MyDate orderDate;
	private double orderAmount = 0.00;
	double discount;
	private String customer;
	private String product;
	private int quantity;
	public static double taxRate;

	static {
		taxRate = 0.05;
	}

	public Order(MyDate d, double amt, String c) {
		this.orderDate = d;
		this.orderAmount = amt;
		this.customer = c;
		this.product = "Anvil";
		this.quantity = 1;
	}

	public Order(MyDate d, double amt, String c, String p, int q) {
		this.orderDate = d;
		this.orderAmount = amt;
		this.customer = c;
		this.product = p;
		this.quantity = q;
	}

	public String toString() {
		return quantity + " ea. " + product + " for " + customer;
	}

	public static void computeTaxOn(double anAmount) {
//		System.gc();
		System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);
	}

	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
	}

	public char jobSize() {
		int orderQuantity = 25;

		if (orderQuantity <= 25) {
			return 'S';
		} else if (orderQuantity <= 75) {
			return 'M';
		} else if (orderQuantity <= 150) {
			return 'L';
		}
		return 'X';
	}

	public double computeTotal() {
		double total = this.orderAmount;

		switch (this.jobSize()) {
		case 'M':
			total = total - (this.orderAmount * 0.01);
			break;
		case 'L':
			total = total - (this.orderAmount * 0.02);
			break;
		case 'X':
			total = total - (this.orderAmount * 0.03);
			break;
		}
		if (this.orderAmount <= 1500) {
			total = total + this.computeTax();
		}
		return total;
	}

	public static double getTaxRate() {
		return taxRate;
	}

	public static void setTaxRate(double newRate) {
		taxRate = newRate;
	}

	public MyDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(MyDate orderDate) {
		this.orderDate = orderDate;
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
		if (quantity > 0) {
			this.quantity = quantity;
		} else {
			System.out.println("Attempting to set the quantity to a value  less than or equal to zero");
		}
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		if (orderAmount > 0) {
			this.orderAmount = orderAmount;
		} else {
			System.out.println("Attempting to set the orderAmount to a  value less than or equal to zero");
		}
	}

}
