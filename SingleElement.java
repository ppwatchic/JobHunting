package Algorithms;


// requirement: in O(logn) complexity 
public class SingleElement {

	public static int singleElement(int[] arr) {
		if(arr == null || (arr.length % 2) ==0)
			throw new IllegalArgumentException("No such element or more than one");
		
		int low = 0, high = arr.length - 1;
		int mid = (low + high) / 2;
		while(mid > low) {			
			if(mid % 2 == 0)  {	// odd/even 
				if(arr[mid] == arr[mid + 1]) {
					low = mid + 1;
					mid = (low + high) / 2;
					continue;
				} else if(arr[mid] == arr[mid - 1]){
					high = mid - 1;
					mid = (low + high) / 2;
					continue;
				} else {
					return arr[mid];
				}
			} else {
				if(arr[mid] == arr[mid - 1]) {
					low = mid + 1;
					mid = (low + high) / 2;
					continue;
				} else if(arr[mid] == arr[mid + 1]) {
					high = mid - 1;
					mid = (low + high) / 2;
					continue;
				} else {
					return arr[mid];
				}
			}
		}
		
		return arr[low];			
	}
	
	public static void main(String[] args) {
		// test case 1 
		int[] arr = {1,1,3,3,4,4,6,6,7,7,8,8,9};
		int single = singleElement(arr);
		System.out.println("single element is: " + single + ", excepted 9");
		
		// test case 2 
		arr = new int[]{0,1,1,3,3,4,4,6,6,7,7,8,8};
		single = singleElement(arr);
		System.out.println("single element is: " + single + ", excepted 0");
	}

}
