package hashset;

import java.util.HashSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HashSet s = new HashSet();
//		
//		s.add(120);
//		s.add(50);
//		s.add(1);
//		
//		
//		check hashset empty or not 
//		System.out.println(s.isEmpty());

//		wap to clone a hashset
//		
//		
//		System.out.println(s.clone());

//		write a program to append the specified element to the end of hashset

//		wap to compare two hash set
//		HashSet s1 = new HashSet();
//		
//		s.add(120);
//		s.add(50);
//		s.add(1);
//		
//		
//		System.out.println(s.equals(s1));

//		wap to get the number of element in a hashset

//		System.out.println(s.size());

//		wap to remove all of the elements from a hashset

//		System.out.println(s.removeAll(s));
//		System.out.println(s);

//		*234*
//		**34*
//		***4*
//		*****
//		int cnt=2;
//		for (int i = 1; i <= 4; i++)
//		{
//			int cnt2=cnt;
//			for (int j = 1; j <= 5; j++)
//			{
//				if(j==1 || j==5 || i==4 || (i==2 && j>1 && j<3) || (i==3 && j>1 && j<4))
//					System.out.print("*");
//				else
//				{
//					System.out.print(cnt2++);
//					
//				}
//			}
//			System.out.println();
//			cnt++;
//		}

		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 7; j++)
			{
				if((i==1 && j>1 && j<4) || (i==1 && j>4 && j<7)||( i==2 && j==1 && j<2 ) || (i==2 && j>3 && j<5)
						|| (i==2 && j>6 && j==7)|| (i==3 && j>1 && j<3 )|| (i==3 && j>5 && j<7) || 
						(i==4 && j>2 && j<4)||(i==4 && j>4 && j<6)||(i==5 && j>3 && j<5))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

//		for (int i = 1; i <= 7; i++)
//		{
//			for (int j = 1; j <= 5; j++) 
//			{
//				if(j==1 || (i==1 && j>4) || (i==2 && j>3 && j<5) || (i==3 && j>2 && j<4) || (i==4 && j<3)
//						|| (i==5 && j>2 && j<4) || (i==6 && j>3 && j<5) || (i==7 && j>4))
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= 13; i++) {
//			for (int j = 1; j <= 17; j++) {
//				if ((i == 1 && j > 3 && j < 7) || (i == 1 && j > 13 && j < 17) || (i==2 && j>2 && j<8) 
//						|| (i==2 && j>12 && j<18) || (i==3 && j>1 && j<9) || (i==3 && j>12 && j<17))
//
//					System.out.print("*");
//				else
//					System.out.print(" ");
//
//			}
//			System.out.println();
//		}
		
//		int secondtriangelendpoint=10;
//		int thirdtriangestartpoint=11;
//		int firstendpoint=1;
//		int fourtrianglestartpoint=20;
//		
//		for (int i = 1; i <=5; i++)
//		{
//			for (int j = 1; j <=20; j++)
//			{
//				if((j<= firstendpoint || j>=fourtrianglestartpoint) && ( j<= secondtriangelendpoint || j>= thirdtriangestartpoint ))
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//			firstendpoint++;
//			fourtrianglestartpoint--;
//			secondtriangelendpoint--;
//			thirdtriangestartpoint++;
//		}
	}
}
