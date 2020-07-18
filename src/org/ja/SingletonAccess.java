package org.ja;

public class SingletonAccess {
	public static void main(String[] args) {
		India b=India.getInstance();
		b.district();
		b.state();
		System.out.println(b);
		
		
	}

}
