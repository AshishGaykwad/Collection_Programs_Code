package collection_program;

import java.util.LinkedList;

public class first_element_que_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
		LinkedList list = new LinkedList();
//		
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		list.addFirst(40);
//		
//		System.out.println(list);
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.remove(10);
		System.out.println(list);
		
		LinkedList list2 = list;
		
		System.out.println(list2);
		
		
		
		
	}

}
