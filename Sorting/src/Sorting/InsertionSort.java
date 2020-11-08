package Sorting;

public class InsertionSort {
	int[] insertionSort(int []arr) {
		int swap=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				swap++;
			}
			
			int x=i;
			while(x>0 && swap>0) {
				if(arr[x]<arr[x-1]) {
					int temp=arr[x];
					arr[x]=arr[x-1];
					arr[x-1]=temp;
				}
				x--;
			}
			swap=0;
		}
		return arr;
	}
	
}
