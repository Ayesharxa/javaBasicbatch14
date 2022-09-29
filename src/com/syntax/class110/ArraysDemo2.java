package com.syntax.class110;

import java.util.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {

        String [] dresses=new String[] {"Little Black Dress","Cocktail Dress","Summer Dress","Maxi Dress"
                ,"Pencil Dress"};
        // last index is always size-1 because arrays
        // index start from zero
        System.out.println(dresses.length);
        // Mostly this is how you will use arrays
        for(int i=0;i<dresses.length;i++) {
            System.out.println("Lets try "+dresses[i]);
        }
		// enhanced for loop
        for(String dress:dresses) {
        	System.out.println(dress);
        	
        }
        System.out.println("****************************************");
        System.out.println(Arrays.toString(dresses));
    	
        
        
        
        
        
        
		}
	    }

	

