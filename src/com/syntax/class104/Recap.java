package com.syntax.class104;

public class Recap {
	
	//shortcut to auto complete: ctrl+space   (main-created public static void)
	
	public static void main(String[] args) {
		
		String phone="Motorolla";
		
		if(phone.equals("iPhone")) {
			System.out.println("I want to buy it for me");
			
		}else if (phone.equals("Samsung")) {
			System.out.println("I want to buy it for my husband");
			
		}else if (phone.equals("Nokia")) {
			System.out.println("I want to buy it for my grandma");
		
		}else {    //Java will use this if nothing else is true
			
			System.out.println("That is not the phone I want");
		}
		
		
		
	}
	
}






