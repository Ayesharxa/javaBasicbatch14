package com.syntax.class110;

public class Array2DDemo1 {

	public static void main(String[] args) {

		String[] individualsInRoom1= new String[] {"Sabej", "Shah","Mina"};
		String[] individualsInRoom2= new String[] {"Roman", "Shah","Mina"};
		String[] individualsInRoom3= new String[] {"Asad", "Priyasri","Ali"};
		
		String[] [] rooms=new String[3] [];
		
			rooms[0]=individualsInRoom1;
	        rooms[1]=individualsInRoom2;
	        rooms[2]=individualsInRoom3;

	        System.out.println(rooms[2][2]);
		
		
		
	}

}
