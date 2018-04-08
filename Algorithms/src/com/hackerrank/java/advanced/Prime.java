package com.hackerrank.java.advanced;

public class Prime {
	public void checkPrime(int... nums) {
		for (int i = 0; i < nums.length; i++) {
			if (isPrime(nums[i])) {
				System.out.print(nums[i] + " ");
			}
		}
		System.out.println();
	}

	private boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
