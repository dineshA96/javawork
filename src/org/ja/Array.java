package org.ja;

public class Array {
	public static void main(String[] args) {
		//Normal for loop
		int b[]={1,2,3,4,5};
		
		for(int i=0;i<5;i++){
			
			System.out.println(b[i]);
		}
		
		int a[]=new int[6];
		a[0]=11;
		a[1]=12;
		a[2]=13;
		a[3]=44;
		a[4]=55;
		int le=a.length;
		System.out.println(le);
		
		//Enhanced for loop
		for(int x:a){
			System.out.println(x);
		}

		
		
		
		
		
		
	}

}
