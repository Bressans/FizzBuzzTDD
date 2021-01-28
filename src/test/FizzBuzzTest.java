package test;

import org.junit.Assert;
import org.junit.Test;

import validator.FizzBuzzValidator;

public class FizzBuzzTest {
	
	@Test
	public void validateNumber() {
		
		FizzBuzzValidator fizzBuzz = new FizzBuzzValidator();
		
		Assert.assertEquals("1", fizzBuzz.validate(1));
		Assert.assertEquals("2", fizzBuzz.validate(2));
		
	}
	
	@Test
	public void validateDivisibleByThree() {
		
		FizzBuzzValidator fizzBuzz = new FizzBuzzValidator();
		
		Assert.assertEquals("Fizz", fizzBuzz.validate(3));
		
	}
	
	@Test
	public void validateDivisibleByFive() {
		
		FizzBuzzValidator fizzBuzz = new FizzBuzzValidator();
		
		Assert.assertEquals("Buzz", fizzBuzz.validate(5));
		
	}
	
	@Test
	public void validateDivisibleByThreeAndFive() {
		
		FizzBuzzValidator fizzBuzz = new FizzBuzzValidator();
		
		Assert.assertEquals("FizzBuzz", fizzBuzz.validate(15));
		
	}

}
