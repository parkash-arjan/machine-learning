package com.algo.linked.list;

import java.util.Arrays;

public class DeleteDuplicateValueNodesFromASortedLinkedLlist {
	public static void main(String[] args) {
		ListNode ll = Util.getlinkedList_V2(Arrays.asList(1, 1, 3, 3, 5, 6));
		// ListNode ll = Util.getlinkedList_V2(Arrays.asList(1, 1, 3));
		// ListNode ll = Util.getlinkedList_V2(Arrays.asList(1));
		// ListNode ll = Util.getlinkedList_V2(Arrays.asList(1,1));
		// ListNode ll = Util.getlinkedList_V2(Arrays.asList(1,1));
		Util.print(ll);
		ListNode dll = RemoveDuplicates(ll);
		Util.print(dll);
	}

	public static ListNode RemoveDuplicates(ListNode head) {
		ListNode node = head;
		ListNode current = head;
		ListNode next = head.next;
		while (next != null) {
			if (current.val == next.val) {
				next = next.next;
			} else {
				current.next = next;
				next = next.next;
				current = current.next;
			}
		}
		current.next = null;
		return node;
	}
}