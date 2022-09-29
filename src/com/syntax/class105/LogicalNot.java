package com.syntax.class105;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean boo=!true;
		
		System.out.println(boo);  //false
		
		boolean boo1=!false;
		System.out.println(boo1);  //true

		boolean rain=false;
		
		if(!rain) {
				System.out.println("I will go for a walk");
			}
	    String day="Sunday";
	    
	    if(!day.equals("Sunday")) {  //if day is not equal to Sunday
	    	System.out.println("Today is not Sunday");
	    }
	    System.out.println("---------------------------------------");
		
	    boolean checkBoxSelected=true;
	    
	    if(!checkBoxSelected) {
	    	System.out.println("I will click and select it");
	    }
	    
	    
	    
	    
	System.out.println("End of the program");
	}

}
