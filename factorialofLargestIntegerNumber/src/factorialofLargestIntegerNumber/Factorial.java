package factorialofLargestIntegerNumber;

import java.math.BigInteger;

public class Factorial {
public static void main(String[] args) {
	int number = 100;
	BigInteger factorial = BigInteger.ONE;
	if(number<0)
	{
		System.out.println("Can't find the factorial of negative number");
	}
	else if(number <= 1)
	{
		System.out.printf("%d!=%d",number,factorial);
	}
	else
	{
		for(int counter=number;counter>=2;counter--)
		{
			factorial = factorial.multiply(BigInteger.valueOf(counter));
		}
	}
}
}
