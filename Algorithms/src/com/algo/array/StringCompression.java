package com.algo.array;

public class StringCompression {

	public static void main(String[] args) {

		StringCompression stringCompression = new StringCompression();
		char[] string = new char[] { 'a', 'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'c', 'c', 'c','d' };
		stringCompression.compress(string);
		System.out.println(string);

	}

	public int compress(char[] chars) {
		int indexAns = 0, index = 0;
		while (index < chars.length) {
			char currentChar = chars[index];
			int count = 0;
			while (index < chars.length && chars[index] == currentChar) {
				index++;
				count++;
			}
			chars[indexAns++] = currentChar;
			if (count != 1)
				for (char c : Integer.toString(count).toCharArray())
					chars[indexAns++] = c;
		}
		return indexAns;
	}
}
