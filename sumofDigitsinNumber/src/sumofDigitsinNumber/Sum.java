package sumofDigitsinNumber;

public class Sum {
public static void main(String[] args) {
	int num = 123;
	int sum = 0;
	while(num > 0)
	{
		sum = sum  + (num % 10);
		num = num / 10;
	}
	System.out.printf("Sum of digits is %d",sum);
}
}
