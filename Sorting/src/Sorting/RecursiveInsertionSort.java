package Sorting;


public class RecursiveInsertionSort {
	
	public static int[] recursiveInsertionSort(int [] arr,int n) {
		
		int count=0;
	
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				count++;
			}
			if(count>0 && i>0) {
				recursiveInsertionSort(arr, i+1);
			}
			count=0;	
		}
		return arr;
	}
	public static void main(String args[]) {
		int [] arr=recursiveInsertionSort(new int[] {4,5,1,2,3},5);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
}

