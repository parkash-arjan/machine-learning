package com.algo.array;

import java.util.ArrayList;
import java.util.List;

public class Word_Ladder {

	public static void main(String[] args) {

		String beginWord = "a";
		String endWord = "c";
		List<String> wordList = new ArrayList<>();
		wordList.add("a");
		wordList.add("b");
		wordList.add("c");
		//wordList.add("lot");
		//wordList.add("log");
		// wordList.add("cog");

		Word_Ladder obj = new Word_Ladder();
		System.out.println(obj.ladderLength(beginWord, endWord, wordList));

	}

	public void printTree_v2(String beginWord, List<String> wordList) {
		for (int i = 0; i < beginWord.length(); i++) {
			StringBuilder stringBuilder = new StringBuilder(beginWord);
			for (char chr = 'a'; chr <= 'z'; chr++) {
				stringBuilder.setCharAt(i, chr);
				String tempString = stringBuilder.toString();
				System.out.println(tempString);
			}
			System.out.println();
		}
	}

	public void printTree_v1(String beginWord, List<String> wordList) {

		for (int i = 0; i < beginWord.length(); i++) {
			char[] newWord = beginWord.toCharArray();
			for (char chr = 'a'; chr <= 'z'; chr++) {
				newWord[i] = chr;
				String tempWord = new String(newWord);
				System.out.println(tempWord);
			}
			System.out.println();
		}

	}

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		int len = 0;

		for (int i = 0; i < beginWord.length(); i++) {
			StringBuilder stringBuilder = new StringBuilder(beginWord);
			for (char chr = 'a'; chr <= 'z'; chr++) {
				stringBuilder.setCharAt(i, chr);
				String tempString = stringBuilder.toString();
				if (tempString.equals(endWord)) {
					return ++len;
				} else if (wordList.contains(tempString)) {
					beginWord = tempString;
					wordList.remove(wordList.indexOf(beginWord));
					len++;
					i = -1;
					break;
				}

			}

		}

		return 0;
	}

}
