package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
	
	public static void sort(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j + 1 < input.length - i; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
					
					swapped = true;
				}
			}
			
			if (!swapped) {
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {9,8,1,2,3,7,6,5,4};
		System.out.println(Arrays.toString(array));
		sort(array);
		System.out.println(Arrays.toString(array));
	}
}
