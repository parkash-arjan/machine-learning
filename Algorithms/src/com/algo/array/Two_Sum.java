package com.algo.array;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
	public static void main(String[] args) {
		int[] result = twoSum(new int[] { 3, 2, 4 }, 6);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (map.containsKey(diff)) {
				arr[0] = map.get(diff);
				arr[1] = i;
			} else {
				map.put(nums[i], i);
			}
		}
		return arr;
	}
}
