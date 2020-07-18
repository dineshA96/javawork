package org.ja;

public class Employee {
	private void verify(){
		String id="222345";
		if(id.startsWith("12")) {
			System.out.println("unit 1 employee");
	}
		else{
			try{
				throw new EmpNotFound();
			}
			catch(EmpNotFound e){
				e.printStackTrace();
			}
			finally{
				System.out.println("close");
			}
		}
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.verify();
	}
	
}
