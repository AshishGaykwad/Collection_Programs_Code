package collection_program;

import java.util.LinkedList;

public class lindkedList_Ex {

	public static void main(String[] args) {
		
		
		LinkedList list = new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add("Abc");
		list.add('i');
		list.add(20);
		list.add(20);
		list.add(null);
		list.addFirst(777);
		list.addLast(56);
		//System.out.println("*********");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.lastIndexOf(10));
		list.removeFirst();
		list.removeLast();	
		list.remove();
		list.remove("abc");
		System.out.println(list.contains("Abc"));
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.clone());
		System.out.println(list.pop());
		//System.out.println(list.push("Abc"));
		//System.out.println(list.hashCode());
		//list.clear();
		System.out.println(list);
	}

}
