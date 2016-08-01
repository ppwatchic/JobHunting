// sources: http://www.geeksforgeeks.org/minimum-positive-points-to-reach-destination/ 

package Algorithms;

public class MinInitialPoints {

	public static int minInitialPoints(int[][] points) {
		if(points == null)
			throw new NullPointerException();
		
		return mini(min(points, 0, 1, points[0][0], points[0][0]), min(points, 1, 0, points[0][0], points[0][0]));
	}
	
	private static int mini(int a1, int a2) {
		return a1 < a2 ? a1 : a2;
	}
	
	private static int min(int[][] points, int r, int c, int minValue, int sum) {	
		sum = sum + points[r][c];
		minValue = minValue < sum ? minValue : sum;
		
		if((r== points.length - 1) && (c == points[0].length - 1))  {
			return 1 - minValue;
		}
		else {				
				if(r == (points.length - 1))
					return min(points, r, c + 1, minValue, sum);
				else if(c == (points[0].length - 1)) 
					return min(points, r + 1, c, minValue, sum);
				else 
					return mini(min(points, r, c + 1, minValue, sum), 
							min(points, r + 1, c, minValue, sum));
			}		
	}
	
	public static void main(String[] args) {
		int[][] points = {{-2, -3, 3},{-5, -10, 3},{10, 30, -5}};
		System.out.println(minInitialPoints(points));
	}

}
