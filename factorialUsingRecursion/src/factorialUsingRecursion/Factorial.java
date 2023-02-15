package factorialUsingRecursion;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n)
	{
		if(n <= 1)
		{
			return 1;
		}
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		int number, result;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a non-negative number");
		number = input.nextInt();
		input.close();
		result = factorial(number);
		System.out.printf("%d!=%d",number,result);
	}
}
