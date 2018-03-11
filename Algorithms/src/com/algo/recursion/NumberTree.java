package com.algo.recursion;

public class NumberTree {

	private final static int N = 3;

	public static void main(String[] args) {

		recursion(0, 0);
	}

	public static int recursion(int num, int sum) {

		System.out.println("recursion(" + num + ")");
		if (num == N) {
			return N;
		} else {

			for (int index = num; index < N; index++) {
				sum = sum + recursion(index + 1, sum);
			}
			System.out.println(sum);
			return num;
		}

	}

}
