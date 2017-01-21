package sort;


/**
 * Source: http://quiz.geeksforgeeks.org/heap-sort/
 * Key: How to build the heap?
 * Heapify procedure can be applied to a node only if its children nodes are heapified. 
 * So the heapification must be performed in the bottom up order.
 * @author pingping
 *
 */
public class HeapSort {
	
	public void sort(int[] arr) {
		
		if(arr == null) 
			throw new NullPointerException();
		
		int len = arr.length;
		
		// Build a heap from bottom-up
		for(int i = len/2 - 1; i >= 0; i--) {
			heapify(arr, len, i);
		}
		
		// 1. Move largest element to the end 
		// 2. Shorten the size of unsorted array by one 
		// 3. heapify again 		
		for(int i = len - 1; i > 0; i--) {
			int tmp = arr[i];
			arr[i] = arr[0];
			arr[0] = tmp;
			
			// Heapify the affected subtree in the shorten array 
			heapify(arr, i, 0);			
		}	
	}
	
	// 1. Get largest element on pos-i, 
	// 2. if sub-tree is affected, heapify the subtree 
	private void heapify(int[] arr, int size, int i) {
		int largest = i; 
		int left = 2 * i + 1;
		int right = 2 * i + 2; 
		
		if(left < size && arr[left] > arr[largest]) {
			largest = left;
		}
		if(right < size && arr[right] > arr[largest]) {
			largest = right;
		}
		
		if(i != largest) {
			int tmp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = tmp; 
			
			heapify(arr, size, largest);
		}
	}

}
