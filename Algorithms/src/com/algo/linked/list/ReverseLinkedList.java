package com.algo.linked.list;

public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode head = Util.getLinkedList();
		Util.print(head);
		head = reverseList(head);
		Util.print(head);
	}

	   public static ListNode reverseList(ListNode head) {
	        
	        if(head == null || head.next == null){
	            return head;
	        }
	        
	        //1->2->3->4->NULL
	        
	        ListNode previous = null;
	        ListNode current = head;
	        
	        while(current!=null){                                    
	            ListNode next = current.next;
	            current.next = previous;
	            previous =current;
	            current = next;
	        }
	        
	        return previous;
	    }	
	
	
	/*public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		// 1->2->3->4->NULL
		ListNode previous = null;
		ListNode current = head;
		while (current  != null) {			
			ListNode next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}*/
}
