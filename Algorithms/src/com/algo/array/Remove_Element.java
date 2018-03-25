package com.algo.array;

public class Remove_Element {
	public static void main(String[] args) {
		Remove_Element removeElement = new Remove_Element();
		int[] nums = new int[] { 3, 2, 2, 3 };
		int newLen = removeElement.removeElement(nums, 3);
		for (int i = 0; i < newLen; i++) {
			System.out.print(nums[i] + "  ");
		}
	}

	public int removeElement(int[] nums, int val) {
		// 3-2-2-3
		int i = 0;
		int j = 0;
		while (j < nums.length) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
			j++;
		}
		return i;
	}
}
