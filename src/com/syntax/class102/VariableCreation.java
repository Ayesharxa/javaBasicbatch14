package com.syntax.class102;

public class VariableCreation {	
	
	public static void main (String [] args) {
	
		//1 way to create a variable
		byte b=10; //created a variable and assigned value
		
		//2 way to create a variable
		int i;  //created a variable
		i=100;  //assigned a value
	    
		// we need to create a variable only once
		// then we can use it as many times we want/need during the program
		
		//3 way
		//create a variable = declare a variable
		int num1, num2, num3;
		
		num1=100;   //assigned value or initialize variable
		num2=200;
		num3=300;
		
	
		//int num1=100; error  -> duplicate variable
		
		// ? Can I change a value of a variable???
		
		System.out.println(num2);  //assigned value 200
		
		num2=2000;  //as long as its a same date type you can reassign the value
		
		System.out.println(num2);  //assigned value 2000
		
		// 1 variable can hold only 1 value at 1 time/per line
		
		boolean boo=true;
		boo=false;
		boo=true;
		
		
	}
	
}	
	
	
	









