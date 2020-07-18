package org.ja;

import java.util.Scanner;

public class John1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Reg no");
		long r=s.nextLong();
		System.out.println("ReEnter your Reg no");
		long r1=s.nextLong();
		
		if(r==r1&(r==820814114305l||r==820814114307l||r==820814114308l)){
		
			System.out.println("Enter your Password");
			String p=s.next();	
			
			if(r1==820814114305l&p.equals("305")){
				System.out.println("dinesh");
			}
			else if(r1==820814114307l&p.equals("307")){
				System.out.println("jagan");	
			}
			else if(r1==820814114308l&p.equals("308")){
				System.out.println("joseph");
			}
		    else{
			System.out.println("Invalid password");
		}
			
	}
		else{
			System.out.println("Reg no is mismatch");
		}
		


}
}