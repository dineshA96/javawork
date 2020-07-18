package org.ja;

public class TryWithFinally {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try{
		System.out.println(3/0);
		}
		finally{
			System.out.println("end");
		}
		System.out.println(4);
		System.out.println(5);
		
	}

}
