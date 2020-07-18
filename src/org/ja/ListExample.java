package org.ja;
import java.util.ArrayList;
import java.util.List;
public class ListExample {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		System.out.println(li.get(4));
		System.out.println(li);
		int siz=li.size();
		System.out.println(siz);
		li.add(100);
		
		li.add(2,50);
		System.out.println(li);
		li.set(3,300);
		System.out.println(li);
		
		System.out.println("Normal for Loop");
		for(int i=0;i<li.size();i++){
			System.out.println(li.get(i));
		}
		
		System.out.println("Enhanced for Loop");
		for(int x:li){
			System.out.println(x);
		}
		
		
		
	}

}
