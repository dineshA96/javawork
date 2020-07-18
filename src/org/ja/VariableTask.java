package org.ja;

public class VariableTask {
	public static int a;
	int b=20;
	public VariableTask(){
		System.out.println(a);
		System.out.println(b);
		a++;
		b++;
	}
	public static void main(String[] args) {
		VariableTask v=new VariableTask();
		VariableTask v1=new VariableTask();
		VariableTask v2=new VariableTask();
	}

}
