package com.algo.array;

import java.util.HashMap;

/*
 Problem: Find first unique character in the give string of characters 
 */
public class FindFirstUniqueCharacter {

	public static void main(String[] args) {

		Character character = find("parkash");
		// Character character = find("abcdeabde");
		// Character character = find("a");
		// Character character = find("abba");
		// Character character = find("");

		// Character character = find2("parkash");
		// Character character = find2("abcdeabde");
		// Character character = find2("a");
		// Character character = find2("abba");
		// Character character = find2("Aa");
		// Character character = find2("");

		if (character != null) {
			System.out.println("First unique character is " + character);
		} else {
			System.out.println("No unique character found");
		}
	}

	public static Character find(String str) {

		Character character = null;
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			character = str.charAt(i);
			if (map.containsKey(character)) {
				map.put(character, map.get(character) + 1);

			} else {
				map.put(character, 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			character = str.charAt(i);
			if (map.get(character) == 1) {
				return character;
			}
		}

		return null; // Throw No Unique Character found exception.

	}

	public static Character find2(String str) {

		Character character = null;
		int[] lookupArray = new int[256];

		for (int i = 0; i < str.length(); i++) {
			character = str.charAt(i);
			int lookupIndex = ((int) character);
			lookupArray[lookupIndex] = lookupArray[lookupIndex] + 1;
		}

		for (int i = 0; i < str.length(); i++) {
			character = str.charAt(i);
			int lookupIndex = ((int) character);
			if (lookupArray[lookupIndex] == 1) {
				return character;
			}
		}

		return null; // Throw No Unique Character found exception.

	}

}
