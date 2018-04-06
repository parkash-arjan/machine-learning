package com.algo.array.search_sort;

public class BinarySearch {
	public static void main(String[] args) {
		// int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		// int[] array = new int[] { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
		// int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		int[] array = new int[] { 1, 2, 5, 9, 10 };
		System.out.println(binarySearch(array, 8));
	}

	static public int binarySearch(int[] array, int value) {
		return binarySearchHelper(array, value, 0, array.length - 1, 0);
	}

	static private int binarySearchHelper(int[] array, int value, int start, int end, int placeHolder) {
		if (end < start) {
			// return -1;
			return placeHolder;
		}
		int mid = (start + end) / 2;
		if (array[mid] == value) {
			return mid;
		} else if (array[mid] > value) {
			return binarySearchHelper(array, value, start, mid - 1, mid);
		} else {
			return binarySearchHelper(array, value, mid + 1, end, mid + 1);
		}
	}
}