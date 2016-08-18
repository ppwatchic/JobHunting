package design;

import java.util.Stack;

public class MinStack<E> implements Comparable<E> {
	
	private Stack<E> s, minS;
	
	MinStack() {
		s = new Stack<E>();
		minS = new Stack<E>();
	}
	
	public synchronized void push(E e) {
		s.push(e);
		if(!minS.isEmpty() && ((Comparable<E>) minS.peek()).compareTo(e) < 0) return;	
		minS.push(e);
	}
	
	public synchronized E pop(){
		E p = s.pop();
		if(p.equals(minS.peek())) minS.pop();
		return p;
	}
	
	public synchronized E top() {
		return s.peek();
	}
	
	public synchronized E getMin() {
		return minS.peek();
	}
	
	@Override
	public int compareTo(E arg0) {
		return this.compareTo(arg0);
	}

	public static void main(String[] args) {
		MinStack<Integer> minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());  // -3
		minStack.pop();
		minStack.top();     
		System.out.println(minStack.getMin());  // -2
		
		
		MinStack<String> min = new MinStack();
		min.push("Hello");
		min.push("Chicago");
		min.push("Apple");
		System.out.println(min.getMin());  // -3
	}

	
}
