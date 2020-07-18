package org.ja;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {
	public static void main(String[] args) {
		//map with out wrapper class
		//we can use dissimilar data type
		Map m=new TreeMap();
		m.put(1,"adk");
		m.put(2,"asd");
		m.put(3, 2.4);
		m.put(4, 'a');
		m.put(5,25);
		System.out.println(m);
		//we can use wrapper class to print similar data type
		Map<Integer,String>n=new TreeMap();
		n.put(1, "aa");
		n.put(2, "bb");
		n.put(3, "cc");
		n.put(4, "dd");
		System.out.println(n);
		//to iterate the map by using entryset method
		Set<Entry<Integer,String>>en=n.entrySet();
		for(Entry<Integer,String>x:en){
			System.out.println(x);
			
			int k=x.getKey();     //
			System.out.println(k);//sysout(x.getKey());
			
			String s=x.getValue();
			System.out.println(s);
			
		}
		
		
		
	}

}
