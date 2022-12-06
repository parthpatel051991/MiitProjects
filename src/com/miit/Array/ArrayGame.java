package com.miit.Array;

import java.util.*;

public  class ArrayGame {

	public static  boolean canWin(int leap, int[] game) {
		// Return true if you can win the game; otherwise, return false.

		int flag=0;

		int i=0;
		for(i=0;i<game.length;)
		{    
			if(game[i]==0)
			{

				// count++;
				i++;
			}
			else if(game[i]!=0)
			{
				if(((i-1)+leap)>=game.length ||((i-1)+leap)>=(game.length-1) )
				{
					flag=1;
					break;
				}else if(game[(i-1)+leap]==0 )
				{
					i = (i-1) +leap;
					i++;

				}
				else if(game[(i-1)+leap]!=0)
				{
					flag=0;
					break;
				}
				// else
					// {
						//     continue;
				// }


			}

		}
		System.out.println(i);

		if(i==(game.length))
		{
			return true;
		}

		else if( flag==1)
		{
			return true;
		}else
		{
			return false;
		}
	}


		
		
//		int flag=0;
//		for(int i=0;i<game.length;i++)
//		{
//			try {
//				if(game[i+1]==0)
//				{
//					count++;
//				}
//			}
//			catch(Exception e)
//			{
//				break;
//			}
//		}
//
//		for(int j=0;j<game.length;j++)
//		{
//			try {
//				if(game[j+1]==0)
//				{
//					if(j+leap>game.length)
//					{
//						flag=j+leap;
//						if(flag>=game.length)
//						{
//							break;
//						}
//					} 
//				}else if(game[j+1]!=0)
//				{
//					
//				}
//			}catch(Exception e)
//			{
//				break;	
//			}
//		}
//
//		if (count>=game.length)
//		{
//			//System.out.println("YES");
//			return true;
//		}else if(flag>game.length)
//		{
//			//System.out.println("YES");
//			return true;
//		}else
//		{
//			//System.out.println("NO");
//			return false;
//		}


	



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
		}
		scan.close();
	}
}

