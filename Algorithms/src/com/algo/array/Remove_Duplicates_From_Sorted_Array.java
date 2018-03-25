package com.algo.array;

public class Remove_Duplicates_From_Sorted_Array {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 2, 3, 3, 4, 5 };
		int newLen = removeDuplicates(nums);
		for (int i = 0; i < newLen; i++) {
			System.out.print(nums[i]);
		}
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i = i + 1;
				nums[i] = nums[j];
			}
		}
		return i + 1; // This is size of the array
	}
}
