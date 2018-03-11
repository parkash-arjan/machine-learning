package com.algo.backtracking;

import java.util.ArrayList;
import java.util.List;

public class RollDice {
	public void rollDice(int numDice) {
		List<Integer> list = new ArrayList<>();
		rollDiceHelper(numDice, list);
	}

	private void rollDiceHelper(int numDice, List<Integer> list) {
		// System.out.println( "rollDiceHelper " + numDice + " , "+ list);
		if (numDice == 0) {
			// base case
			System.out.println(list);
		} else {
			// some dice left to roll;
			// handle one die
			// for each value that die could have:
			// ------choose (dice values)
			// ------explore
			// ------un-choose
			for (int i = 1; i <= 6; i++) {
				list.add(i);
				rollDiceHelper(numDice - 1, list);
				list.remove(list.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		RollDice rollDice = new RollDice();
		rollDice.rollDice(2);
	}
}
/*
 * function diceRools(dice) : if dice == 0 : nothing to do . else: for
 * 
 * 
 */