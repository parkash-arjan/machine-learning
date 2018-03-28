package com.algo.array;

import java.util.HashSet;
import java.util.Set;

public class Intersection_Of_Two_Arrays {
	public static void main(String[] args) {
		Intersection_Of_Two_Arrays intersectionOfTwoArrays = new Intersection_Of_Two_Arrays();
		int[] nums1 = new int[] { 1, 2, 2, 1 };
		int[] nums2 = new int[] { 2, 2 };
		int[] intersection = intersectionOfTwoArrays.intersection(nums1, nums2);
		for (int i = 0; i < intersection.length; i++) {
			System.out.println(intersection[i]);
		}
	}

	public int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}

		Set<Integer> intersection = new HashSet<>();

		for (int i = 0; i < nums2.length; i++) {
			if (set.contains(nums2[i])) {
				intersection.add(nums2[i]);
			}
		}
		int[] resultArray = new int[intersection.size()];
		int k = 0;
		for (Integer i : intersection) {
			resultArray[k++] = i;
		}
		return resultArray;
	}
}
