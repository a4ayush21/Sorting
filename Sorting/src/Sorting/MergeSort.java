package Sorting;

public class MergeSort{
	
	int[] mergeSort(int [] arr) {
		
		if(arr.length<=1) {
			return arr;
		}
		
		int midpoint = arr.length/2;
		int left[]=new int [midpoint];
		int right[];
		if(arr.length%2==0) {
			right=new int [midpoint];
		}
		else {
			right=new int [midpoint+1];
		}
		
		for(int i=0;i<midpoint;i++) {
			left[i]=arr[i];
		}
		for(int i=0;i<right.length;i++) {
			right[i]=arr[midpoint+i];
		}
		
		left=mergeSort(left);
		right=mergeSort(right);
		int[] result=merge(left,right);
		return result;
	}

	private int[] merge(int[] left, int[] right) {
		int[] result=new int [left.length+right.length];
		int rightIndex=0;
		int leftIndex=0;
		int resultIndex=0;
		
		while(leftIndex<left.length||rightIndex<right.length) {
			if(leftIndex<left.length && rightIndex<right.length) {
				if(left[leftIndex]<=right[rightIndex]) {
					result[resultIndex]=left[leftIndex];
					leftIndex++;
					resultIndex++;
				}
				else {
					result[resultIndex]=right[rightIndex];
					resultIndex++;
					rightIndex++;
				}
			}
			else if(leftIndex<left.length) {
				result[resultIndex]=left[leftIndex];
				resultIndex++;
				leftIndex++;
			}
			else if(rightIndex<right.length) {
				result[resultIndex]=right[rightIndex];
				resultIndex++;
				rightIndex++;
			}
			
		}
		return result;
		
	}
	
	public static void main(String [] args) {
		MergeSort mergeSort=new MergeSort();
		int result[]=mergeSort.mergeSort(new int[] {4,5,1,3,2});
		for(int i:result) {
			System.out.println(i);
		}
	}
}

