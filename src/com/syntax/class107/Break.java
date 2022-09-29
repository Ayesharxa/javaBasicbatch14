package com.syntax.class107;

public class Break {

	public static void main(String[] args) {

		for(int i=1; i<5; i++) {
			System.out.println("Hello");
		if(i==3) {	
			break; 
		}
			System.out.println("End");
		
		}
	
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			System.out.println(i);
			}
	
	
	    boolean hungry=true;
	    while(hungry) {
	        System.out.println("Give me food");
	        break;
	    }

	    System.out.println("End");

	    }

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
