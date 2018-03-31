
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.add(2, 50);
		System.out.println(list.toString());
		list.reverseLink();
		System.out.println(list.toString());
	}

}

