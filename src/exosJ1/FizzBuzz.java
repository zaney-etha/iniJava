package exosJ1;

public class FizzBuzz {
	public static void main(String[] args) {
		for (int var = 1; var <= 100; var++) {
			boolean fizzOrBuzz = false;

			if (var % 3 == 0) {
				System.out.print("Fizz ");
				fizzOrBuzz = true;

			}

			if (var % 5 == 0) {
				System.out.print("Buzz ");
				fizzOrBuzz = true;

			}

			if (fizzOrBuzz == false) {
				System.out.print(String.valueOf(var + " "));
				
			}
			
			if (var%10 == 9) {
				System.out.print("\n");
				
			}

		}

	}

}
