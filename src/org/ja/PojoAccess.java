package org.ja;
import java.util.*;
public class PojoAccess {
	public static void main(String[] args) {
		//user defined list
		List<Pojo>li=new ArrayList<>();
		
		Pojo p=new Pojo();               // 0
		p.setName("dinesh");
		p.setId("asd");
		p.setSalary(50000);
		
		Pojo p1=new Pojo();              // 1
		p1.setName("kumar");
		p1.setId("adk");
		p1.setSalary(100000);         
		
		li.add(p);
		li.add(p1);
		
		Pojo pp=li.get(1);
		String s=pp.getName();
		System.out.println(s);
		
		System.out.println(li.get(0).getName());
		for(Pojo x:li){
			System.out.println(x.getName());
			System.out.println(x.getId());
			System.out.println(x.getSalary());
			
			
		}
		
		
	}

}
