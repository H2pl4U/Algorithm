package leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

/*
 * ɾ�������еĽڵ�
 * ���дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ���ڵ㣬
 * �㽫ֻ������Ҫ��ɾ���Ľڵ㡣����һ������ -- head = [4,5,1,9]��
 * �����Ա�ʾΪ:4->5->1->9
 * 
 * ����: head = [4,5,1,9], node = 5
 * ���: [4,1,9]
 * ����: ������������ֵΪ 5 �ĵڶ����ڵ㣬��ô�ڵ�������ĺ���֮�󣬸�����Ӧ��Ϊ 4 -> 1 -> 9.
 */
public class ListNode01 {
	
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
        node.next=node.next.next;
    }
	
}
