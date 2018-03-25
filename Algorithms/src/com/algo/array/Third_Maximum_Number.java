package com.algo.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Third_Maximum_Number {
	public static void main(String[] args) {
		Third_Maximum_Number thirdMaximumNumber = new Third_Maximum_Number();
		// int[] nums = new int[] { 4, 3, 9, 8, 7, 6 };
		int[] nums = new int[] { 5, 2, 4, 1, 3, 6, 0 };
		// int[] nums = new int[] { 3, 2, 1 };
		// int[] nums = new int[] { 1, 1, 2 };
		// System.out.println(thirdMaximumNumber.thirdMax(nums));
		System.out.println(thirdMaximumNumber.thirdMax_WRONG(nums));
	}

	public int thirdMax(int[] nums) {
		TreeSet<Integer> hashSet = new TreeSet<>();
		for (int i = 0; i < nums.length && hashSet.size() != 3; i++) {
			int maxIndex = findMax(nums, i);
			int temp = nums[i];
			nums[i] = nums[maxIndex];
			nums[maxIndex] = temp;
			hashSet.add(nums[i]);
		}
		return hashSet.size() >= 3 ? hashSet.first() : hashSet.last();
	}

	private int findMax(int[] nums, int startIndex) {
		int max = nums[startIndex];
		int maxIndex = startIndex;
		for (int i = startIndex + 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public int thirdMax_WRONG(int[] nums) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		if (nums.length < 3)
			return Math.max(nums[0], nums[1]);
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (num == max1 || num == max2 || num == max3)
				continue;
			if (num >= max1) {
				max3 = max2;
				max2 = max1;
				max1 = num;
			} else if (num >= max2) {
				max3 = max2;
				max2 = num;
			} else if (num >= max3) {
				max3 = num;
			}
		}
		return max3 ;//== Integer.MIN_VALUE ? max1 : max3;
	}

	public int thirdMax_WRONG_SOLUTION(int[] nums) {
		if (nums.length < 3) {
			int max = nums[0];
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] > max) {
					max = nums[j];
				}
			}
			return max;
		} else {
			// 4, 3, 9, 8, 7, 6
			for (int i = 0; i < 3; i++) {
				int max = nums[i];
				int maxIndex = -1;
				for (int j = i; j < nums.length; j++) {
					if (nums[j] > max) {
						max = nums[j];
						maxIndex = j;
					}
				}
				if (maxIndex != -1) {
					int tempMax = nums[i];
					nums[i] = nums[maxIndex];
					nums[maxIndex] = tempMax;
				}
			}
			for (int j = 0; j < nums.length; j++) {
				System.out.print(nums[j] + "  ");
			}
			System.out.println();
			return nums[2];
		}
	}
}
