package org.ja;

public class CoronaSample {
	private void Checking(){
		
	int temperature=101;
	if(temperature<=90){
		System.out.println("Low Temperature");	
	}
	else if(temperature<=100){
		System.out.println("Normal Temperature");
		
	}
	else{
		try{
			throw new Corona();
		}
		catch(Corona e){
			e.printStackTrace();
			
		}
		finally{
			System.out.println("Patient self quarantine");
		}
	}
		
	}
	
	public static void main(String[] args) {
		CoronaSample c=new CoronaSample();
		c.Checking();
	}
}

	




