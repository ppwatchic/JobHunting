package Algorithms;

import java.util.Stack;

// http://www.geeksforgeeks.org/the-stock-span-problem/
public class StockSpan {
	// 955am -- 
	
	public static int[] spanValue(int[] a){
		// corner case 
		if(a == null || a.length == 0)
			return null;
		
		int[] res = new int[a.length];
		Stack<Integer> stackIndex = new Stack<Integer>();		 	
		
		for(int i = 0; i < a.length; i++) {
			if(stackIndex.isEmpty() || a[i] < a[stackIndex.peek()]){
				res[i] = 1;
				stackIndex.push(i);
			} else if(a[i] == a[stackIndex.peek()]) {
				res[i] = i - stackIndex.peek() + 1;
			} else {
				while((!stackIndex.isEmpty()) && (a[i] > a[stackIndex.peek()]))
					stackIndex.pop();
				if(stackIndex.isEmpty()) {
					res[i] = i + 1;
					stackIndex.push(i);
				} else if(a[i] == a[stackIndex.peek()]){
					res[i] = i - stackIndex.peek() + 1;					
				} else {
					res[i] = i - stackIndex.peek() + 1;	
					stackIndex.push(i);
				}
			}
		}
		
		
		
		return res;		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test case 1: have same element in the array [60 50 60] && [60 70 60]
		int[] a = {60, 70, 60};
		int[] b = spanValue(a);
		for(int i:b){
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("Excepted: 1 2 1");
		System.out.println("------Next Test Case------");
		
		// test case 2: ascending direction 
		a = new int[]{10,20,30,40,50,60,70};
		b = spanValue(a);
		for(int i:b){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Excepted: 1 2 3 4 5 6 7");
		System.out.println("------Next Test Case------");
		
		// test case 3: descending direction 
		a = new int[]{70,60,50,40,30};
		b = spanValue(a);
		for(int i:b){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Excepted: 1 1 1 1 1");
		System.out.println("------Next Test Case------");
		a = new int[]{60, 70, 60, 60};
		b = spanValue(a);
		for(int i:b){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Excepted: 1 2 1 2");
		
	}
}



