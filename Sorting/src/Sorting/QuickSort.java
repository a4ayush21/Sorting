package Sorting;

public class QuickSort {

	private int partitioning(int arr[],int low , int high) {
		

		int lastElement = arr[high];
		int firstElement = arr[low];
		int midpointElement = arr[(low+high)/2];
		int i=low;
		int j=high;

		int pivot = median(firstElement, midpointElement, lastElement);
		if (pivot == midpointElement) {
			
			while (i <=j ) {
				while (arr[i] < pivot) {
					i++;
				}
				while (arr[j] > pivot) {
					j--;
				}
				if (i <= j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				}
			}
			return i-1;

		}

		else if (pivot == lastElement) {
			j=j-1;
			
			while (i <= j) {
				while (arr[i] < pivot) {
					i++;
				}
				while (arr[j] > pivot) {
					j--;
				}
				if (i <= j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				
				} 
			}
			arr[high] = arr[i];
			arr[i] = pivot;
			return i;
		}
		else {
			i=i+1;
			while (i <= j) {
				while (arr[i] < pivot) {
					i++;
				}
				while (arr[j] > pivot) {
					j--;
				}
				if (i <= j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				
				}
				
			}
			
			arr[low] = arr[j];
			arr[j] = pivot;
			return j;
		}

		
	}
	
	public int [] quickSort(int arr[], int low , int high) {
			int x=partitioning(arr,low,high);
		if(low<x-1) {
			quickSort(arr,low,x-1);
		}
		if(x<high) {
			quickSort(arr,x+1,high);
		}
		return arr;
	}

	private int median(int firstElement, int midpointElement, int lastElement) {
		// TODO Auto-generated method stub
		if ((firstElement <= midpointElement && midpointElement <= lastElement)
				|| (lastElement <= midpointElement && midpointElement <= firstElement)) {
			return midpointElement;
		} 
		else if ((firstElement <= lastElement && lastElement <= midpointElement)
				|| (midpointElement <= lastElement && lastElement <= firstElement)) {
			return lastElement;
		} 
		else {
			return firstElement;
		}
	}

	 public static void main(String args[]) {
		QuickSort obj = new QuickSort();
		int arr[] = obj.quickSort(new int[] {0,1,2,4,6,2,8},0,6);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}

