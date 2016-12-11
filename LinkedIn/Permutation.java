package depthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public List<List<Integer>> permute(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		boolean[] visited = new boolean[nums.length];
		helper(result, new ArrayList<Integer>(), visited, nums);
		return result;
	}
	
	// Depth-First Search: Using visited[] and list to manage the depth of the recursive calling
	private void helper(List<List<Integer>> result, List<Integer> list, boolean[] visited, int[] nums) {
		if(list.size() == nums.length) {
			result.add(list);
			return;
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(visited[i] == true) continue;			
			list.add(nums[i]);
			visited[i] = true;
			helper(result, new ArrayList<Integer>(list), visited, nums);
			visited[i] = false;	
			list.remove(list.size() - 1);
		}
	}

}
