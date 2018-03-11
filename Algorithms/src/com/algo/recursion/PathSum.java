package com.algo.recursion;

public class PathSum {

	private final static int N = 3;

	public static void main(String[] args) {
		pathSum(0);
	}

	public static int pathSum(int num) {
		if (num == N) {
			return num;
		} else {
			int sum = 0;
			for (int i = num; i < N; i++) {
				sum = num + pathSum(i + 1);
			}
			System.out.println(sum);
			return sum;
		}

	}
}
