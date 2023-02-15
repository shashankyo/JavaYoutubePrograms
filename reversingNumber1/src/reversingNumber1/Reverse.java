package reversingNumber1;

public class Reverse {
public static void main(String[] args) {
	int num = 123;
	int remainder,revnumber=0;
	while(num>0)
	{
		remainder = num%10;
		num = num /10;
		revnumber = (revnumber*10)+remainder;
	}
	System.out.printf("Reversed no is %d",revnumber);
}
}
