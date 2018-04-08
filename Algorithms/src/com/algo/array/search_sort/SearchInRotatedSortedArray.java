package com.algo.array.search_sort;

public class SearchInRotatedSortedArray {
	public static void main(String[] args) {
//		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		System.out.println(searchInRotatedSortedArray(array, 100, 0, array.length-1));
		
//		 int[] array = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 1 };
//		 System.out.println(searchInRotatedSortedArray(array,1, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,2, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,3, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,4, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,5, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,6, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,7, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,8, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,9, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,10, 0, array.length-1));	
		 
		 
//		 int[] array = new int[] { 3, 4, 5, 6, 7, 8, 9, 10, 1, 2 };
//		 System.out.println(searchInRotatedSortedArray(array,1, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,2, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,3, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,4, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,5, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,6, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,7, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,8, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,9, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,10, 0, array.length-1));	
		 
		 
//		 int[] array = new int[] { 4, 5, 6, 7, 8, 9, 10, 1, 2 ,3 };
//		 System.out.println(searchInRotatedSortedArray(array,1, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,2, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,3, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,4, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,5, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,6, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,7, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,8, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,9, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,10, 0, array.length-1));			 
		
		
//		 int[] array = new int[] { 5, 6, 7, 8, 9, 10, 1, 2 ,3 ,4};
//		 System.out.println(searchInRotatedSortedArray(array,1, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,2, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,3, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,4, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,5, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,6, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,7, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,8, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,9, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,10, 0, array.length-1));		 
		
		
//		int[] array = new int[] { 6, 7, 8, 9, 10, 1, 2, 3, 4, 5 };
//		 System.out.println(searchInRotatedSortedArray(array,1, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,2, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,3, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,4, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,5, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,6, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,7, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,8, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,9, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,10, 0, array.length-1));
		 
		
//		int[] array = new int[] { 7, 8, 9, 10, 1, 2, 3, 4, 5 ,6};		 
//		 System.out.println(searchInRotatedSortedArray(array,1, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,2, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,3, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,4, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,5, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,6, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,7, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,8, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,9, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,10, 0, array.length-1));
		
		
//		 int[] array = new int[] { 8, 9, 10, 1, 2, 3, 4, 5 ,6,7};
//		 System.out.println(searchInRotatedSortedArray(array,1, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,2, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,3, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,4, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,5, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,6, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,7, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,8, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,9, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,10, 0, array.length-1));		
		
//		 int[] array = new int[] { 9, 10, 1, 2, 3, 4, 5 ,6,7,8};
//		 System.out.println(searchInRotatedSortedArray(array,1, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,2, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,3, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,4, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,5, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,6, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,7, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,8, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,9, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,10, 0, array.length-1));			
		
//		
//		 int[] array = new int[] { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		 System.out.println(searchInRotatedSortedArray(array,1, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,2, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,3, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,4, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,5, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,6, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,7, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,8, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,9, 0, array.length-1));
//		 System.out.println(searchInRotatedSortedArray(array,10, 0, array.length-1));
		
//		int[] array = new int[] { 1 , 2 , 3 ,4 , 5 , 6};
//		System.out.println(searchInRotatedSortedArray(array, 0, 0, array.length-1));
		
		int[] array = new int[] { 1 };
		System.out.println(searchInRotatedSortedArray(array, 20, 0, array.length-1));							
		
	}

	static int searchInRotatedSortedArray(int[] array, int value, int start, int end) {
		while (start <= end) {
			int mid = (start + end) / 2;
			if (value == array[mid]) {
				return mid;
			}  else if (array[mid ] < array[end]) { // right part is sorted
				if (array[mid+1] <= value && value <= array[end]) {
					start = mid+1;
				} else {
					end = mid;
				}
			}else { //if (array[start] < array[mid]) { // left part is sorted
				if (array[start] <= value && value <= array[mid]) {
					end = mid-1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1; // number not found
	}  
}
