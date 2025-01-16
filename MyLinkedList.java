package linkedList;


public class MyLinkedList {

		Node root;
		
		public void add(int num)
		{
			Node newObj = new Node();
			newObj.num=num;
			
			if(root==null)
			{
				root=newObj;
			}
			else
			{
				Node prachi = root;
				while(prachi.next!=null)
					prachi=prachi.next;
				prachi.next=newObj;
			}	
		}	
		public void print()
		{
			if(root!=null)
			{
				Node prachi=root;
				
				do
				{
					System.out.println(prachi.num);
					prachi=prachi.next;
				}
				
				while(prachi!=null);
			}
		}
}
