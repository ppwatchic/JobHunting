package binarySearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindRangeTest {
	FindRange fr = new FindRange();	
	
	/*****************Below for normal input******************/
	@Test
	public void testFindIndice_SameIndice() {
		int[] arr = {1};
		int expected = 1;
		
		int[] actual = fr.findIndice(arr, expected);
		int[] exp = {0,0};
		assertArrayEquals(exp, actual);
	}
	
	@Test
	public void testFindIndice_SameIndiceII() {
		int[] arr = {1,2};
		int expected = 2;
		
		int[] actual = fr.findIndice(arr, expected);
		int[] exp = {1,1};
		assertArrayEquals(exp, actual);
	}
	
	@Test
	public void testFindIndice_SameIndiceIII() {
		int[] arr = {1,2};
		int expected = 1;
		
		int[] actual = fr.findIndice(arr, expected);
		int[] exp = {0,0};
		assertArrayEquals(exp, actual);
	}
	
	@Test
	public void testFindIndice_NotFoundBecauseSoSmall() {
		int[] arr = {1,2};
		int expected = 0;
		
		int[] actual = fr.findIndice(arr, expected);
		int[] exp = {-1,-1};
		assertArrayEquals(exp, actual);
	}
	
	@Test
	public void testFindIndice_NotFoundBecauseSoLarge() {
		int[] arr = {1,2,3,4,5,6,7,8};
		int expected = 9;
		
		int[] actual = fr.findIndice(arr, expected);
		int[] exp = {-1,-1};
		assertArrayEquals(exp, actual);
	}
	
	@Test
	public void testFindIndice_StartTillEnd() {
		int[] arr = {2,2,2,2,2,2,2};
		int expected = 2;
		
		int[] actual = fr.findIndice(arr, expected);
		int[] exp = {0,6};
		assertArrayEquals(exp, actual);
	}
	
	@Test
	public void testFindIndice_InTheMiddle() {
		int[] arr = {0,1,2,3,4,5,6};
		int expected = 3;
		
		int[] actual = fr.findIndice(arr, expected);
		int[] exp = {3,3};
		assertArrayEquals(exp, actual);
	}
	
	@Test
	public void testFindIndice_TillEnd() {
		int[] arr = {0,1,2,3,3};
		int expected = 3;
		
		int[] actual = fr.findIndice(arr, expected);
		int[] exp = {3,4};
		assertArrayEquals(exp, actual);
	}
	
	
	/****************Below for abnormal input ********************/
	@Test(expected = NullPointerException.class)
	public void testFindIndice_NullInput() {
		int[] arr = null;
		int expected = 1;
		
		fr.findIndice(arr, expected);		
	}
	
	@Test(expected = NullPointerException.class)
	public void testFindIndice_EmptyInput() {
		int[] arr = new int[2];
		int expected = 1;
		
		fr.findIndice(arr, expected);		
	}
}
