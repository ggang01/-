/**
 * 큐를 링크드 리스트로 구현 링크드 리스트를 연습하고 큐에 활용하였음.
 * poll하면 헤더만 삭제하면 되기 때문에 그전 노드를 알 필요가 없음.
 * @author kang
 *
 */
public class Queue {

	public static void main(String[] args) {
		LinkList Que=new LinkList();
		Que.offer(10);
		Que.offer(20);
		Que.offer(30);
		Que.offer(60);
		Que.offer(170);
		Que.poll();
		System.out.println(Que.printList());
		Que.poll();
		System.out.println(Que.printList());
		Que.poll();
		System.out.println(Que.printList());
		Que.poll();
		System.out.println(Que.printList());
		Que.poll();
		System.out.println(Que.printList());

	}

}

class LinkList{
	private Node head;
	private Node tail;
	private int size=0;
	class Node{
		private Node nextNode;
		private Object data;
		Node(Object data){
			this.data=data;
			this.nextNode=null;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.valueOf(data);
		}
	}
	public void addFirst(Object data) {
		Node newnode=new Node(data);
		head=newnode;
		tail=newnode;
		newnode.nextNode=null;
		size++;
	}
	public void offer(Object data) {
		if(size==0) {
			addFirst(data);
		}
		else {
			Node newnode=new Node(data);
			tail.nextNode=newnode;
			tail=newnode;
			newnode.nextNode=null;
			size++;
		}
	}
	public String poll() {
		Node newnode=head;
		head=newnode.nextNode;
		if(size==0) {
			return "데이터가 없습니다.";
		}
		size--;
		return newnode.toString();
	}
	public String printList() {
		String str="[";
		if(head==null) {
			return "데이터가 없어용";
		}
		else {
		Node newnode=head;
		 
		while(newnode.nextNode!=null) {
			str+=newnode.toString()+", ";
			newnode=newnode.nextNode;
		}
		str+=newnode.toString()+"]";
		}
		return str;
	}
}
