package com.yassine;
import java.util.Scanner;


public class PerfectNum {

	public static boolean isPerfectNum(int num) {
		
		if(num < 0) {
			return false;
		}
		
		int sum = 1;
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		
		if (sum == num) {
			return true;
		}
		
		return false;
		
		
	}
	public static void main(String[] args) {
		/*
		 A perfect number is a number that is the sum of all its divisors (excluding itself)
		 equals the number itself.
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a valid Number: ");
		int num = scanner.nextInt();
		
		if (isPerfectNum(num)) {
			System.out.println("the number: " + num + " is a perfect number");
		} else {
			System.out.println("the number: " + num  + " is not a perfect number");
		}
		
		scanner.close();
	}

}
