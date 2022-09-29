package com.syntax.class107;

import java.util.Scanner;

public class CoffeeHw {

	public static void main(String[] args) {
		
		
		
		int price=10;


		System.out.println("Plese pay for the cofee");
		while (price==5) {
		    {System.out.println("Please Enjoy your cofee"); }
		    price++;
		}
		while (price!=5) {if(price>5)
		{System.out.println("Pay less");}
		while (price!=5) {if (price<5)
		{System.out.println("Pay more");price+=1;} 

		
		
		
		Scanner scanner=new Scanner(System.in);

        double cost=5.99;
        double user=0.0;



            Scanner in=new Scanner(System.in);
            System.out.println("Please pay for the coffee");
            user=in.nextDouble();

        do {
        if(user>cost) {
                System.out.println("Please give less than price");
                user=in.nextDouble();
            } else if(user<cost) {
                System.out.println("Please give more than price");
                user=in.nextDouble();
            }
        }while(user!=cost);

        System.out.println("Please enjoy your coffee");


}
}
}
}


