package leetcode;
/**
 * Given a linked list, determine if it has a cycle in it.
 * Can you solve it without using extra space?
 * 利用快慢指针，开始两个指针均指向链表head，然后循环移动，慢指针移动1步，快指针则移动2步，如果链表有环则两个指针一定会相遇
 * @author yonney
 *
 */
public class LinkedListCycle {
	 public boolean hasCycle(ListNode head) {
		 if(head == null || head.next == null){
			 return false;
		 }
		 ListNode fast = head;
		 ListNode lower = head;
		 while(fast != null && fast.next != null ){
			 lower = lower.next;
			 fast = fast.next.next;
			 if(lower == fast ){
				 return true;
			 }
		 }
		 return false;
	}
}
