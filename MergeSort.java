public class MergedTwoSort {

	public void sort(int[] arr1, int[] arr2) {
		int minIndex = 0;
		int maxIndex = arr2.length - 1;
				
		while(minIndex<arr1.length && maxIndex>=0) {
			//compare arr1[minIndex] with arr2[0]
			while(arr1[minIndex] < arr2[0] && minIndex<arr1.length)
				minIndex++;
			if(minIndex==arr1.length)
				return;
			//compare arr2[maxIndex] with arr1[arr1.length-1]
			while(arr2[maxIndex] > arr1[arr1.length - 1] && maxIndex>=0)
				maxIndex--;
			
			// arr1: right shift ; arr2: left shift
			int rv = shift(arr1, minIndex, true);
			int lv = shift(arr2, maxIndex, false);	
			
			arr2[maxIndex] = rv;
			arr1[minIndex] = lv;
			maxIndex--;
			minIndex++;
		}
	}
	
	private int shift(int[] arr, int pos, boolean dir) {
		int value;
		
		if(dir) {// left shift 
			value = arr[arr.length - 1];
			for(int i = arr.length - 1; i > pos; i--)
				arr[i] = arr[i - 1];
		} else {
			value = arr[0];
			for(int i = 1; i <= pos; i ++)
				arr[i - 1] = arr[i];
		}
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergedTwoSort mts = new MergedTwoSort();
		int[] arr1 = {1,5,9,10,15,20};
		int[] arr2 = {2,3,8,13,14};
		mts.sort(arr1,arr2);
		for(int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + " ");
		System.out.println("");
		for(int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		
	}
}
