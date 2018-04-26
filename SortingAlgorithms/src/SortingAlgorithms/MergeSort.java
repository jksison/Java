package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

	public static void sort(int[] input, int from, int to) {
		if (from < to) {
			int middle = (from + to) / 2;
			sort(input, from, middle);
			sort(input, middle + 1, to);
			merge(input, from, middle, to);
		}
	}
	
	public static void merge(int[] input, int from, int middle, int to) {
		int lengthLeft = middle - from + 1;
		int lengthRight = to - middle;
		
		// length + 1 for MAX_VALUE
		int[] left = new int[lengthLeft + 1];
		int[] right = new int[lengthRight + 1];
		
		for (int i = 0; i < lengthLeft; i++) {
			left[i] = input[from + i];
		}
		
		for (int i = 0; i < lengthRight; i++) {
			right[i] = input[middle + i + 1];
		}
		
		// for comparison, when checking which one is smaller
		left[lengthLeft] = Integer.MAX_VALUE;
		right[lengthRight] = Integer.MAX_VALUE;
		
		int leftPointer = 0;
		int rightPointer = 0;
		for (int i = from; i <= to; i++) {
			// check which one is smaller
			if (right[rightPointer] < left[leftPointer]) {
				input[i] = right[rightPointer];
				rightPointer++;
			} else {
				input[i] = left[leftPointer];
				leftPointer++;
			}
				
		}
		
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {9,8,1,2,3,7,6,5,4};
		System.out.println(Arrays.toString(array));
		sort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}
	
}
