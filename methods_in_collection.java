package collection_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class methods_in_collection {

	public static void main(String[] args) {
		
		
		List <Integer> list = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(20);
		list.add(60);
		list.add(50);
		
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		Collections.swap(list, 0, 4);
		
		System.out.println(list);
		
		Collections.

	}

}
