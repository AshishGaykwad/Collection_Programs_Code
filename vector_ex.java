package collection_program;

import java.util.ArrayList;
import java.util.Vector;

public class vector_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector v = new Vector();

		v.add(10);
		v.add(20);
		v.add(30);
		v.add(98.66);
		v.add("priya");
		v.add(20);
		v.add(1, "neha");
		System.out.println(v);
		v.add(2, 77.99);
		System.out.println(v);
		System.out.println(v.indexOf("neha"));
		v.add(v.size());
		System.out.println("previous list:"+v);
		v.remove(1);
		System.out.println("after remove:"+v);
		System.out.println(v);
	}

}
