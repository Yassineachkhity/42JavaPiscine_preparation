package com.yassine;
import java.util.Scanner;

public class SumofDigits {
	
	
	public static int sumOfDigits(int num) {
		int sum = 0;
		int r = 0;
		
		while (num != 0) {
			r = num % 10;
			num /= 10;
			sum += r;	
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			 int num = s.nextInt();
			 
			 System.out.println("The Sum of digits of " + num + " is = " + sumOfDigits(num));
		}

	}

}
