package leetcode;


/*
 * ��������
 */
public class ListNode05 {
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
			return true;
		//�ҵ������е�
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		//��תǰ������
		ListNode next = null;
		ListNode pre = null;
		while(head!=slow) {
			next = head.next;
			head.next=pre;
			pre = head;
			head=next;
		}
		//�����������㣬ȥ�����ε�һ�����
		if(fast!=null) {
			slow=slow.next;
		}
		//�����Ƚ�
		while(pre!=null&&slow!=null) {
			if(pre.val!=slow.val)
				return false;
			pre=pre.next;
			slow=slow.next;
		}
		return true;
	}
}
