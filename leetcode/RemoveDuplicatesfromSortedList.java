package leetcode;
/**
 * 	Given a sorted linked list, delete all duplicates such that each element appear only once.
	For example,
	Given 1->1->2, return 1->2.
	Given 1->1->2->3->3, return 1->2->3.
 * @author yonney
 *
 */
public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null){
			return head;
		}
		ListNode current = head.next;
		ListNode pre = head;
		while(current != null){
			if(pre.val == current.val){
				pre.next = current.next;
				current = current.next;
			}else{
				pre = current;
				current = current.next;
			}
		}
		return head;
    }
	
	public static void main(String[] args) {
		
	}
}
