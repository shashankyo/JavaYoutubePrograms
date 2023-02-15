package divisorofNumber;

import java.util.Scanner;

public class Program {
public static void main(String[] args) {
	int number ;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
	number = input.nextInt();
	input.close();
	System.out.printf("The divisors of number %d are \n",number);
	for(int divisor=1;divisor<=number;divisor++)
	{
		if((number%divisor)==0)
		{
			System.out.printf("%d ",divisor);
		}
	}
}
}
