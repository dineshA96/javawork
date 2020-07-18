package org.ja;

public final class FinalModi {
	 final int a=10;
	
	public final void test(){
		 //a=100;   //we can't change the value
		
		System.out.println(a);
	}
	public static void main(String[]args){
		FinalModi m=new FinalModi();
		m.test();
		
	}
	

}
