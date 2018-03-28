package com.algo.array;

public class RemoveDuplicateFromTheSortedArray {

	public static void main(String[] args) {
		RemoveDuplicateFromTheSortedArray obj = new RemoveDuplicateFromTheSortedArray();
		int[] nums = new int[] {5,7,9,9};
		int newLen = obj.removeDuplicates(nums);
		for (int i = 0; i < newLen; i++) {
			System.out.print(nums[i] + "  ");
		}
	}

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}

		int i = 0;
		for (int j = 1; j < nums.length; j++) {

			if (nums[i] != nums[j]) {
				i = i + 1;
				nums[i] = nums[j];
			}

		}

		return i + 1;
	}

}
