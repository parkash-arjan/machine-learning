package com.algo.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet2 {
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
		System.out.println(String.format("chosen list %s :: built list %s", tempList, list));
		list.add(new ArrayList<>(tempList));
		for (int i = start; i < nums.length; i++) {
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 6, 7, 8 };
		subsets(nums);
		// System.out.println(subsets(nums));
	}
}
