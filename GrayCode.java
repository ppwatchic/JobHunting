package backtracking;

import java.util.ArrayList;
import java.util.List;


/**
 * Source: https://leetcode.com/problems/gray-code/
 * @author pingping
 *
 */
public class GrayCode {
	
	public List<Integer> grayCode(int n) {
		if(n < 0)
			throw new IllegalArgumentException();
		List<Integer> list = new ArrayList<>();
		list.add(0);
		
		for(int i = 0; i < n; i++) {
			int res = 1 << i;
			for(int j = list.size(); j >= 0; j--) {
				list.add(list.get(j-1) + res);
			}
		}
		return list;
	}
}
