package Sorting;

import java.util.Arrays;

public class BinarySearch {
	public int binarySearch(int[] arr, double key, int low, int high) {
		 Arrays.sort(arr);
		int midpoint = (low+high)/ 2;
		int middleElement = arr[midpoint];

		if (key == middleElement) {
			return midpoint;
		} else if (key > middleElement && midpoint < high) {
			return binarySearch(arr, key, midpoint + 1, high);
		} else if (key < middleElement && midpoint > low) {
			return binarySearch(arr, key, low, midpoint - 1);
		}
		return -1;
	}

	public static void main(String args[]) {
		BinarySearch obj = new BinarySearch();
		int index = obj.binarySearch(new int[] { 4,2,1,5,3 },2.5 , 0, 4);
		System.out.println(index);
	}
}
