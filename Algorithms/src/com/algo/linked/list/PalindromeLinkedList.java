package com.algo.linked.list;

import java.util.Arrays;
import java.util.Stack;

public class PalindromeLinkedList {
	public static void main(String[] args) {
		ListNode ll = Util.getlinkedList(Arrays.asList(0, 0));
		Util.print(ll);
		System.out.println(isPalindrome(ll));
	}

	public static boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		Stack<Integer> stack = new Stack<>();
		ListNode temp = head;
		while (temp != null) {
			stack.push(temp.val);
			temp = temp.next;
		}
		while (head != null) {
			if (  head.val != stack.pop()) {
				return false;
			}
			//head = head.next;
		}
		return true;
	}
}
