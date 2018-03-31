package com.algo.linked.list;

import java.util.Arrays;

public class AddTwoNumbers {
	public static void main(String[] args) {
		// ListNode l1 = Util.getlinkedList(Arrays.asList(2, 4, 3));
		// ListNode l2 = Util.getlinkedList(Arrays.asList(5, 6, 4));
		// ListNode l1 = Util.getlinkedList(Arrays.asList(5));
		// ListNode l2 = Util.getlinkedList(Arrays.asList(5));
		// ListNode l1 = Util.getlinkedList(Arrays.asList(1,8));
		// ListNode l2 = Util.getlinkedList(Arrays.asList(0));
		/****/
		// ListNode l1 = Util.getlinkedList_V2(Arrays.asList(2, 4, 3));
		// ListNode l2 = Util.getlinkedList_V2(Arrays.asList(5, 6, 4));
		// ListNode l1 = Util.getlinkedList(Arrays.asList(9));
		// ListNode l2 = Util.getlinkedList(Arrays.asList(9));
		ListNode l1 = Util.getlinkedList(Arrays.asList(1, 8));
		ListNode l2 = Util.getlinkedList(Arrays.asList(0));
		// ListNode l1 = Util.getlinkedList(Arrays.asList(2, 4, 3));
		// ListNode l2 = Util.getlinkedList(Arrays.asList(5, 6, 4));
		Util.print(l1);
		Util.print(l2);
		ListNode sumList = addTwoNumbers(l1, l2);
		Util.print(sumList);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(-1);
		ListNode resultHead = head;
		int sum = 0;
		while (l1 != null || l2 != null) {
			// while (l1 != null && l2 != null) {
			if (l1 != null) {
				sum = sum + l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum = sum + l2.val;
				l2 = l2.next;
			}
			head.next = new ListNode(sum % 10);
			head = head.next;
			sum = sum / 10;
		}
		if (sum != 0)
			head.next = new ListNode(1);
		return resultHead.next;
	}
	// 243
	// 564
	// public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	// ListNode head = new ListNode(-1);
	// ListNode resultHead = head;
	// int sum = 0;
	// // while (l1 != null || l2 != null ) {
	// while (l1 != null || l2 != null || sum != 0) {
	// if (l1 != null) {
	// sum = sum + l1.val;
	// l1 = l1.next;
	// }
	// if (l2 != null) {
	// sum = sum + l2.val;
	// l2 = l2.next;
	// }
	// head.next = new ListNode(sum % 10);
	// head = head.next;
	// sum = sum / 10;
	// }
	// // if (sum != 0)
	// // head.next = new ListNode(1);
	// return resultHead.next;
	// }
}
