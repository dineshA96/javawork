package org.ja;

public class LitNonLitString {
	public static void main(String[] args) {
		System.out.println("literal string");
		String s="aa";
		String s1="aa";
		int i=System.identityHashCode(s);
		System.out.println(i);
		int i1=System.identityHashCode(s1);
		System.out.println(i1);
		
		System.out.println("non literal string");
		String s2=new String("aa");
		int i2=System.identityHashCode(s2);
		System.out.println(i2);
	}

}
