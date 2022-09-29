package com.syntax.class105;

public class SwithDemo2 {

	public static void main(String[] args) {
		//matching cases must be of same data type as a variable
		//no duplicated case in switch allowed
		
		char choice='K';
		String answer;
		
		switch(choice) {
		
		case 'Y':
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
		default: 
			answer="Unknown";
			break;
						
		}	
	System.out.println(answer);	
	
	/*
	 * Limitation of Switch Case:
	 * switch case cannot use logical operators
	 * switch case can not use relational operators 
	 */
	
	/*
	 * CANNOT work with boolean values
	 boolean boo=true;
	 
	 switch (boo) {
	 
	 *CANNOT work with float/double and long
	 */
	
	
	
	
	
	}

}
