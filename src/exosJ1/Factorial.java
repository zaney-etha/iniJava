package exosJ1;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(3));
	}
	
	static int factorial(int n) {
		if(n < 0) {
			System.out.println("Error the number must be >0");
		} else if(n == 0) {
			return 1;
		} else {
			for(int i = n - 1; i > 1; i--) {
				n *= i;
			}
		}
		
		return n;
	}
}
