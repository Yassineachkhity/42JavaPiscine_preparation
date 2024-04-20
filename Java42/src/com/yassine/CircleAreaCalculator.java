package com.yassine;

import java.lang.Math; 
import java.util.Scanner;
import java.text.DecimalFormat;

public class CircleAreaCalculator {

	public static double calculateArea(double radius) {
		
		return radius * radius * Math.PI;
	}
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner scanner = new Scanner(System.in);
		
		double radius;
		
		do {
			System.out.println("Enter a Valid radius: ");
			radius = scanner.nextDouble();
		} while(radius < 0);
		
		scanner.close();
		
		double area = calculateArea(radius);
		String formattedArea = df.format(area); 
		
		System.out.println("The area of the circle with radius: "+ radius + " = " + formattedArea);
		
	}

}
