package adventure;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Item {
	String name;
	Template template;	
	
	private Item(String name, Template template) {
		this.name = name;
		this.template = template;
	}
}

class Template {
	String pageNum;
	Template(String pageNum) {
		this.pageNum = pageNum;
	}
}

public class LRUCache <K, V> extends LinkedHashMap <K, V> {
	// the head entry in LinkedHashMap always 
	
	private int capacity; 	// maximum number of items in the cache
	
	public LRUCache(int capacity) {
		// if we passed false, then it will keep insertion-order 
		super(capacity+1, 1.0f, true);	// pass 'true' for accessOrder
		this.capacity = capacity;
	}
	
	// use synchronized to apply concurrency
	public synchronized V put(K key, V value) {
		return super.put(key, value);
	}
	
	public synchronized V get(Object key) {
		return super.get(key);
	}
	
	// called by addEntry() method to decide whether to remove the eldest 
	protected boolean removeEldestEntry(Entry entry) {
		return (size() > this.capacity);
	}
	
	public static void main(String[] args) {
		LRUCache<String, Template> cache = new LRUCache<String, Template>(10);
		
		// test case 1: cache limit is 10; we add 15 records inside; expected the last 10 to be printed out
		for(int i = 0; i < 15; i++)  {
			Item item = new Item("file" + i, new Template("page" + i));
			cache.put(item.name, item.template);
		}				
		// traverse the cache 
		for(Entry entry : cache.entrySet()) {
			System.out.println(entry.getKey() + " " + ((Template)entry.getValue()).pageNum);
		}	
		
		System.out.println();
		
		// test case 2: added existing Item inside; expected order change 
		for(int i = 15; i > 10; i--)  {
			Item item = new Item("file" + i, new Template("page" + i));
			cache.put(item.name, item.template);
		}	
		// traverse the cache 
		for(Entry entry : cache.entrySet()) {
			System.out.println(entry.getKey() + " " + ((Template)entry.getValue()).pageNum);
		}		
	}	
}
