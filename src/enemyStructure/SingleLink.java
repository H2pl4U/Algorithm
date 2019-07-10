package enemyStructure;

public class SingleLink {
	public class Link{
		public int age;
		public String name;
		public Link next;
		public Link(int age, String name) {
			this.age = age;
			this.name = name;
		}
		public void displayLink() {
			System.out.println("age=" + age + ", name=" + name );
		}
	}
	public class LinkList {
		private Link first;
		public LinkList(){
			first=null;
		}
		//插入到链表的前端
		public void insertFirst(Link link){
			link.next = first;
			first = link;
		}
		//删除第一个链结点，返回删除的链结点引用
		public Link deleteFirst() throws Exception{
			if(isEmpty()){
				throw new Exception("链表为空！无法删除");
			}
			Link temp =first;
			first = first.next;
			return temp;
		}
		//打印出所有链表元素
		public void displayList(){
			Link cur = first;
			while(cur!=null) {
				cur.displayLink();
				cur=cur.next;
			}
		}
		//删除属性为指定的链结点
		public Link delete(int key) {
			Link link =null;
			Link cur = first;
			Link next = first.next;
			Link previous = null;
			while(cur!=null){
				if(cur.age == key) {
					link =cur;
					//如果当前链结点的前驱为null，证明当其为链表的第一个结点，删除该结点后需要对first重新赋值
					if(previous == null){
						this.first=next;
					}else {
						previous.next = next;
					}
					break;
				}else if(cur.next == null) {	//当前结点不是目标且下一个链接点为null，证明没有要删除的结点
					break;
				}
				//当前结点不说要删除的目标，则向后继续寻找
				next = next.next;
				cur = cur.next;
				previous = cur;
			}
			return link;
		}
		//为查找属性为指定值的链结点
		public Link find(int key){
			Link link = null;
			Link cur = first;
			Link next= null;
			Link previous = null;
			while(cur!=null) {
				if(cur.age == key) {
					link = cur;
					break;
				}else if(cur.next == null) {  //当前链结点不是要找的目标且下一个结点为null，则没有找到目标
					break;
				}
				//当前结点不说要找的目标且存在下一个结点，向后继续寻找
				next = next.next;
				cur = cur.next;
				previous = cur;
			}
			return link;
		}
		//判断是链表是否为空
		private boolean isEmpty() {
			return (first==null);
		}
	}

	public static void main(String[] args) {
		Link link = null;
		LinkList lk = null;
		link.age=20;
		link.name="lw";
		lk.insertFirst(link);
		System.out.println(lk.isEmpty());
		
		

	}

}
