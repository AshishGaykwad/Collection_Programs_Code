package collection_program;

import java.util.ArrayList;

public class Arraylist_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList list = new ArrayList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(98.66);
		list.add("priya");
		list.add(20);
		list.add(1, "neha");
		System.out.println(list);
		list.add(2, 77.99);
		System.out.println(list);
		System.out.println(list.indexOf("neha"));
		list.add(list.size());
		System.out.println("previous list:"+list);
		list.remove(1);
		System.out.println("after remove:"+list);
		System.out.println(list);
	}

}
