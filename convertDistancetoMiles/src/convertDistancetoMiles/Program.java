package convertDistancetoMiles;

import java.util.Scanner;

public class Program {
public static void main(String[] args) {
	double kmmeter,miles;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter distance in Km");
	kmmeter = input.nextDouble();
	input.close();
	miles = kmmeter * 0.621371;
	System.out.printf("%f kilometer = %fmiles",kmmeter,miles);
}
}
