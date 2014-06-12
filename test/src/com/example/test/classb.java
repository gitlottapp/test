package com.example.test;

public class classb {
	
	public classb() {
		int result;
		
		System.out.println("classb constructor is called");
	
		classa newa = new classa(0);
		int temp= newa.getter();
		System.out.println("The value of x= " + temp);
		
		result = temp;
		System.out.println("This value of result  : "+ result);
	}
	
	/*public static void main(String[] args) {
	
		System.out.println("Main method is called");
		classa a = new classa();
		int temp = a.getter();
		System.out.println("The value of temp : " + temp);
	
	}*/
	
}
