package org.ja;
import java.util.*;
public class SetExample {
	public static void main(String[] args) {
		Set<Integer>s=new TreeSet();
		//print in ascending order because of TreeSet
		s.add(11);
		s.add(222);
		s.add(33);
		s.add(44);
		System.out.println(s);
		//enhanced for loop iterate
		for(int x:s){
			System.out.println(x);
		}
		
	}

}
