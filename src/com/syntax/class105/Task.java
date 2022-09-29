package com.syntax.class105;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		   

		        Scanner input = new Scanner(System.in);
		        System.out.println("Enter birth month");
		        String month=input.next();
		        String season =null;

		        if (season.equals("January") season.equals("February")  season.equals("December")) {
		            s="Winter";
		        }else if(season.equals("March")  season.equals("April")season.equals("May")) {
		            s= "Spring";
		        }else if(season.equals("June")  season.equals("july") season.equals("August")) {
		            s="Summer";
		        }else if(season.equals("September")  season.equals("October") season.equals("November")) {
		            s="fall";

		        }else {
		            System.out.println("invalid");
		        }
		    System.out.println(s);
		            }



		            }
