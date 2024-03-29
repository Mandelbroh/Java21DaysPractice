package com.java21days;

class HalfLooper {
	public static void main(String[] args) {
		int[] denver = {2_100_000, 2_900_00, 6_100_000};
		int[] philadelphia = {2_100_000, 1_400_000, 2_800_000};
		int[] total = new int[denver.length];
		int sum = 0;
		
		for (int i = 0; i < denver.length; i++) {
			total[i] = denver[i] + philadelphia[i];
			System.out.format((i + 2015) + " production: %,d%n",
					total[i]);
			sum += total[i];
		}
		
		System.out.format("Average production: %,d%n",
				(sum / denver.length));
	}

}
