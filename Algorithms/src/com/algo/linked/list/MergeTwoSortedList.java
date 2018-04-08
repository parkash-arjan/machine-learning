package com.algo.linked.list;

import java.util.Arrays;

public class MergeTwoSortedList {
	public static void main(String[] args) {
		ListNode headA = Util.getlinkedList_V2(Arrays.asList(1, 3, 5, 7));
		ListNode headB = Util.getlinkedList_V2(Arrays.asList(2, 4, 7));
		ListNode result = mergeLists(headA, headB);
		Util.print(result);
	}

	static ListNode mergeLists(ListNode headA, ListNode headB) {
		if (headA == null)
			return headB;
		if (headB == null)
			return headA;
		ListNode head = new ListNode(-2379);
		ListNode resultList = head;
		while (headA != null && headB != null) {
			if (headA.val < headB.val) {
				head.next = headA;
				headA = headA.next;
			} else {
				head.next = headB;
				headB = headB.next;
			}
			head = head.next;
		}
		if (headA != null) {
			head.next = headA;
		}
		if (headB != null) {
			head.next = headB;
		}
		return resultList.next;
	}
}
