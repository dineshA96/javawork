package org.ja;

public class StaticModi {
	public static int a=100;
	public static void test(){
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println(a);
		test();
	}

}
