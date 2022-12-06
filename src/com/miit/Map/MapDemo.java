package com.miit.Map;

import java.util.*;


public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap m = new HashMap();
		
		m.put(10,"Sachin");
		m.put(18,"Kohli");
		m.put(7,"Dhoni");
		m.put(45,"Rohit");
		

		System.out.println(m);
		System.out.println();
		
		Set s =m.keySet();
		
		System.out.println(s);
		System.out.println(s.getClass().getName());
		
		System.out.println();
		
		Collection c = m.values();
		System.out.println(c);
		System.out.println(c.getClass().getName());
		
		System.out.println();
		
		Set mapData = m.entrySet();
		System.out.println(mapData);
		System.out.println(mapData.getClass().getName());
		
		System.out.println();
		
		Iterator itr = mapData.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry data = (Map.Entry) itr.next();
			
			System.out.println(data.getKey() +":"+ data.getValue());
			
			if(data.getKey().equals(10))
			{
				data.setValue("SRT");
			}
		}
		System.out.println();
		System.out.println(m);
		
		
	}

}
