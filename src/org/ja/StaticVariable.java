package org.ja;

public class StaticVariable {
	public static int a;
	public static void stat(){
		 a=50;
		 System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println(a);
		stat();
		System.out.println(a);
	}

}
