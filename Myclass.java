package linkedList;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList list = new MyLinkedList();
		for (int i = 1; i <= 20; i++)
		{
			list.add(i);
		}
		
		list.print();
	}

}
