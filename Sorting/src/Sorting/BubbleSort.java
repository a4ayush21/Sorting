package Sorting;

public class BubbleSort {
	int [] bubbleSort(int []arr) {
		int swap=0;
		while(true) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					swap++;
				}
			}
			if(swap==0) {
				break;
			}
			swap=0;
		}
		return arr;
	}
}
