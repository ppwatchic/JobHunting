package arrayPrac;

import java.util.Arrays;

// 329. Longest Increasing Path in a Matrix 
// take 5hs to finish 

public class IncreasingPath {
	
	private static int[][] DIR = {{0,-1},{1,0},{0,1},{-1,0}};
	
	// beats 86.51% submission
	public static int longestIncreasingPath2(int[][] matrix) {
		if(matrix == null || matrix.length == 0)
			return 0;	
		int[][] visited = new int[matrix.length][matrix[0].length];
		
		int max = 0;
		for(int i = 0; i < matrix.length; i++) {			
			for(int j = 0; j < matrix[0].length; j++) {
				int path = findPath2(matrix, i, j,visited);
				max = path > max ? path : max;
			}
		}
		return max;
	}
	
	private static int findPath2(int[][] matrix, int i, int j, int[][] visited) {
		
		//base case 
		if(visited[i][j] != 0) 
			return visited[i][j];
		
		int max = 1;			
		// Depth-First Search 
		for(int d = 0; d < DIR.length; d++) {			
			if(isLegal(i,j,d, matrix)) {	// this neighbor existed
				if(matrix[i][j]>matrix[i+DIR[d][0]][j+DIR[d][1]]) {	// constraints
					int tmp = 1 + findPath2(matrix, i+DIR[d][0], j+DIR[d][1], visited);
					max = max > tmp ? max : tmp;		
				} 					
			} 				
		}
		visited[i][j] = max;
		return max;
	}	
	
		 
	// brute-force method: use DFS directly 
	public static int longestIncreasingPath(int[][] matrix) {
		if(matrix == null || matrix.length == 0)
			return 0;		
		
		int max = 1;
		for(int i = 0; i < matrix.length; i++) {			
			for(int j = 0; j < matrix[0].length; j++) {
				int path = findPath(matrix, i, j, 1);
				max = path > max ? path : max;
			}
		}
		return max;
	}
	
	private static int findPath(int[][] matrix, int i, int j, int m) {
		
		int max = m;		
		
		// Depth-First Search 
		for(int d = 0; d < DIR.length; d++) {			
			if(isLegal(i,j,d, matrix) && matrix[i][j]>matrix[i+DIR[d][0]][j+DIR[d][1]]) {				
				int tmp = findPath(matrix, i+DIR[d][0], j+DIR[d][1],  m + 1);
				max = max > tmp ? max : tmp;
			}
		}
		
		return max;
	}
	

	private static boolean isLegal(int i, int j, int d, int[][] matrix) {
		if((i+DIR[d][0])>=0 && (j+DIR[d][1])>=0 && (i+DIR[d][0])<matrix.length && (j+DIR[d][1])<matrix[0].length) return true;
		else return false;		
	}

	public static void main(String[] args) {
		//{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
		// {{1,3,1},{2,8,6},{3,4,5}};
		// {{7, 8, 9},{9, 7, 6},{7, 2, 3}};
		// 
		int[][] matrix = {{1,3,1},{2,8,6},{3,4,5}};
		int path = longestIncreasingPath(matrix);
		System.out.println(path);
		
		path = longestIncreasingPath2(matrix);
		System.out.println(path);

	}

}
