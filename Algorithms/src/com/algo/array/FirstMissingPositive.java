package com.algo.array;

import java.util.Arrays;

public class FirstMissingPositive {
	public static void main(String[] args) {
		// System.out.println(firstMissingPositive(new int[] { 1, 2, 0 }));
		System.out.println(firstMissingPositive(new int[] { 1 }));
	}

	public static int firstMissingPositive(int[] nums) {
		if(nums.length==0) {
			return 1;
		}
		int actualSum = 0;
		int sumShouldBe = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				actualSum += nums[i];
			}
			sumShouldBe += (i + 1);
		}
		return (sumShouldBe - actualSum) == 0 ? nums[nums.length-1] :(sumShouldBe - actualSum);
	}
}
