package com.example.test;

public class classa {
	
	int x=10;
	
	public classa() {
		
		System.out.println("classa constructor is called");
		
		classb b = new classb();
	
	}
	
	public classa(int i){
		//do nothing with x
		
		
	}

	int getter(){
		return x;
		}
}
