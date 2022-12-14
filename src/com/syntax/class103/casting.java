package com.syntax.class103;

public class casting {

	public static void main(String[] args) {

		/*
		 *  type casting-> converting one data type to another data type
		 */
		
		byte box1=127;          //smallest box
		short box2=3333;        //slightly large box
		int box3=45454545;      //large box most commonly used
		long box4=45454545;     //slightly large box 		
		float box5=454545445;   //larger box
		double box6=454545445;  //largest
		
		int number=(int)15.2;        // we can't store the decimal number in a box of type int
		System.out.println(number);
		
		long smallerBox=(long)box2;
		System.out.println(smallerBox);
		
		short biggerBox=box1;
		
		long box7=box1;  // we can do this because box 7 is larger than box1
		
		float box8=(float)box6;  // as box6 is larger it is double we need type casting to assign the value
		
		char a=(char)67;
		System.out.println(a);
		
		int box9=(int)box4;
		System.out.println(box9);
		
		
		
		
		
		
		
		
		
		
		
	}

}
