package com.yassine;

public class FirstLastDigitSum {
		
	public static int firstLastDigitSum(int x) {
		
		int a = x;
		if (x >= 0 && x <= 9) {
			return x;
		}
		
		int last = x % 10;
		int first = 0;
		
		while (x != 0) {
			first = x % 10;
			x /= 10;
		}
		
		if (a < 0) {
			last *= -1;
		}
		
		return last + first;
				
	}

	public static void main(String[] args) {
			
		System.out.println(firstLastDigitSum(123)); // 4
		System.out.println(firstLastDigitSum(23)); // 5
		System.out.println(firstLastDigitSum(89)); // 17
		System.out.println(firstLastDigitSum(-125)); // 4
		System.out.println(firstLastDigitSum(-12527771)); // 0
			
		}

}
