package exosJ2;

public class Sorter {

	static void bubbleSort(int[] array) {
		int Temp = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < (array.length - 1); j++) {
				if (array[j] > array[j + 1]) {
					Temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = Temp;
				}
			}
		}
	}
	
	static void selectionSort(int[] array) {
		int Temp = 0;
		
		int Smallsub = 0;
		for (int i = 0; i < array.length; i++) {
			Smallsub = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[Smallsub]) {
					Smallsub = j;
				}
			}
			Temp = array[i];
			array[i] = array[Smallsub];
			array[Smallsub] = Temp;
		}
	}
	
	static void insertionSort(int[] array) {
		int Temp = 0;
		int j;
		
		for (int i = 0; i < array.length; i++) {
			j = i;
			while (j >= 1 && array[j] < array[j - 1]) {
				Temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = Temp;
				j -= 1;				
			}
		}
	}

	static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
	}
}
