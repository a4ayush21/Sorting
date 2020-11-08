package Sorting;

public class LinearSearch {
	public int linearSearch(int[] arr, int key) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			if (arr[i] == key) {
				System.out.println("the no. of times this loop executed : " + count);
				return i;
			}
		}
		System.out.println("the no. of times this loop executed : " + count);
		return -1;
	}

	public static void main(String args[]) {
		LinearSearch obj = new LinearSearch();
		int index = obj.linearSearch(new int[] { 4, 2, 5, 6, 4, 8 }, 7);
		System.out.println(index);
	}
}
