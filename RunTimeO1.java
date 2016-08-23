package design;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import static design.CustomPrint.*;


// 380. Insert Delete GetRandom O(1) 

public class RunTimeO1 {

	private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	private final Integer DUMMY = 0;
	private boolean touched = true;
	private Integer[] arr;
	private Random r = new Random();
	
	public RunTimeO1(){
	}

	public int insert(int val) {
		if(map.containsKey(val));
		else {
			map.put(val, DUMMY);
			touched = true;
		}
		return val;
	}
	
	public boolean remove(int val) {
		if(map.containsKey(val)){
			map.remove(val);
			touched = true;
			return true;
		}
		return false;
	}
	
	public int getRandom() {
		if(touched==true) {
			Set<Integer> set = map.keySet();
			arr = set.toArray(new Integer[set.size()]);
			touched = false;
		}
		
		int next = r.nextInt(arr.length);
		return arr[next];
	}	
	
	public static void main(String[] args) {
		RunTimeO1 rt1 = new RunTimeO1();
		rt1.remove(0);
		rt1.remove(0);		
		rt1.insert(0);		
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < 1; i++) {
			int v = rt1.getRandom();
			if(map.containsKey(v)){
				int freq = map.get(v);
				map.put(v, freq + 1);
			}
			else 
				map.put(v, 1);
		}
		
		for(Map.Entry<Integer, Integer> e: map.entrySet())
			println(e.getKey() + " " + e.getValue());
	}
}
