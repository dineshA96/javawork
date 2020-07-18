package org.ja;

public class SingleTonClass {
	static SingleTonClass b=null;
	
	private SingleTonClass(){                               //private constructor
		
	}
	public static SingleTonClass getInstance(){             //global accesss
		System.out.println(b);
		if(b==null){
			b=new SingleTonClass();                //object creation
		}
		System.out.println(b);
		return b;
	}
	public void helper(){
		System.out.println("reusable method");
		
	}
	public static void main(String[] args) {
		
		SingleTonClass b=getInstance();            //constructor
		b.helper();
		System.out.println(b);
		
		
		
	}

}
