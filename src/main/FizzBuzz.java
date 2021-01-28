package main;

import validator.FizzBuzzValidator;

public class FizzBuzz {
	
	public static void main(String[] args) {
		fizzBuzz(1, 100);
	}

	private static void fizzBuzz(int i, int j) {
		
		FizzBuzzValidator fizzBuzzValidator = new FizzBuzzValidator();
		
		while (i <= j) {
			System.out.println(fizzBuzzValidator.validate(i));
			i++;
		}
		
	}

}
