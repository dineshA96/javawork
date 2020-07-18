package org.ja;
import java.util.*;
import java.util.Map.Entry;


public class UserDefinedMap {
	public static void main(String[] args) {
		Map<Integer,Pojo>m=new LinkedHashMap<>();
		Pojo p=new Pojo();
		p.setName("dinesh");
		p.setId("adk");
		p.setSalary(200000);
		m.put(1,p);
		
		//System.out.println(m.get(1).getName());
		
		Set<Entry<Integer,Pojo>>en=m.entrySet();
		for(Entry<Integer,Pojo>x:en){
			System.out.println(x.getKey());
			System.out.println(x.getValue().getName());
			System.out.println(x.getValue().getId());
			System.out.println(x.getValue().getSalary());
		}
		
				
	}

}
