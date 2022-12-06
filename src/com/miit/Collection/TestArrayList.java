package com.miit.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = new ArrayList<String>();

		list1.add("Parth");
		list1.add("Bijal");
		list1.add("Raman");
		list1.add("Parin");

		// Iterator Concept

		Iterator itr = list1.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("=====================================");

		//accessing the element   

		System.out.println("Returning Element :"+ list1.get(0));

		// changing the element

		list1.set(3, "Harbhajan");

		System.out.println("After changing element no 3 ");

		for(String n : list1)
		{
			System.out.println(n);
		}



		// Collection.sort concept

		Collections.sort(list1);

		System.out.println("========================================");
		System.out.println("After Sort");

		// For-each loop concept	

		for(String name:list1)
		{
			System.out.println(name);
		}
		
		System.out.println("===============================================");
		
		System.out.println("After adding a element");
		
		list1.add("Mitesh");
		
		list1.add(1, "Ashtha");
		
		for(String name:list1)
		{
			System.out.println(name);
		}
		
System.out.println("===============================================");
		
		System.out.println("After removing a element 2");
		
		list1.remove(2);
//		list1.removeIf(str -> str.contains("Bijal"));
		
		for(String name:list1)
		{
			System.out.println(name);
		}


		System.out.println("===============================================");
		//		
		//	// Traversing the list through ListIterator
		//		System.out.println("Traversing list through List Iterator in reverse");
		//		
		//		
		//		ListIterator<String> list2 = list1.listIterator(list1.size());
		//		try {
		//		while(list2.hasPrevious())
		//		{
		//			String str =((ListIterator<String>) list1).previous();
		//			System.out.println(str);
		//		}
		//		}
		//		catch(Exception e)
		//		{
		//			e.printStackTrace();
		//		}

		System.out.println("Traversing list through for loop:");  

		for(int i=0;i<list1.size();i++)  
		{  
			System.out.println(list1.get(i));     
		}  

		System.out.println("============================================");

		System.out.println("Traversing list through forEach() method:");  
		//The forEach() method is a new feature, introduced in Java 8.  
		
		
		list1.forEach(a->{ //Here, we are using lambda expression  
			System.out.println(a);  
		});  
		
		
		System.out.println("===============================================");

		System.out.println("Traversing list through forEachRemaining() method:");  


		Iterator<String> itr1=list1.iterator();  


		itr1.forEachRemaining(a-> //Here, we are using lambda expression  
		{  
			System.out.println(a);  
		});  




		System.out.println("============================================");
		
		
		
		System.out.println("Lets sort a numbers");

		System.out.println();

		List<Integer> list3 = new ArrayList<>();

		list3.add(5);
		list3.add(20);
		list3.add(3);
		list3.add(1);

		Collections.sort(list3);


		for(int num:list3)
		{
			System.out.println(num);
		}
		
		
		System.out.println("Using ForEachRemaining method");
		Iterator<Integer> itr3 = list3.iterator();
		
		itr3.forEachRemaining(a -> {
			System.out.println(a);
		});
		
		
	}

}
