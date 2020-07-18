package org.ja;

public class Ic implements I1 {
	public void aa(){
		System.out.println("asdf");
		
	}
	public void bb(){
		System.out.println("zxcv");
	}
	private void cc(){
		System.out.println("lkjh");
	}
	public static void main(String[] args) {
     I1 c=new Ic();
     c.aa();
     c.bb();
      
	}

}
