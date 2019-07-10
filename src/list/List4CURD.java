package list;
class ListNode{
	private int data;
	private ListNode next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
}

public class List4CURD {

	public static void main(String[] args) {
		ListNode listNode = new ListNode();
		ListNode listNode1 = new ListNode();
		ListNode listNode2 = new ListNode();
		listNode.setData(1);
		listNode1.setData(2);
		listNode2.setData(3);
		listNode.setNext(listNode1);
		listNode1.setNext(listNode2);
		System.out.println(ListLength(listNode));
		ListNode listNode3 = new ListNode();
		listNode3.setData(4);
		InsertLinkedList(listNode, listNode3, 2);
		System.out.println(ListLength(listNode));
		DeleteLinkedList(listNode);
		System.out.println(listNode.getData());
	}
	
	/**
	 * 遍历链表 返回链表长度
	 * @param headNode
	 * @return
	 */
	static int ListLength(ListNode headNode) {
		int length = 0;
		ListNode currenListNode =headNode;
		while(currenListNode!=null) {
			length++;
			currenListNode=currenListNode.getNext();
		}
		return length;
	}
	
	/**
	 * 插入链表 
	 * @param headNode
	 * @param nodeToInsert
	 * @param position
	 * @return
	 */
	static ListNode InsertLinkedList(ListNode headNode,ListNode nodeToInsert,int position) {
		if(headNode==null) {
			return nodeToInsert;
		}
		int size = ListLength(headNode);
		if(position>size+1||position<1) {
			System.out.println("要插入的位置有错误!可插入的位置为1到"+(size+1));
			return headNode;
		}
		if(position==1) {
			//在表头开始插入
			nodeToInsert.setNext(headNode);
			return nodeToInsert;
		}else {
			//在链表中间或末尾插入
			ListNode previouNode = headNode;
			int count =1;
			while(count<position-1) {
				previouNode = previouNode.getNext();
				count++;
			}
			ListNode currentNode = previouNode.getNext();
			nodeToInsert.setNext(currentNode);
			previouNode.setNext(nodeToInsert);
		}
		return headNode;
	}
	
	/**
	 * 删除单向链表的第n个位置的元素
	 * @param headNode
	 * @param position
	 * @return
	 */
	static ListNode DeleteFromLinkedList(ListNode headNode,int position) {
		int size = ListLength(headNode);
		if(position>size||position<1) {
			System.out.println("要删除的位置有错误!可删除的位置为1到"+(size+1));
			return headNode;
		}
		if(position==1) {
			//如果要删除表头结点
			ListNode currentNode = headNode.getNext();
			headNode=null;
			return currentNode;
		}else {
			//删除中间或者表尾结点
			ListNode previousNode = headNode;
			int count =1;
			while(count<size-1) {
				previousNode= previousNode.getNext();
				count++;
			}
			ListNode currentNode = previousNode.getNext();
			previousNode.setNext(currentNode.getNext());
			currentNode=null;
		}
		return headNode;
	}
	
	static void DeleteLinkedList(ListNode headNode) {
		ListNode auxilaryNode,iterator = headNode;
		while(iterator!=null) {
			auxilaryNode=iterator.getNext();
			iterator=null;
			iterator=auxilaryNode;
		}
	}

}
