package leetcode;


/*
 * ɾ�����������е��ظ�Ԫ��
 */
public class ListNode08 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		head.next = deleteDuplicates(head.next);
		return head.val == head.next.val ? head.next : head;
	}
}
