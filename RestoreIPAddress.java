package backTracking;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/restore-ip-addresses/
// https://discuss.leetcode.com/topic/55371/1-ms-java-dfs 
public class RestoreIPAddress {

	private final static int MAX = 255;
	private final static int SEGMENTS = 4;
	
	// https://leetcode.com/problems/restore-ip-addresses/ 
	public List<String> restoreIPAddress(String str) {
		List<String> result = new ArrayList<>();
		char[] restored = new char[str.length() + 4];
		dfs(restored, 0, str.toCharArray(), 0, result);
		return result;
	}
	
	private void dfs(char[] ip, int segNum, char[] raw, int len, List<String> result) {
		if(segNum == SEGMENTS) {
			if(len + segNum == ip.length)
				result.add(new String(ip, 0, ip.length - 1));
			return;
		}
		
		int num = 0;
		for(int i=len; i < (len + 3) && i < raw.length; i++) {
			if(raw[len] == '0' && i != len) {
				break;
			}
			
			ip[i + segNum] = raw[i];
			num = num * 10 + raw[i] - '0';
			if(num > MAX) {
				return;
			}
			ip[i + segNum + 1] = '.';
			dfs(ip, segNum + 1, raw, i + 1, result);
		}
	}
	
	public static void main(String[] args) {
		RestoreIPAddress ria = new RestoreIPAddress();
		String str = "25525511135";
		List<String> result = ria.restoreIPAddress(str);
		for(String s : result) {
			System.out.println(s);
		}
	}

}
