package stack;

import java.util.Stack;

public class stack_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		
		st.pop();
		st.peek();
		System.out.println(st);
		
		st.empty();
		System.out.println(st);
	}

}
