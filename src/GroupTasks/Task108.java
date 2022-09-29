package GroupTasks;

public class Task108 {

	public static void main(String[] args) {
		
		int firstTenNumbers = 10;
		int previousNumber = 0;
		int nextNumber = 1;

		System.out.print("Fibonacci Series of " + firstTenNumbers + " numbers are: ");

		for (int i = 1; i <= firstTenNumbers; ++i) {
			System.out.print(previousNumber + " ");
			/*
			 * On each iteration, we are assigning second number to the first number and
			 * assigning the sum of last two numbers to the second number
			 */

			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
	}

}