package Algorithms;

import java.util.Arrays;
import java.util.Stack;


// http://www.geeksforgeeks.org/next-greater-element/
public class NextGreaterElement {
	
	public static int[] nextGreater(int[] a) {
		if(a==null || a.length == 0)
			throw new NullPointerException();
				
		if(a.length == 1)
			return new int[]{-1};
		
		int[] res = new int[a.length];
		Arrays.fill(res, -1);
		Stack<Integer> stackIndex = new Stack<Integer>();		
		for(int i = 0; i < a.length; i++){
			if(stackIndex.isEmpty() || a[i] < a[stackIndex.peek()])
				stackIndex.push(i);
			else{
				while((!stackIndex.isEmpty()) && (a[i] > a[stackIndex.peek()]) ) {
					int topIndex = stackIndex.pop();
					res[topIndex] = a[i];
				}
				stackIndex.push(i);
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		// test case 1: one element 
		int[] a = {2};
		int[] b = nextGreater(a);
		for(int i: b)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("expected: -1");
		System.out.println();
		System.out.println("Next test case.");
		
		// test case 2: ascending mode 
		a = new int[]{2,3,4};
		b = nextGreater(a);
		for(int i: b)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("expected: 3 4 -1");
		System.out.println();
		System.out.println("Next test case.");
		
		// test case 3: desc mode 
		a = new int[]{4,3,2};
		b = nextGreater(a);
		for(int i: b)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("expected: -1 -1 -1");
		System.out.println();
		System.out.println("Next test case.");
		
		// test case 4: mix order 
		a = new int[]{4,3,2,2,3,4,2,4};
		b = nextGreater(a);
		for(int i: b)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("expected: -1 4 3 3 4 -1 4 -1");
		
		
	}

}
