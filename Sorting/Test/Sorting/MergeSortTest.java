package Sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

@DisplayName("Merge sort method is tested ")
public class MergeSortTest {

	@Test
	@DisplayName("with +ve Inputs")
	void test1() {
		MergeSort obj=new MergeSort();
		assertAll(
				()->assertArrayEquals(new int [] {1,2,3,4,5}, obj.mergeSort(new int[] {4,5,2,3,1})),
				()->assertArrayEquals(new int [] {1,2,3,4,5,15,45,78}, obj.mergeSort(new int[] {4,5,2,3,1,45,78,15})),
				()->assertArrayEquals(new int [] {0,5,78,140,200}, obj.mergeSort(new int[] {78,5,0,200,140})),
				()->assertArrayEquals(new int [] {1,2,3,5,6,6,6,7}, obj.mergeSort(new int[] {7,5,2,3,6,1,6,6}))
				);
	}
	
	@Test
	@DisplayName("with -ve inputs")
	void test2() {
		MergeSort obj=new MergeSort();
		assertAll(
				()->assertArrayEquals(new int [] {-5,-4,-3,-2,-1}, obj.mergeSort(new int[] {-4,-5,-2,-3,-1})),
				()->assertArrayEquals(new int [] {-7,-6,-6,-6,-5,-3,-2,-1}, obj.mergeSort(new int[] {-7,-5,-2,-3,-6,-1,-6,-6}))
				);
	}
	@Test
	@DisplayName("with mix inputs")
	void test3() {
		MergeSort obj=new MergeSort();
		assertAll(
				()->assertArrayEquals(new int [] {-1,2,3,4,5}, obj.mergeSort(new int[] {4,5,2,3,-1})),
				()->assertArrayEquals(new int [] {-15,-5,-3,1,2,4,45,78}, obj.mergeSort(new int[] {4,-5,2,-3,1,45,78,-15}))
				);
	}
}
