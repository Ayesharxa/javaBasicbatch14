package GroupTasks;

import java.util.Scanner;

public class Task101 {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
        
		int numbers[] = new int[5];
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter a number");
			numbers[i] = scan.nextInt();
			sum += numbers[i];
		}
		System.out.println("Sum of entered numbers is: " + sum);

	}

	}


