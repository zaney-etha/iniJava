package exosJ2;

public class Launcher {
	public static void main(String[] args) {
		int[] tab = {45,98,365,9,46,231};
		Sorter.displayArray(tab);

		Sorter.bubbleSort(tab);
		Sorter.displayArray(tab);
		
		Sorter.selectionSort(tab);
		Sorter.displayArray(tab);

		Sorter.insertionSort(tab);
		Sorter.displayArray(tab);
	}
	
}
