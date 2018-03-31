
public class LinkedList {
	private Node head;
	private Node tail;
	private int size=0;
	class Node{
		private Object data;
		private Node nextnode;
		Node(Object data){
			this.data=data;
			this.nextnode=null;
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
		newnode.nextnode = head;
		tail=newnode;
		size++;
		
	}
	public void addLast(Object data) {
		if(size==0) {
			addFirst(data);
		}
		else {
			Node newnode=new Node(data);
			tail.nextnode=newnode;
			size++;
			tail=newnode;
		}
		
		
	}
	Node node(int n) {
		Node node=head;
		for(int i=0;i<n;i++) {
			node=node.nextnode;
		}
		return node;
	}
	public void add(int index,Object data) {
		Node temp1=node(index-1); //전노드 찾기
		Node temp2=node(index);	//후노드 찾기
		Node newnode=new Node(data);
		temp1.nextnode=newnode;
		newnode.nextnode=temp2;
		if(newnode.nextnode==null) {
			tail=newnode;
		}
	}
	public String toString() {
		String str = "[";
		if(head==null) {
			return "데이터가 없어용";
		}
		else {
			Node node=head;
			while(node.nextnode!=null) {
				str+=node.toString()+", ";
				node=node.nextnode;
			}
			str+=node.toString();
		}
		return str+"]";
	}
	public String Search(Object data) {
		Node node=head;
		while(node.nextnode!=null) {
			if(node.data==data) {
				return data+"가 있습니다.";
			}
			node=node.nextnode;
		}
		if(node.data==data) {
			return data+"가 있습니다.";
		}
		return data+"는 없습니다.";
		
	}
	public void delete(Object data) {
		Node node=head;
		for(int i=0;i<size;i++){
			if(node.data==data) {
				if(node==head) {
					head=head.nextnode;
					size--;
				}
				else{
					Node prenode=node(i-1);
					prenode.nextnode=node.nextnode;
					if(prenode.nextnode==null) {
						prenode=tail;
					}
					size--;
				}

			}
			node=node.nextnode;
		}
	}
	/**
	 * 1.전노드는 처음엔 null;
	 * 2.current노드를 head로 해서 시작
	 * 3.현재노드의 다음번 노드를 next에 저장
	 * 4.현재노드의 다음번 노드에 전노드 저장
	 * 5.전노드에 현재노드 저장
	 * 6.현재노드엔 다음 노드 저장
	 * 3~4번 반복
	 */
	public void reverseLink() {
		Node prenode=null;
		Node nownode=head;
		while(nownode!=null) {
			Node next=nownode.nextnode;
			nownode.nextnode=prenode;
			if(prenode==null) {
				tail=nownode;
			}
			prenode=nownode;
			nownode=next;
		}
		head=prenode;
	}
	public void deleteAll() {
		size=0;
		head.nextnode=null;
		head=null;
		tail=null;
	}
}
