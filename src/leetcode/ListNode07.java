package leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * œ‡Ωª¡¥±Ì
 */
public class ListNode07 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode l1 = headA,l2=headB;
		while(l1!=l2) {
			l1=(l1==null)?headA:l1.next;
			l2=(l2==null)?headB:l2.next;
		}
		return l1;
	}
	
	public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
		Set<ListNode> set = new HashSet<>();
		while(headA!=null) {
			set.add(headA);
			headA=headA.next;
		}
		while(headB!=null) {
			if(set.contains(headB))
				return headB;
			headB=headB.next;
		}
		return null;
	}
}
