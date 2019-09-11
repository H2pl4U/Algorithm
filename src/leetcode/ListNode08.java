package leetcode;


/*
 * 删除排序链表中的重复元素
 */
public class ListNode08 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		head.next = deleteDuplicates(head.next);
		return head.val == head.next.val ? head.next : head;
	}
}
