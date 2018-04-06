package com.algo.array.search_sort;

public class BinarySearchNonRecursive {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// int[] array = new int[] { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
		// int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		// int[] array = new int[] { 1, 2, 5, 9, 10 };
		System.out.println(binarySearch(array, 100));

	}

	static public int binarySearch(int[] array, int value) {

		int start = 0;
		int end = array.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (value == array[mid]) {
				return mid;
			} else if (value < array[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}
}
