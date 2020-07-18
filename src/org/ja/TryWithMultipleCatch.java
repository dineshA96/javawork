package org.ja;

public class TryWithMultipleCatch {
public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	try{
		int a[]={1,2,3,4,5};
		System.out.println(a[6]);
	}
	catch(ArithmeticException e){
		System.out.println("dont divide");
	}
	catch(Throwable e){
		e.printStackTrace();
		
	}
	System.out.println(4);
	System.out.println(5);
}
}
