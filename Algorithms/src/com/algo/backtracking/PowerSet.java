package com.algo.backtracking;

import java.util.ArrayList;

public class PowerSet {
	public static void powerSet(ArrayList<Character> charList) {
		ArrayList<ArrayList<Character>> psList = new ArrayList<>();
		helperPowerSet(charList, psList);
		System.out.println(psList);
	}

	public static void helperPowerSet(ArrayList<Character> charList, ArrayList<ArrayList<Character>> psList) {
		System.out.println(String.format("Character List = %s , Chosen List = %s", charList, psList));
		if (charList.isEmpty()) {
			// psList.add(new ArrayList<>());
		} else {
			int tempSize = charList.size();
			for (int i = 0; i < tempSize; i++) {
				
				/*Character chosen = charList.remove(0);
				ArrayList<Character> chosenList = new ArrayList<>();
				chosenList.add(chosen);
				psList.add(chosenList);
				helperPowerSet(charList, psList);
				charList.add(0, chosen);*/
				
				
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Character> charList = new ArrayList<>();
		charList.add('A');
		charList.add('B');
		charList.add('C');
		// ArrayList<Character> charList1 = new ArrayList<>();
		// charList.add('1');
		// charList.add('2');
		// charList.add('3');
		// ArrayList<ArrayList<Character>> psList = new ArrayList<>();
		// psList.add(charList1);
		// psList.add(charList);
		// System.out.println(psList);
		powerSet(charList);
	}
}
