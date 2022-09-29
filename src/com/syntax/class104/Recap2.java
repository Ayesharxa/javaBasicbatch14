package com.syntax.class104;

public class Recap2 {
	
	//format code: ctrl+Shift+f

	public static void main(String[] args) {
		
		boolean allergy=true;    //* matches
		
		String allergyType="Wheat";  //**matches
		
		if(allergy) {			//* matches
			System.out.println("Let's check what allergy you have");
			
			if(allergyType.equals("Pollen")) {    //**matches
				System.out.println("Try to stay indoors");	
			}else if (allergyType.equals("Peanut")) {
				System.out.println("Stay away from peaunts");
			}else if (allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy");
			}else {
				System.out.println("We need to do some test");
			}
		
		}else {
			System.out.println("You are lucky");
			
		}

	}

}
