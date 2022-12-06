package com.miit.Array;

public class BubbleSort {


	private static void bubbleSort(int[]array)
	{
		int n=array.length;
		int k;

		for(int m=n;m>=0;m--)
		{
			for(int i=0;i<n-1;i++)
			{  
				k=i+1;
				if(array[i]>array[k])
				{
					swapMe(i,k,array);
				}

			}
//			printMe(array);    just to check how bubble sort works
		}
		printMe(array);
	}






	private static void swapMe(int i,int j,int[]array)
	{
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}




	private static void printMe(int [] array) {

		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] +"  ");
		}
		System.out.println();

	}


	public static void main(String[] args) {

		int[] input= {4,2,9,6,23,12,0,1};

		bubbleSort(input);
	}

}
