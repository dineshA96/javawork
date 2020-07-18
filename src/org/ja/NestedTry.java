package org.ja;

import java.util.Scanner;

public class NestedTry {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			int a=sc.nextInt();
			System.out.println("a is "+a);
			try{
				String s=sc.next();
				int i=Integer.parseInt(s);
				System.out.println(i+5);
			}
			catch(Throwable e){
				System.out.println("inner catch");
				e.printStackTrace();
				System.out.println(e);
			}
		}
			catch(Throwable e){
				System.out.println("outer catch");
				e.printStackTrace();
				System.out.println(e);
			}
		}
	}


