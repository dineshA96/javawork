package org.ja;

public class India {
	static India a=new India();
	private India(){
		
	}
		public static India getInstance(){
			System.out.println(a);
			
			return a;	
		}
		public void state(){
			System.out.println("Tamilnadu");
		}
		public void district(){
			System.out.println("Nagapattinam");
		}
		public static void main(String[] args) {
			India a=getInstance();
			a.state();
			a.district();
			System.out.println(a);
		}
		
	}

