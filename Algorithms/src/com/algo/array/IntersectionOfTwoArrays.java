package com.algo.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		//int[] array = intersect(new int[] { 1, 2 }, new int[] { 2, 2 });
		int[] array = intersect(new int[] { 1 }, new int[] { 1, 1 });
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// System.out.println(Arrays.asList(intersect(new int[] { 1, 2 }, new
		// int[] { 2, 2 })));
	}

	static public int[] intersect(int[] nums1, int[] nums2) {
		if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
			return new int[0];
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			if (map.containsKey(nums1[i])) {
				map.put(nums1[i], map.get(nums1[i]) + 1);
			} else {
				map.put(nums1[i], 1);
			}
		}
		List<Integer> resultSet = new ArrayList<>();
		for (int i = 0; i < nums2.length; i++) {
			if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
				map.put(nums2[i], map.get(nums2[i]) - 1);
				resultSet.add(nums2[i]);
			}
		}
		int[] array = new int[resultSet.size()];
		int i = 0;
		Iterator<Integer> itr = resultSet.iterator();
		while (itr.hasNext()) {
			array[i++] = itr.next();
		}
		return array;
	}
}
