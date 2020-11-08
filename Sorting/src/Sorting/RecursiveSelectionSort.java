package Sorting;

public class RecursiveSelectionSort {
	int[] selectionSort(int arr[], int low) {
		int smallest=arr[low];
		int index=low;
		int count=0;
		for(int i=low+1;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
				index=i;
				count++;
			}
		}
		if(count>0) {
			arr[index]=arr[low];
			arr[low]=smallest;
		}
		if(low<arr.length-2) {
			selectionSort(arr,low+1);
		}
		return arr;
	}
}
