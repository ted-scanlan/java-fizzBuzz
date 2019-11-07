package FizzBuzz;

public class FizzBuzzCalculator {
	
	public static void main(String[] args) {
		
calculate(150);
		   
	
	}
	
	public static Object calculate(int number) {
		
		for(int i = 0; i <= number; i++) {
		
		if((i % 3 == 0) && (i % 5== 0)) {
			System.out.println("FizzBuzz");
//			return "FizzBuzz";
		}
		else if(i % 3 == 0) {
			System.out.println("Fizz");
//			return "Fizz";
		}
		else if(i % 5 == 0) {
			System.out.println("Buzz");
//			return "Buzz";
			
		}
		else {
			System.out.println(i);
//			return "";  
			
		}
	}
		return number;
	
	

}
	
} 
