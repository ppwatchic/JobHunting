package stack;

import java.util.HashMap;
import java.util.Map;


// Create a stack with the usual push() & pop(), but with an additional function 
// getMiddle() that returns the middle element of the stack in constant time.
public class MyStack<E> {
	private Map<Integer, E> map = new HashMap<Integer, E>();
		
	public boolean push(E item) {
		int size = map.size();
		map.put(size + 1, item);
		return true;
	}
	
	public E pop() {
		int size = map.size();
		E item = map.remove(size);
		return item;		
	}
	
	// Assume 
	public E peekMiddle() {
		int size = map.size();
		E item = map.get(size / 2);
		return item;
	}
}
