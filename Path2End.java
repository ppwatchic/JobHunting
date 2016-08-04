package Algorithms;

import java.util.HashMap;
import java.util.Map;


// Source : http://www.geeksforgeeks.org/count-possible-paths-top-left-bottom-right-nxm-matrix/ 

public class Path2End {

	// brute-force 
	public static int path2End(int row, int column) {
		if(row==0 || column == 0)
			return 0;
		if(row==1 || column==1)
			return 1;
		
		return path2EndHelper(row - 1, column - 1, 0, 1) + path2EndHelper(row - 1, column - 1, 1, 0);
	}
	
	private static int path2EndHelper(int row, int column, int r, int c) {
		if(r==row || c==column)
			return 1;
		return path2EndHelper(row, column, r + 1, c) + path2EndHelper(row, column, r, c + 1);	
	}	
	
	/** 
	 * 
	 * @param row length of row, 1 based.
	 * @param column length of column, 1 based.
	 * @return 
	 */
	public static int path2EndDP(int row, int column) {
		int r = row > column ? row : column;
		int c = row < column ? row : column;
		
		if(c == 1)
			return 1;
		if(c == 2)
			return row;
		if(c == 3)
			return (row + 1) * row / 2;
		
		int pathCount = 0;
		pathCount += 1 + (c - 1) + (c - 1) * c / 2;
		for(int i = 4; i <= r; i++)
			pathCount += pathHelper(i, c - 1);
		return pathCount;
	}
	
	private static int pathHelper(int x1, int x2) {
		int longEdge = x1 > x2 ? x1 : x2;
		int shortEdge = x1 < x2 ? x1 : x2;	
		
		if(shortEdge == 3)
			return (1 + longEdge) * longEdge / 2;
		
		int pathCount = 1 + (shortEdge - 1) + (shortEdge - 1) * shortEdge / 2;
		Retangule ret = new Retangule(longEdge, shortEdge);
		if(map.containsKey(ret)) {
			return map.get(ret);
		} else {
			for(int i = 4; i <= longEdge; i++) {
				pathCount += pathHelper(i, shortEdge - 1);
			}
			map.put(ret, pathCount);
			return pathCount;
		}		
	}
	
	static Map<Retangule, Integer> map = new HashMap<Retangule, Integer>();
	
	static class Retangule {
		int longSide, shortSide;
		Retangule(int l, int s) {
			longSide = l;
			shortSide = s;
		}
	}	
	
	public static void main(String[] args) {
		int pathCount = path2End(2,2);
		System.out.println(pathCount + " , expected 2");
		System.out.println();	
		
		/*
		pathCount = path2End(3,2);
		System.out.println(pathCount + " , expected 3");
		System.out.println();	
		
		pathCount = path2End(2,3);
		System.out.println(pathCount + " , expected 3");
		System.out.println();	
		
		pathCount = path2End(3,3);
		System.out.println(pathCount + " , expected 6");
		System.out.println();
		
		
		pathCount = path2End(1,4);
		System.out.println(pathCount + " , expected 1");
		System.out.println();
		
		pathCount = path2End(4,1);
		System.out.println(pathCount + " , expected 1");
		System.out.println();
		
		pathCount = path2End(0,4);
		System.out.println(pathCount + " , expected 0");
		System.out.println();		
		*/
		
		long tim;
		
		tim = System.nanoTime();
		pathCount = path2EndDP(100,6);
		tim = System.nanoTime() - tim;
		System.out.println(pathCount + " , time consume is: " + tim);
		
		
		tim = System.nanoTime();
		pathCount = path2End(100,6);
		tim = System.nanoTime() - tim;
		System.out.println(pathCount + " , time consume is: " + tim);
		//System.out.println();
	}

}
