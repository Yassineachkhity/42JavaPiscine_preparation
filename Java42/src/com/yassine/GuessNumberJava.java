package com.yassine;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberJava {

	public static int generateRandomNum() {
		
        Random random = new Random();
        
        // generate a random integer number between 1 and 9
        int randomNumber = random.nextInt(9) + 1;
        
        return randomNumber;
	}
	public static void main(String[] args) {
		
		int number;
		int guess = 3;
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Enter a Valid number between 1 and 9");
			number = scanner.nextInt();
			
		}while(number < 0 && number > 9);
		
		
		int random = generateRandomNum();
		
		while (guess > 1) {
			if (random == number) {
				System.out.println("Congratulation");
				break;
			} else if (number > random) {
				System.out.println("Your number is greater");
				System.out.println("Another chance ... Enter a Valid number between 1 and 9");
				number = scanner.nextInt();
			} else {
				System.out.println("Your number is small");
				System.out.println("Another chance ... Enter a Valid number between 1 and 9");
				number = scanner.nextInt();
			}
		}
		
		if (guess == 0) {
			System.out.println("You lose the Game hard luck next time :(");
		}

	}

}
