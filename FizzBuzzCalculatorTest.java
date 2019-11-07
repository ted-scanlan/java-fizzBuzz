package FizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzCalculatorTest {

	@Test
	public void FizzBuzzCalculatorTest() {
		
		FizzBuzzCalculator fizzBuzz = new FizzBuzzCalculator();
		Object fizzResult =  fizzBuzz.calculate(3);
		assertEquals("Fizz", fizzResult);
		
		Object fizzResult2 =  fizzBuzz.calculate(6);
		assertEquals("Fizz", fizzResult2);
		
		
		
		
		
		Object buzzResult =  fizzBuzz.calculate(5);
		assertEquals("Buzz", buzzResult);
		
		Object buzzResult2 =  fizzBuzz.calculate(10);
		assertEquals("Buzz", buzzResult2);
		
		Object buzzResult3 =  fizzBuzz.calculate(7);
		assertEquals(7, buzzResult3); 
		
		Object fizzBuzzResult1 =  fizzBuzz.calculate(15);
		assertEquals("FizzBuzz", fizzBuzzResult1); 
		
		
		
	}

}
