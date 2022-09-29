package com.syntax.class104;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		 
		System.out.println("Task 1---------------------------------");
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your height");
		double height =input.nextDouble ();
		
		

		if(height<60) {
		    System.out.println("You are short");
	
	} else if (height >60 || height <72) {
		    System.out.println("You are medium");
	
	} else if(height>72) {
		    System.out.println("You are tall");
	
	}
		
	}
	



	






}