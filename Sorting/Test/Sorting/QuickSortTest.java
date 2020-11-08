package Sorting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("testing quickSort method")
class QuickSortTest {
	static QuickSort obj;
	
	
	@BeforeAll
	static void beforeAll() {
		obj=new QuickSort();
	}
	
	
	@Test
	@DisplayName("with +ve Inputs")
	void test1() {
		
		assertAll(
				()->assertArrayEquals(new int [] {1,2,3,4,5}, obj.quickSort(new int[] {4,5,2,3,1},0,4)),
				()->assertArrayEquals(new int [] {1,2,3,4,5}, obj.quickSort(new int[] {5,4,3,2,1},0,4)),
				()->assertArrayEquals(new int [] {1,2,3,4,5,15,45,78}, obj.quickSort(new int[] {4,5,2,3,1,45,78,15},0,7)),
				()->assertArrayEquals(new int [] {0,5,78,140,200}, obj.quickSort(new int[] {78,5,0,200,140},0,4)),
				()->assertArrayEquals(new int [] {1,2,3,5,6,6,6,7}, obj.quickSort(new int[] {7,5,2,3,6,1,6,6},0,7)),
				()->assertArrayEquals(new int [] {4,7,9,11,12,13,15,16,18}, obj.quickSort(new int[] {15,9,7,13,12,16,4,18,11},0,8))
				);
	}
	
	@Test
	@DisplayName("with -ve inputs")
	void test2() {
		assertAll(
				()->assertArrayEquals(new int [] {-5,-4,-3,-2,-1}, obj.quickSort(new int[] {-4,-5,-2,-3,-1},0,4)),
				()->assertArrayEquals(new int [] {-7,-6,-6,-6,-5,-3,-2,-1}, obj.quickSort(new int[] {-7,-5,-2,-3,-6,-1,-6,-6},0,7))
				);
	}
	@Test
	@DisplayName("with mix inputs")
	void test3() {
		
		assertAll(
				()->assertArrayEquals(new int [] {-1,2,3,4,5}, obj.quickSort(new int[] {4,5,2,3,-1},0,4)),
				()->assertArrayEquals(new int [] {-15,-5,-3,1,2,4,45,78}, obj.quickSort(new int[] {4,-5,2,-3,1,45,78,-15},0,7))
				);
	}

}
