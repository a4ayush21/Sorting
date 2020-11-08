package Sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	void testBinarySearch() {
		BinarySearch obj=new BinarySearch();
		
		assertAll(
				()->assertTrue(3==obj.binarySearch(new int[] {4,5,1,2,3}, 4, 0, 4)),
				()->assertTrue(4==obj.binarySearch(new int[] {4,5,1,2,3}, 5, 0, 4)),
				()->assertEquals(-1,obj.binarySearch(new int [] {4,1,2,5,3}, 6, 0, 4)),
				()->assertTrue(0==obj.binarySearch(new int[] {4,5,1,2,3}, 1, 0, 4)),
				()->assertTrue(-1==obj.binarySearch(new int[] {4,5,1,2,3}, 2.5, 0, 4)),
				()->assertEquals(-1,obj.binarySearch(new int [] {4,1,2,5,3}, 0.5, 0, 4)),
				()->assertEquals(-1,obj.binarySearch(new int [] {4,1,2,5,3}, -2.4, 0, 4)),
				()->assertEquals(2,obj.binarySearch(new int [] {4,1,2,5,3}, 3, 0, 4))
				
				);
	}

}
