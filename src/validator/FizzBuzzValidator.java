package validator;

public class FizzBuzzValidator {

	public Object validate(int validateFizzBuzz) {
		
		if (validateFizzBuzz % 15 == 0) {
			return "FizzBuzz";
		} else if (validateFizzBuzz % 5 == 0) {
			return "Buzz";
		} else if (validateFizzBuzz % 3 == 0) {
			return "Fizz";
		}
		
		return String.valueOf(validateFizzBuzz);
	}

}
