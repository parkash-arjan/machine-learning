package com.algo.linked.list;

import java.util.Arrays;

public class CompareTwoLinkedLists {
	public static void main(String[] args) {
		ListNode l1 = Util.getlinkedList_V2(Arrays.asList( 1,2,3,4));
		ListNode l2 = Util.getlinkedList_V2(Arrays.asList( 4));
		System.out.println(CompareLists(l1, l2));
	}

	public static int CompareLists(ListNode headA, ListNode headB) {
		if (headA == null && headB == null)
			return 1;
		while (headA != null && headB != null) {
			if (headA.val == headB.val) {
				headA = headA.next;
				headB = headB.next;
				continue;
			} else {
				return 0;
			}
		}
		if (headA != null || headB != null) {
			return 0;
		}
		return 1;
	}
}
