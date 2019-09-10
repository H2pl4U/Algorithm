package leetcode;

/*
 * ·´×ªÁ´±í
 */
public class ListNode03 {
	public ListNode reverseList(ListNode head) {
		if(head==null||head.next==null) return head;
		ListNode next = null;
		ListNode  pre = null;
		while(head!=null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}

}
