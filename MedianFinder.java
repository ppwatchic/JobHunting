package design;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

// 295 https://leetcode.com/problems/find-median-from-data-stream/

public class MedianFinder {
	
	private static Map<Integer, Integer> map = new TreeMap<>();
	private int count = 0;

	// Adds a number into the data structure.
    public void addNum(int num) {
        if(map.containsKey(num)) {
        	int value = map.get(num);
        	map.put(num, value + 1);
        } else map.put(num, 1);
        count++;
    }

    // Returns the median of current data stream
    public double findMedian() {
    	if(map.size() == 0)	return 0;
    	int expected = (count+1) / 2;
    	int sum = 0;
    	int median1 = 0;
    	boolean get1 = false;
    	for(Entry<Integer, Integer> e : map.entrySet()) {
    		sum += e.getValue();
    		if(sum < expected);
    		else if(sum==expected) {
    			if(count % 2 != 0)
    				return e.getKey();
    			else { 
    				median1 = e.getKey();
    				get1 = true;
    			}
    		} else {
    			if(get1 == true) {
    				return (e.getKey() + median1) / 2.0;
    			}
    			return e.getKey();
    		}
    	}
    	return 0;
    }
    
	public static void main(String[] args) {
		MedianFinder mf = new MedianFinder();
		mf.addNum(2);
		mf.addNum(3);
		mf.addNum(2);
		double d = mf.findMedian();
		System.out.println(d);
	}

}
