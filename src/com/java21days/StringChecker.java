package com.java21days;

class StringChecker {
	public static void main(String[] args) {
		String str = "You know nothing, Jon Snow";
		System.out.println("The String is: " + str);
		System.out.println("The length of this String: " + str.length());
		System.out.println("The Character at position 7: " + str.charAt(7));
		System.out.println("The substring from 9 to 16: " + str.substring(9, 16));
		System.out.println("The index of the first 'w': " + str.indexOf('w'));
		System.out.println("The index of the beginning of the " + "substring \"Jon\": " + str.indexOf("Jon"));
		System.out.println("The String in uppercase: " + str.toUpperCase());
		
	}

}
