package com.yassine;
import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int n) {
		
		if (n < 0) {
			return false;
		}
		
		for(int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int x = s.nextInt();
		
		if (isPrime(x)) {
			System.out.println("The number " + x + " is a prime number");
		} else {
			System.out.println("The number " + x + " is not a prime number");
		}

	}

}
