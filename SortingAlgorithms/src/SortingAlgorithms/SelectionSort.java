package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
	
	public static void sort(int[] input) {
		
		int indexOfSmallest =  0;
		
		for (int i = 0; i < input.length - 1; i++) {
			indexOfSmallest = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[indexOfSmallest]) {
					indexOfSmallest = j;
				}
			}
			
			int temp = input[i];
			input[i] = input[indexOfSmallest];
			input[indexOfSmallest] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {9,8,1,2,3,7,6,5,4};
		System.out.println(Arrays.toString(array));
		sort(array);
		System.out.println(Arrays.toString(array));
	}
}
