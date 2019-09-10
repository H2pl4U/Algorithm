package leetcode;

/*
 * ɾ������ĵ�����N���ڵ�
 * ����һ������ɾ������ĵ����� n ���ڵ㣬���ҷ��������ͷ��㡣
 * ʾ����
 * ����һ������: 1->2->3->4->5, �� n = 2.
 * ��ɾ���˵����ڶ����ڵ�������Ϊ 1->2->3->5
 * ˵����
 * ������ n ��֤����Ч�ġ�
 * ���ף�
 * ���ܳ���ʹ��һ��ɨ��ʵ����
 */
public class ListNode02 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p = head;
		ListNode q = head;
		for (int i = 0; i < n; i++) {
			p = p.next;
		}
		if(p==null) {
			head = head.next;
			return head;
		}
		while(p.next!=null) {
			p = p.next;
			q = q.next;
		}
		q.next=q.next.next;
		return head;
    }

}
