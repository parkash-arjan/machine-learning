package com.algo.linked.list;

public class IntersectionOfTwoLinkedList {
	int FindMergeListNode(ListNode headA, ListNode headB) {
		ListNode tempHeadA = headA;
		ListNode tempHeadB = headB;
		int aLen = 0;
		while (headA != null) {
			headA = headA.next;
			aLen++;
		}
		int bLen = 0;
		while (headB != null) {
			headB = headB.next;
			bLen++;
		}
		if (aLen > bLen) {
			while (aLen != bLen) {
				tempHeadA = tempHeadA.next;
				aLen--;
			}
		} else {
			while (aLen != bLen) {
				tempHeadB = tempHeadB.next;
				bLen--;
			}
		}
		while (tempHeadA != null && tempHeadB != null) {
			if (tempHeadA.val == tempHeadB.val) {
				return tempHeadA.val;
			}
			tempHeadA = tempHeadA.next;
			tempHeadB = tempHeadB.next;
		}
		return -1;
	}
}
