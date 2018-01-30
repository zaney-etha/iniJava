package exosJ1;

public class BoucleFor {
	public static void main(String[] args) {
		System.out.print("Voici une ligne de taille 10 :\n");
		line(10);
		System.out.print("Voici un carré de taille 10 :\n");
		square(10);
		System.out.print("Voici un carré vide de taille 10 :\n");
		emptySquare(10);
		System.out.print("Voici un traingle de taille 10 :\n");
		triangle(10);
		
	}
	
	static void line(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print("* ");
		}
		System.out.print("\n");
	}
	
	static void emptyLine(int n) {
		for(int j = 0; j < n; j++) {
			if(j == 0 || j == (n - 1)) {
				System.out.print("* ");				
			} else {
				System.out.print("  ");				
			}						
		}
		System.out.print("\n");		
	}	
	
	static void emptySquare(int n) {
		for(int i = 0; i < n; i++) {
			if(i == 0 || i == (n - 1)) {
				line(n);
				
			} else {
				emptyLine(n);				
			}			
		}
	}
	
	static void square(int n) {
		for(int i = 0; i < n; i++) {
			line(n);
		}
	}
	
	static void triangle(int n) {
		for(int i = 0; i < n; i++) {
			line(i+1);
		}
	}
}
