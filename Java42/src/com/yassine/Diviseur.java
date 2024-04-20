package com.yassine;

public class Diviseur {
	
	 public static final String INVALID = "Invalid Number! It should be > 0";
	
	public static void factor(int n) {
		
		if (n < 0) {
			System.out.println(INVALID);
			return ;
		}
		
		if (n == 0) {
			return ;
		}
		
		System.out.println("factors of " + n + " are: ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		factor(12);
		factor(5);
		factor(34);
		factor(0);
		factor(-56);

	}

}
