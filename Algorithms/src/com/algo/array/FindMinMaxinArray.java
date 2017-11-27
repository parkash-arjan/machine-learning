package com.algo.array;

import java.util.Arrays;
import java.util.List;

public class FindMinMaxinArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList( 500, 300, 205);

		Integer min = Integer.MAX_VALUE;
		Integer max = Integer.MIN_VALUE;

		for (Integer integer : list) {
			min = Math.min(min, integer);
			max = Math.max(max, integer);
		}

		System.out.println(min + " --- " + max);

	}
}
