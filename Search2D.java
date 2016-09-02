package divideAndconquer;

// https://discuss.leetcode.com/topic/20064/my-concise-o-m-n-java-solution
// https://leetcode.com/problems/search-a-2d-matrix-ii/
public class Search2D {

	// start from top right corner
	// if target > current_num, then move to next row; 
	// if target < curretn_num, then move to next column;
	// 51.81% 
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        	return false;
        }
		
		int r = 0;
		int c = matrix[0].length - 1;
		while(r < matrix.length && c >= 0) {
			if(matrix[r][c]==target)	return true;
			if(matrix[r][c] > target)
				c--;
			else r++;
		}
		return false;
    }
	
	public static void main(String[] args) {
		int[][] matrix = {{-1, 3}};
		Search2D s2d = new Search2D();
		System.out.println(s2d.searchMatrix(matrix, 1));

	}
}
