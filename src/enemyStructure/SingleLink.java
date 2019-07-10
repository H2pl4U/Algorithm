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
		//���뵽�����ǰ��
		public void insertFirst(Link link){
			link.next = first;
			first = link;
		}
		//ɾ����һ������㣬����ɾ�������������
		public Link deleteFirst() throws Exception{
			if(isEmpty()){
				throw new Exception("����Ϊ�գ��޷�ɾ��");
			}
			Link temp =first;
			first = first.next;
			return temp;
		}
		//��ӡ����������Ԫ��
		public void displayList(){
			Link cur = first;
			while(cur!=null) {
				cur.displayLink();
				cur=cur.next;
			}
		}
		//ɾ������Ϊָ���������
		public Link delete(int key) {
			Link link =null;
			Link cur = first;
			Link next = first.next;
			Link previous = null;
			while(cur!=null){
				if(cur.age == key) {
					link =cur;
					//�����ǰ������ǰ��Ϊnull��֤������Ϊ����ĵ�һ����㣬ɾ���ý�����Ҫ��first���¸�ֵ
					if(previous == null){
						this.first=next;
					}else {
						previous.next = next;
					}
					break;
				}else if(cur.next == null) {	//��ǰ��㲻��Ŀ������һ�����ӵ�Ϊnull��֤��û��Ҫɾ���Ľ��
					break;
				}
				//��ǰ��㲻˵Ҫɾ����Ŀ�꣬��������Ѱ��
				next = next.next;
				cur = cur.next;
				previous = cur;
			}
			return link;
		}
		//Ϊ��������Ϊָ��ֵ�������
		public Link find(int key){
			Link link = null;
			Link cur = first;
			Link next= null;
			Link previous = null;
			while(cur!=null) {
				if(cur.age == key) {
					link = cur;
					break;
				}else if(cur.next == null) {  //��ǰ����㲻��Ҫ�ҵ�Ŀ������һ�����Ϊnull����û���ҵ�Ŀ��
					break;
				}
				//��ǰ��㲻˵Ҫ�ҵ�Ŀ���Ҵ�����һ����㣬������Ѱ��
				next = next.next;
				cur = cur.next;
				previous = cur;
			}
			return link;
		}
		//�ж��������Ƿ�Ϊ��
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
