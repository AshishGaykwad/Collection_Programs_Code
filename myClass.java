package collection_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class myClass {

	public static void main(String[] args) {


		ArrayList <Student> list = new ArrayList<>();
		
		Student s1 = new Student(89, 71, 88, 62);
		list.add(s1);
		
		Student s2 = new Student(77, 83, 89, 62);
		list.add(s1);
		
		Student s3 = new Student(69, 76, 84, 91);
		list.add(s1);
		
		Student s4 = new Student(79, 80, 73, 85);
		list.add(s1);
		
		Student s5 = new Student(88, 60, 59, 94);
		list.add(s1);
		
		Collections.sort(list);
		
		for(Student s:list)
		{
			System.out.println(s);
		}

	}

}
