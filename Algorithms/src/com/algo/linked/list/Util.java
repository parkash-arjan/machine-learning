package com.algo.linked.list;

import java.util.List;

public class Util {
	public static ListNode getlinkedList_V2(List<Integer> list) {
		ListNode head = new ListNode(-1);
		ListNode headPointer = head;
		for (Integer integer : list) {
			head.next = new ListNode(integer);
			head = head.next;
		}
		return headPointer.next;
	}

	public static ListNode getlinkedList(List<Integer> list) {
		ListNode resultList = null;
		ListNode resultHead = null;
		for (Integer integer : list) {
			ListNode newNode = new ListNode(integer);
			if (resultList == null) {
				resultList = newNode;
				resultHead = newNode;
			} else {
				resultList.next = newNode;
				resultList = resultList.next;
			}
		}
		return resultHead;
	}

	public static ListNode getLinkedList() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		return node1;
	}

	public static void print(ListNode head) {
		while (head != null) {
			System.out.print(head.val + "  ");
			head = head.next;
		}
		System.out.println();
	}
}
