package com.syntax.class109;

public class TwoDArrayDemo {

	public static void main(String[] args) {
/*Create a 2D array (longer way)where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
*After storing values print following String:
*Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
*Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
* Then your program should print name of the students that has A and B grade  
 */
		String[][] big=new String[2][4];
        big[0][0]="Mr";
        big[0][1]="Mrs";
        big[0][2]="Ms";
        big[0][3]="Miss";

        big[1][0]="Smith";
        big[1][1]="Jordan";
        big[1][2]="Jackson";
        big[1][3]="Obama";

        System.out.println(big[0][1]+" "+big[1][0]+" ");
        System.out.println(big[0][0]+" "+big[1][3]+" ");
        System.out.println(big[0][2]+" "+big[1][2]+" ");
        System.out.println(big[0][3]+" "+big[1][1]+" ");

	
        System.out.println("------------------------------------------ ");

        
        
        String[][] result = {{"T","Ayesha","Merm","Asma"},
                {"A","B","C","D"}

        };
        System.out.println(result[0][0]+" has got '"+result[1][0]+"' grade.");
        System.out.println(result[0][1]+" has got '"+result[1][1]+"' grade. ");
        System.out.println(result[0][2]+" has got '"+result[1][2]+"' grade. ");
        System.out.println(result[0][3]+" has got '"+result[1][3]+"' grade. ");
	
	
	}

}
