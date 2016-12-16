/**
 * Source: https://leetcode.com/problems/gas-station/
 * Thought Process: 
 * 1) If total gas is no less than total cost, there must be solution(s). 
 * 2) Find the first station that can supply gas for us to move forward.
 * 3) We move forward if we can have enough gas (supply>=consume); 
 *                      orElse we move the start station backward. 
 * 4) Find the condition that states we complete the journey: reach==destination. 
 **/
public class GasStation {
    // Test cases: gas = [1,2], cost = [2,1]
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0, costSum = 0;
        for(int i = 0; i < gas.length; i++) {
            gasSum += gas[i];
            costSum += cost[i];
        }
        if(costSum > gasSum) return -1;
        
        // Assume start from station 0
        int start = 0;
        int N = gas.length;
        while(gas[start]<cost[start]) {
            start = (start - 1 + N) % N;
        }
        
        int supply = gas[start];
        int consume = cost[start];
        int destination = (start-1+N) % N;
        int reach = start;
        // Let's drive now 
        while(reach != destination) {
            if(consume <= supply) {
                // We can move one station ahead 
                reach = (reach+1+N)%N;
                if(reach == destination) {
                    return start;
                }
                supply += gas[reach];
                consume += cost[reach];
                
            } else {
                // start station moves backward 
                start = (start - 1 + N) % N;
                supply += gas[start];
                consume += cost[start];
            }
        }
        return start;   
    }
}
