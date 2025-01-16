package treeset;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<Serializable> t = new TreeSet();
		
		t.add(100);
		t.add(101);
		t.add(102);
		t.add(103);
		t.add(104);
		t.add(105);
		
//		System.out.println(t.first());
//		System.out.println(t.last());;
//		System.out.println("HeadSet: "+t.headSet(103));
//		System.out.println("TailSet: "+t.tailSet(103));
//		System.out.println("Subset: "+t.subSet(100, 106));
		
//		wap a program to add all the element of the specified tree set to anothe treeset
		
//		TreeSet t2 = new TreeSet();
//		System.out.println(t);
//		t.add(t2);
//		System.out.println(t2);
		
//		wap to create a reverse order view of elements
		
//		System.out.println(t.descendingSet());
		
//		write a program to get the first and element in a tree set
		
//		System.out.println(t.first());
//		System.out.println(t.last());
		
//		write a proram to clone a treeset to another treeset
//		t2=(TreeSet) t.clone();
//		System.out.println(t2);
		
//		wap to get the number of elements in a treeset
		
		
//		wap to retrive and remove the first element of a treeset
		t.pollFirst();
		System.out.println(t);
		
//		write a program retrive and remove last elemnt of a tree set
		t.pollLast();
		System.out.println(t);
		
//		wwap to remove a given element form treeset
//		t.remove(104);
//		System.out.println(t);
		
		
//		wap to convert to a hashset to a arraylist
		
//		HashSet h = new HashSet();
//		h.add(10);
//		h.add(20);
//		h.add(30);
//		h.add(50);
//		
//		ArrayList l = new ArrayList();
//		l.addAll(h);
//		System.out.println(l);
		
		
	}

}
