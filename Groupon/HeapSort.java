// Source code reference: http://quiz.geeksforgeeks.org/heap-sort/
public class HeapSort {
  public void sort(int[] arr) {
    int n = arr.length;
    
    // Build heap (rearrange array) 
    for(int i = n /2 -1; i >= 0; i--) {
      heapify(arr, n, i); 
    }
    
    // One by one extract an element from heap
    for(int i = n -1; i >= 0; i--) {
      // Move current root to end 
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp; 
      
      // call max heapify on the reduced heap 
      heapify(arr, i, 0);
    }    
  }
  
  // To heapify a subtree rooted with node i which is 
  // an index in arr[]. n is size of heap 
  void heapify(int[] arr, int n, int i) {
    int largest = i;  // Initialized largest as root
    int left = 2 * i + 1; 
    int right = 2 * (i + 1);
    
    // Find larger with from: i,left, right;
    if(left < n && arr[left] > arr[largest])
      largest = left;
    if(right < n && arr[right] > arr[largest]) 
      largest = right;
    
    // If largest is not root, swap it with the largest 
    if(largest != i) {
      int swap = arr[i];
      arr[i] = arr[largest];
      arr[largest] = swap;
      
      heapify(arr, n, largest);
    }    
  }
  

}
