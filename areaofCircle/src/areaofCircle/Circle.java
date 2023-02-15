package areaofCircle;

import java.util.Scanner;

public class Circle {
public static void main(String[] args) {
	double radius,area;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the radius");
	radius = input.nextDouble();
	input.close();
	area = Math.PI * radius * radius;
	System.out.println("Area of circle is"+ area);
}
}
