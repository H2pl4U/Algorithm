package leetcode;

import java.util.HashSet;

/*
 * ª∑–Œ¡¥±Ì
 */
public class ListNode06 {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;
		HashSet<ListNode> set = new HashSet<>();
		while (head != null) {
			if (set.contains(head)) {
				return true;
			} else {
				set.add(head);
			}
			head = head.next;
		}
		return false;
	}

	public boolean hasCycle2(ListNode head) {
		if (head == null || head.next == null)
			return false;
		ListNode slow = head;
		ListNode fast = head.next;
		while (head != null) {
			if (fast == null || fast.next == null)
				return false;
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
}
