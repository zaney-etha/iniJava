package exosJ1;

public class NumberPower {
	public static void main(String[] args) {
		System.out.print(power(2.5, -3));
	}
	
	static double power(double nb, int n) {
		double p = nb;
		
		if(n < 0) {
			nb = 1;
			while(n < 0) {
				nb /= p;
				n++;
			}
			
		} else {
			while(n > 1) {
				nb *= p;
				n--;
			}
		}
		
		return nb;
	}
}
