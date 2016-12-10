package binarySearch;

public class FindRange {
	
	public int[] findIndice(int[] arr, int expected) {
		if(arr==null || arr.length ==0)
			throw new NullPointerException(); 
		
		int head = 0;
		int end = arr.length - 1;
		int middle = (head + end) / 2;
		int[] res = new int[2];
		
		// First find the starting index 
		while(head < end) {
			if(arr[middle] < expected) {
				// head moves toward end 
				head = middle + 1;						
			} else {	
				// end moves toward head 
				end = middle;
			}
			// Update middle
			middle = (head + end) / 2;
		}
		
		if(arr[head] == expected) {
			res[0] = head;
			if(head == (arr.length-1)) {
				res[1] = head;
				return res;
			}
			
		} else {
			// define not found 
			res[0] = -1;
			res[1] = -1;
			return res;
		}
		
		// Find the ending index 
		end = arr.length - 1;
		middle = (head+end) / 2;
		while(head < end) {
			if(arr[middle] > expected) {
				// end moves to head 
				end = middle - 1;
			} else {
				if(head == middle) {	// be very careful for endless loop
					if(arr[end] == expected)
						head = end;
					break;
				}
				head = middle;
			}
			middle = (head+end) / 2;
		}
		res[1] = head;
		return res;
	}	
	
}
