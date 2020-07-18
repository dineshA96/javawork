package org.ja;

import java.util.Scanner;

public class John2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks");
		System.out.println("english");
		int e=sc.nextInt();
		System.out.println("tamil");
		int t=sc.nextInt();
		System.out.println("maths");
		int m=sc.nextInt();
		System.out.println("science");
		int s=sc.nextInt();
		System.out.println("social");
		int so=sc.nextInt();
		
	    double av;
		av=((e+t+m+s+so)/5);
		System.out.println("your average is "+av);
		
		if(e<45||t<45||m<45||s<45||so<45){
			System.out.println("Result : Fail");
			if(e<45){
			System.out.println("you have failed in english "+e);
			}
			else if(t<45){
				System.out.println("you have failed in tamil "+t);
			}
			else if(m<45){
				System.out.println("you have failed in maths "+m);
			}
			else if(s<45){
				System.out.println("you have failed in science "+s);
			}
			else if(so<45){
				System.out.println("you have failed in social "+so);
			}
			
		}
		else{
			System.out.println("Result : Pass");
		}
		//
		if(e<45){
			System.out.println("english UA");
		}
		else if(e<55){
			System.out.println("english E");
		}
		else if(e<65){
			System.out.println("english D");
		}
		else if(e<75){
			System.out.println("english C");
		}
		else if(e<85){
			System.out.println("english B");
		}
		else if(e<95){
			System.out.println("english A");
		}
		else if(e<100){
			System.out.println("english S");
		}
		
		//
		if(t<45){
			System.out.println("tamil UA");
		}
		else if(t<55){
			System.out.println("tamil E");
		}
		else if(t<65){
			System.out.println("tamil D");
		}
		else if(t<75){
			System.out.println("tamil C");
		}
		else if(t<85){
			System.out.println("tamil B");
		}
		else if(t<95){
			System.out.println("tamil A");
		}
		else if(t<100){
			System.out.println("tamil S");
		}
		//
		if(m<45){
			System.out.println("maths UA");
		}
		else if(m<55){
			System.out.println("maths E");
		}
		else if(m<65){
			System.out.println("maths D");
		}
		else if(m<75){
			System.out.println("maths C");
		}
		else if(m<85){
			System.out.println("maths B");
		}
		else if(m<95){
			System.out.println("maths A");
		}
		else if(m<100){
			System.out.println("maths S");
		}
		//
		if(s<45){
			System.out.println("science UA");
		}
		else if(s<55){
			System.out.println("science E");
		}
		else if(s<65){
			System.out.println("science D");
		}
		else if(s<75){
			System.out.println("science C");
		}
		else if(s<85){
			System.out.println("science B");
		}
		else if(s<95){
			System.out.println("science A");
		}
		else if(s<100){
			System.out.println("science S");
		}
		//
		if(so<45){
		System.out.println("social UA");
	}
	else if(so<55){
		System.out.println("social E");
	}
	else if(so<65){
		System.out.println("social D");
	}
	else if(so<75){
		System.out.println("social C");
	}
	else if(so<85){
		System.out.println("social B");
	}
	else if(so<95){
		System.out.println("social A");
	}
	else if(so<100){
		System.out.println("social S");
	}

	}

}
