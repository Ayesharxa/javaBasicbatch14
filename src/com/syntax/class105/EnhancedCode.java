package com.syntax.class105;

import java.util.Scanner;

public class EnhancedCode {

	private static Scanner scanner;

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println ("What time is it: Use 24 hour format");
		
		int hour = scanner.nextInt();
		
		String timeOfTheDay;
		if (hour >= 1 && hour <=11) {
			timeOfTheDay ="Morning";
		}else if (hour >= 12 && hour <=15) {
			timeOfTheDay ="Afternoon";
		}else if (hour >= 12 && hour <=20) {
			timeOfTheDay ="Evening";	
		}else if (hour >= 12 && hour <=24) {
			timeOfTheDay ="Night";
			
		System.out.println(timeOfTheDay);
			
			
			
			
		}

	}

}
