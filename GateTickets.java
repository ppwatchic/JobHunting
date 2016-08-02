package Algorithms;

// source: http://www.geeksforgeeks.org/amazon-interview-experience-set-258-for-sde1/ 

public class GateTickets {
	
	public static int minGateTickets(int[] tickets) {
		// corner case 
		if(tickets == null)
			return -1;
		if(tickets.length == 1 && (tickets[0] > 0))
			return 1;
		
		int tkCount = 0;
		int sum = 0;		// sum stands for the maximum distance via the purchased tickets
		while(tickets[tkCount] == 1) {
			sum += tickets[tkCount++];
			if(sum >= tickets.length)
				return tkCount;
		}
		sum += tickets[tkCount++];
		if(sum >= tickets.length)
			return tkCount;
		
		return mini(findPath(tickets, tkCount, tkCount, sum), findPath(tickets, tkCount+1, tkCount, sum));		
	}
	
	private static int findPath(int[] tickets, int pos, int tkCount, int sum) {
		int tmpCount = tickets[pos] + pos; 	// assumed purchased the pos-th ticket, tmpCount stands for the distance can go
		if(tmpCount >= tickets.length) 
			return tkCount + 1;		
		
		if(tmpCount <= sum) {	// means: hopeless to purchase this ticket 
			return findPath(tickets, pos + 1, tkCount, sum);
		} else {
			if(sum == pos) 	// must purchase this ticket, no option
				return findPath(tickets, pos + 1, tkCount + 1, tmpCount);
			else 
				return mini(findPath(tickets, pos + 1, tkCount, sum),findPath(tickets, pos + 1, tkCount + 1, tmpCount));
		}
	}
	
	private static int mini(int v1, int v2) {
		return v1 < v2 ? v1 : v2;
	}	

	public static void main(String[] args) {
		// test case 1: normal 
		int[] tickets = {3,1,1,1,1,1,1,4,4,1,1,1};
		System.out.println("We need at least " + minGateTickets(tickets) + " tickets to pass!" );
		System.out.println("Correct answer is: " + 7);
		System.out.println( );
		
		
	}

}
