package org.ja;

public class Super2 extends Super1{
	Super2(){
		System.out.println("child");
	}
	Super2(char i){
		super(123);
		System.out.println(i);
		
	}
	Super2(String add){
		super("aaa");
		System.out.println(add);
	}
	public static void main(String[] args) {
		Super2 s=new Super2();
		Super2 s1=new Super2('a');
		Super2 s2=new Super2("akm");
	}
	

}
