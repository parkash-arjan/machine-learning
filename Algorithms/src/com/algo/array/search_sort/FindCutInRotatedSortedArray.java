package com.algo.array.search_sort;

public class FindCutInRotatedSortedArray {
	public static void main(String[] args) {
		// int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// int[] array = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 1 };
		// int[] array = new int[] { 3, 4, 5, 6, 7, 8, 9, 10, 1, 2 };
		// int[] array = new int[] { 4, 5, 6, 7, 8, 9, 10, 1, 2 ,3 };
		// int[] array = new int[] { 5, 6, 7, 8, 9, 10, 1, 2 ,3 ,4};
		// int[] array = new int[] { 6, 7, 8, 9, 10, 1, 2, 3, 4, 5 };
		// int[] array = new int[] { 7, 8, 9, 10, 1, 2, 3, 4, 5 ,6};
		// int[] array = new int[] { 8, 9, 10, 1, 2, 3, 4, 5 ,6,7};
		// int[] array = new int[] { 9, 10, 1, 2, 3, 4, 5 ,6,7,8};
		// int[] array = new int[] { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// int[] array = new int[] { 5 , 7 , 9 , 13 , 21 , 29 , 34 , 51 , 83 ,
		// 100 , 256 };
//		int[] array = new int[] { 83, 100, 256, 5, 7, 9, 13, 21, 29, 34, 51 };
//		System.out.println(findCut(array, 0, array.length - 1));
		
		int[] array = new int[] { 1 };
		System.out.println(findCut(array, 0, array.length - 1));		
		
	}

	static int findCut(int[] array, int start, int end) {
		if (array[start] < array[end]) {
			return 0;
		}
		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] > array[mid + 1]) {
				return mid + 1; // This is cut index
			} else if (array[start] < array[mid]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return -1;
	}
}
