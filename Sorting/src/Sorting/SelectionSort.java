package Sorting;

public class SelectionSort {
	int[] selectionSort(int arr[]) {
		int smallest;
		int index;
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			smallest=arr[i];
			index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<smallest) {
					smallest=arr[j];
					index=j;
					count++;
				}
			}
			if(count>0) {
				arr[index]=arr[i];
				arr[i]=smallest;
			}
			count=0;
			
		}
		return arr;
	}
}
