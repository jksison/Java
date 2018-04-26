package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
	
	public static void quickSortExecutor(int[] input) {
		sort(input, 0, input.length - 1);
	}
	
	public static void sort(int[] input, int from, int to) {
		if (from < to) {
			int indexOfPivot = partition(input, from, to);
			sort(input, from, indexOfPivot - 1);
			sort(input, indexOfPivot + 1, to);
		}
	}

	public static int partition(int[] input, int from, int to) {
		int pivot = input[to];
		int wall = from;
		for (int i = from; i < to; i++) {
			if (input[i] <= pivot) {
				int temp = input[wall];
				input[wall] = input[i];
				input[i] = temp;
				wall++;
			}
		}
		input[to] = input[wall];
		input[wall] = pivot;
		
		return wall;
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {9,8,1,2,3,7,6,5,4};
		System.out.println(Arrays.toString(array));
		quickSortExecutor(array);
		System.out.println(Arrays.toString(array));
	}
	
}
