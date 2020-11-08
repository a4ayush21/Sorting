package Sorting;

public class StringSorting {

	String[] stringBubbleSorting(String[] arr) {
		while (true) {
			int swap = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					String temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swap++;
				}
			}
			if (swap == 0) {
				break;
			}
		}
		return arr;
	}

	public String[] stringSelectionSorting(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			String smallest = arr[i];
			int swap = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(smallest) < 0) {
					smallest = arr[j];
					index = j;
					swap++;
				}
			}
			if (swap > 0) {
				arr[index] = arr[i];
				arr[i] = smallest;
			}
			swap = 0;
		}
		return arr;

	}

	public String[] stringInsertionSorting(String arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int swap = 0;
			if (arr[i].compareTo(arr[i + 1]) > 0) {
				String temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				swap++;
			}
			int x = i;
			while (swap == 1 && x != 0) {
				if (arr[x].compareTo(arr[x - 1]) < 0) {
					String temp = arr[x];
					arr[x] = arr[x - 1];
					arr[x - 1] = temp;
				}
				x--;
			}
		}
		return arr;
	}

	public String[] mergeSort(String[] arr) {
		if (arr.length <= 1) {
			return arr;
		}
		int midpoint = arr.length / 2;
		String left[] = new String[midpoint];
		String right[];

		if (arr.length % 2 == 0) {
			right = new String[midpoint];
		} else {
			right = new String[midpoint + 1];
		}

		for (int i = 0; i < midpoint; i++) {
			left[i] = arr[i];
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = arr[i + midpoint];
		}

		left = mergeSort(left);
		right = mergeSort(right);
		String result[] = merge(left, right);
		return result;
	}

	private String[] merge(String[] left, String[] right) {
		String result[] = new String[left.length + right.length];
		int resultIndex = 0;
		int leftIndex = 0;
		int rightIndex = 0;

		while (leftIndex < left.length || rightIndex < right.length) {
			if (leftIndex < left.length && rightIndex < right.length) {
				if (left[leftIndex].compareTo(right[rightIndex]) <= 0) {
					result[resultIndex] = left[leftIndex];
					leftIndex++;
					resultIndex++;
				} else {
					result[resultIndex] = right[rightIndex];
					rightIndex++;
					resultIndex++;
				}
			} else if (leftIndex < left.length) {
				result[resultIndex] = left[leftIndex];
				leftIndex++;
				resultIndex++;
			} else if (rightIndex < right.length) {
				result[resultIndex] = right[rightIndex];
				rightIndex++;
				resultIndex++;
			}
		}
		return result;
	}

	private int partition(String[] arr, int low, int high) {
		String lastElement = arr[high];
		String firstElement = arr[low];
		String middleElement = arr[(high + low) / 2];
		String pivot = median(firstElement, middleElement, lastElement);
		int i=low;
		int j=high;
		
		if(pivot==middleElement) {
			while(i<=j) {
				while(arr[i].compareTo(pivot)<0) {
					i++;
				}
				while(arr[j].compareTo(pivot)>0) {
					j--;
				}
				if(i<=j) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					i++;
					j--;
				}
			}
			return i-1;
		}
		else if(pivot==lastElement) {
			j=j-1;
			while(i<=j) {
				while(arr[i].compareTo(pivot)<0) {
					i++;
				}
				while(arr[j].compareTo(pivot)>0) {
					j--;
				}
				if(i<=j) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					i++;
					j--;
				}
			}
			arr[high]=arr[i];
			arr[i]=pivot;
			return i;
		}
		else {
			i=i+1;
			while(i<=j) {
				while(arr[i].compareTo(pivot)<0) {
					i++;
				}
				while(arr[j].compareTo(pivot)>0) {
					j--;
				}
				if(i<=j) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					i++;
					j--;
				}
			}
			arr[low]=arr[j];
			arr[j]=pivot;
			return j;
		}
	}
	
	public String[] quickSort(String[] arr,int low, int high) {
		int x=partition(arr,low,high);
		
		if(low<x-1) {
			quickSort(arr,low,x-1);
		}
		if(x<high) {
			quickSort(arr,x+1,high);
		}
		return arr;
	}

	private String median(String firstElement, String middleElement, String lastElement) {
		if (firstElement.compareTo(middleElement) <= 0 && middleElement.compareTo(lastElement) <= 0
				|| lastElement.compareTo(middleElement) <= 0 && middleElement.compareTo(firstElement) <= 0) {
			return middleElement;
		} 
		else if (firstElement.compareTo(lastElement) <= 0 && lastElement.compareTo(middleElement) <= 0
				|| middleElement.compareTo(lastElement) <= 0 && lastElement.compareTo(firstElement) <= 0) {
				return lastElement;
		}
		else {
			return firstElement;
		}
	}

	
}
