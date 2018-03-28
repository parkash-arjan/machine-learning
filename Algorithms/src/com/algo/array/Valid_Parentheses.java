package com.algo.array;

import java.util.Stack;

public class Valid_Parentheses {
	public static void main(String[] args) {
		// System.out.println('{' - '}');2
		// System.out.println('(' - ')');1
		// System.out.println('[' - ']');2

		System.out.println(isValid("}{"));

	}

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			Character tempChar = s.charAt(i);

			if (tempChar == '[' || tempChar == '{' || tempChar == '(') {
				stack.push(tempChar);
			} else {
				if (stack.isEmpty() || (!(Math.abs(stack.pop() - tempChar) < 3))) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
