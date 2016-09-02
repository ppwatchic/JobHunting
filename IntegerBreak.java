package dynamicProgram;

// 343:  https://leetcode.com/problems/integer-break/ 
public class IntegerBreak {

	public int integerBreak(int n) {
		if(n == 2)	return 1;
        if(n == 3)  return 2;
        if(n % 3 == 0)  return (int)Math.pow(3, n / 3);
        if(n % 3 == 1)  return (int)(4 * Math.pow(3, (n - 4) / 3));
        return (int)(2 * Math.pow(3, (n-2)/3));
    }
}
