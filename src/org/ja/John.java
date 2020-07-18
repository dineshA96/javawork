package org.ja;

import java.util.Scanner;

public class John {
	public static void main(String[] args) {
		int a=1234;
		String b="aaaa";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Id");
		int i=sc.nextInt();
		System.out.println("Password");
		String p=sc.next();
	    if(i==1111&p.equals("aaaa")){
	    	System.out.println("dinesh");
	    }
	    else if(i==2222&p.equals("bbbb")){
	    	System.out.println("kumar");
	    }
	    else if(i==3333&p.equals("cccc")){
	    	System.out.println("joseph");
	    }
	    else if(i==4444&p.equals("dddd")){
	    	System.out.println("john");
	    }
	    else{
	    	System.out.println("Invalid Id or Password");
	    }
		
		
		
	}

}
