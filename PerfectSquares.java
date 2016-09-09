public class PerfectSquare {
	
	private static Map<Integer, Integer> map = new HashMap<>();
	public static int numSquaresII(int n) {
		if(map.containsKey(n))
			return map.get(n);
		
		if(n == 0)	return 0;
		int largest = (int) Math.floor(Math.sqrt(n));
		int ans = n;
		for(int i = largest; i >= 1; i--) {
			ans = Math.min(ans, 1 + numSquaresII(n - i * i));
		}
		map.put(n, ans);
		return ans;
	}
}
