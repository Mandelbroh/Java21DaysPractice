package com.java21days;

class ArrayCopier {
	public static void main(String[] args) {
		// Establish 2 arrays, with array1 being an integer array and array2 being a float array.
		// array2 is set to have the same number of entries as array1 by using array1.length.
		int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
		float[] array2 = new float[array1.length];
		
		// Create a for loop in order to print out every possible value in array1 in order.
		// Starting from 0, the loop will print the current value of i on each loop, and will stop once it has 
		// reached the total number of entries in array1, as designated again by array1.length.
		// Note that spaces between brackets and array values must be printed manually (line 16)
		System.out.print("Array 1: [ ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.print("]");
		
		// Create a while loop in order to convert every value in array1 up to and excluding 1 into a float and then print it.
		// Starting from 0 (the established value of the variable count) the loop will convert integers from array1 into
		// floats for array2, and will only stop when either the length of the array matches the total length of array1, 
		// or the system encounters a one in array1.
		System.out.print("\nArray 2: [ ");
		int count = 0;
		while ( count < array1.length && array1[count] != 1) {
			array2[count] = (float) array1[count];
			System.out.print(array2[count++] + " ");
		}
		System.out.println("]");
	}

}
