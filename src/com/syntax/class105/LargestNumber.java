package com.syntax.class105;

public class LargestNumber {

	public static void main(String[] args) {
		// find the largest number and then
		//find if the largest is even or odd?
		
		int n1=100;
		int n2=20;
		int n3=30;
		int largest=0;
		
		if (n1>n2 && n1>n3) {
			System.out.println(n1 +"is the largest");
			largest = n1;
		} else if (n2>n3 && n2>n1) {
			System.out.println(n2+ "is the largest");
			largest = n2;
		} else if (n3>n1 && n3>n2) {
			System.out.println(n2+ "is the largest");
			largest = n3;
				
		if(largest!=0) {
		
			if (largest%2==0) {
			System.out.println(largest+" is even number");
			}else {
			System.out.println(largest+" is odd number");
		
			}
		}
		
		}
			
		
			
			
			
			
			
		

	


