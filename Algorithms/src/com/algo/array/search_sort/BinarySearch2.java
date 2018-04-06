package com.algo.array.search_sort;

public class BinarySearch2 {
	public static void main(String[] args) {
		// int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		// int[] array = new int[] { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
		// int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		// int[] array = new int[] { 1, 2, 5, 9, 10 };
		int[] array = new int[] { 1, 2, 2, 8, 8, 8, 8, 8, 10 };
		System.out.println(binarySearch(array, 8));
	}

	static public int binarySearch(int[] array, int value) {
		return binarySearchHelper(array, value, 0, array.length - 1, -1);
	}

	static private int binarySearchHelper(int[] array, int value, int start, int end, int indexFound) {
		if (end < start) {
			return indexFound;
		}
		int mid = (start + end) / 2;
		if (array[mid] == value) {
			indexFound = mid;
			return binarySearchHelper(array, value, start, mid - 1, indexFound);
		} else if (array[mid] > value) {
			return binarySearchHelper(array, value, start, mid - 1, indexFound);
		} else {
			return binarySearchHelper(array, value, mid + 1, end, indexFound);
		}
	}
}