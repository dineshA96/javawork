package org.ja;

public class InstanceVariable {
	public int a;
	public void insta(){
		a=50;
		System.out.println(a);
	}
	public static void main(String[] args) {
		InstanceVariable v=new InstanceVariable();
		System.out.println(v.a);
		v.insta();
		System.out.println(v.a);
	}

}
