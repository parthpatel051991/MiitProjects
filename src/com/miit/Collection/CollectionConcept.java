package com.miit.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int values[]=new int[4];
//		
//		Object values1[] = new Object[4];
//		
//		values1[0]=1;
//		values1[1]="Navin";
		
		Collection values = new ArrayList();
		values.add(3);
		values.add(4);
		values.add("Navin");
		
		Iterator i = values.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		for(Object i1 : values)
		{
			System.out.println(i1);
		}
		
		
		Collection<Integer> values1 = new ArrayList<Integer>();
		
		values1.add(3);
		values1.add(5);
		values1.add(6);
		
		for(Object i2 :values1)
		{
			System.out.println(i2);
		}
		
		
	}

}
