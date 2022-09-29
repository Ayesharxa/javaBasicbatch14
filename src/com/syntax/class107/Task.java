package com.syntax.class107;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// from the range of 1 to 50 please find the sum of all even and all odd numbers

		// create secret # and let user guess the secret number once user guess the number then have program says you won
		
		int evenSum = 0;
		int oddSum= 0;

		for(int i = 1; i<=50;i++) {

		    if(i%2==0) {
		        evenSum = i + evenSum;
		    }else if(i%2!= 0) {
		        oddSum = i + oddSum;
		    }

		}
		System.out.println("Sum of even numbers 1-50 = " +evenSum);
		System.out.println("Sum of odd numbers 1-50 =" +oddSum);
        

		Scanner scan=new Scanner (System.in);
	     int secretNumber=20;
	    do {
	        System.out.println("Enter your secret number");
	        secretNumber=scan.nextInt();
	        }
	        while (secretNumber!=20);
	    System.out.println("You win");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
