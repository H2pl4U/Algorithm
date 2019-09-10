package leetcode;


/*
 * 回文链表
 */
public class ListNode05 {
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
			return true;
		//找到链表中点
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		//反转前段链表
		ListNode next = null;
		ListNode pre = null;
		while(head!=slow) {
			next = head.next;
			head.next=pre;
			pre = head;
			head=next;
		}
		//如果是奇数结点，去除后半段第一个结点
		if(fast!=null) {
			slow=slow.next;
		}
		//遍历比较
		while(pre!=null&&slow!=null) {
			if(pre.val!=slow.val)
				return false;
			pre=pre.next;
			slow=slow.next;
		}
		return true;
	}
}
