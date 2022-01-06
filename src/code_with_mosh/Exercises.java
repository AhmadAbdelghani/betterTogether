package code_with_mosh;

import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter a number:");
		String input  = scan.next();
		int number = Integer.parseInt(input);
		
		if (number%3==0 && number%5==0) {
			System.out.println("FizzBuzz");
		}else if (number%3==0) {
			System.out.println("buzz");
		}else if (number%5==0) {
			System.out.println("fizz");
		}else {
			System.out.println(number);
		}
		scan.close();
		
		
		
		
		
		
		
		
		
		

	}

}
