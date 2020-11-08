package Sorting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("testing selection sort method")
public class SelectionSortTest {
	
	SelectionSort obj;
	
	@BeforeEach
	void beforeEach() {
		obj=new SelectionSort();
	}
	@Test
	@DisplayName("with +ve Inputs")
	void test1() {
		assertAll(
				()->assertArrayEquals(new int [] {1,2,3,4,5}, obj.selectionSort(new int[] {4,5,2,3,1})),
				()->assertArrayEquals(new int [] {1,2,3,4,5,15,45,78}, obj.selectionSort(new int[] {4,5,2,3,1,45,78,15})),
				()->assertArrayEquals(new int [] {0,5,78,140,200}, obj.selectionSort(new int[] {78,5,0,200,140})),
				()->assertArrayEquals(new int [] {1,2,3,5,6,6,6,7}, obj.selectionSort(new int[] {7,5,2,3,6,1,6,6}))
				);
	}
	
	@Test
	@DisplayName("with -ve inputs")
	void test2() {
		
		assertAll(
				()->assertArrayEquals(new int [] {-5,-4,-3,-2,-1}, obj.selectionSort(new int[] {-4,-5,-2,-3,-1})),
				()->assertArrayEquals(new int [] {-7,-6,-6,-6,-5,-3,-2,-1}, obj.selectionSort(new int[] {-7,-5,-2,-3,-6,-1,-6,-6}))
				);
	}
	@Test
	@DisplayName("with mix inputs")
	void test3() {
		
		assertAll(
				()->assertArrayEquals(new int [] {-1,2,3,4,5}, obj.selectionSort(new int[] {4,5,2,3,-1})),
				()->assertArrayEquals(new int [] {-15,-5,-3,1,2,4,45,78}, obj.selectionSort(new int[] {4,-5,2,-3,1,45,78,-15}))
				);
	}

}
