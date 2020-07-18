package org.ja;

public class StringMethodsAndTypes {
	public static void main(String[] args) {
		//string methods contains,replaceAll
		String s="asd means Dinesh";
		Boolean b=s.contains("asd");
		System.out.println(b);
		String r=s.replaceAll("a", "A");
		System.out.println(r);
		//string types literal string-it will share the memory
		String s1="asd means Dinesh"; 
		int a=System.identityHashCode(s);
		System.out.println(a);
		int a1=System.identityHashCode(s1);
		System.out.println(a1);
		//non literal string-it will create a new memory even if same value
		String c=new String("aaa");
		String c1=new String("aaa");
		int d=System.identityHashCode(c);
		System.out.println(d);
		int d1=System.identityHashCode(c1);
		System.out.println(d1);
		//concatination
		String s2=s.concat("kumar");
		System.out.println(s2);
		// 
		int a2=System.identityHashCode(s2);
		System.out.println(a2);
		
	}

}
