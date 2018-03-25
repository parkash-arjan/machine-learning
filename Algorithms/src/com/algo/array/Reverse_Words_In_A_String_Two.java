package com.algo.array;

public class Reverse_Words_In_A_String_Two {
	public static void main(String[] args) {
		Reverse_Words_In_A_String_Two reference = new Reverse_Words_In_A_String_Two();
		String s = "the sky is blue";
		char[] str = s.toCharArray();
		System.out.println(str);
		reference.reverseWords(str);
		System.out.println(str);
	}

	public void reverseWords(char[] str) {
		int len = str.length;
		// reverseWord(str, 0, len - 1);
		int j = 0;
		for (int i = 0; i < len; i++) {
			if (str[i] == ' ') {
				reverseWord(str, j, i - 1);
				j = i + 1;
			}
		}
		reverseWord(str, j, len - 1);
	}

	public void reverseWord(char[] str, int startIndex, int endIndex) {
		int len = endIndex - startIndex + 1;
		int j = endIndex;
		char tempCh = ' ';
		for (int i = startIndex; i < (startIndex + len / 2); i++, j--) {
			tempCh = str[j];
			str[j] = str[i];
			str[i] = tempCh;
		}
	}
}
