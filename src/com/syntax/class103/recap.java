package com.syntax.class103;

public class recap {

	public static void main(String[] args) {
		
		/*
		 * String concatenation helps us combine a String with any primitive data type together
		 * we can 
		 */
		
	String firstName="Mina";
	String lastName="Henen";
	String fullname=firstName+ " *** " + lastName;
	System.out.println(fullname);
	
	int houseNo=10;
	int apartmentNo=5;
	String streetName="That street";
	String city="New York";
	String country="USA";
	String fullAddress=apartmentNo+" "+houseNo+" "+streetName+" "+city+" "+country;
	System.out.println(fullAddress);
	
	String incompleteAddress=houseNo+city;
	
	String step1="if we subtract 10 from 5 we get =" +10;  //results in a String
	 // it is not defined Java does not understand what to do when we ask
	 // a String from a number it complains
	 // String step2=step1-5;
	
	
	System.out.println("if we subtract 10 from 5 we get ="  +(10-5));
	
	
		
		

	}

}
