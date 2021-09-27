package com.java21days;

public class Investment {
	public static void main(String[] args) {
		int inv = 14000;
		System.out.println("My investment was worth $" + inv + " at first.");
		inv = ((40 * inv) / 100) + inv;
		System.out.println("My investment was worth $" + inv + " after the first year.");
		inv = inv - 1500;
		System.out.println("My investment was worth $" + inv + " after the second year.");
		inv = ((12 * inv) / 100) + inv;
		System.out.println("My investment was worth $" + inv + " after the third year.");
		
		
	}
}
