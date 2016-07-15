public class Solution {
        
        // a_i  b_i     res_i  
        //   0   0      0 ->0
        
        //   0   0      1 ->1
        //   0   1      0 ->1
        //   1   0      0 ->1
        
        //   0   1      1 ->0        
        //   1   0      1 ->0
        //   1   1      0 ->0 
        
        //   1   1      1 ->1 
        
        
        public static int add(int a, int b) {
            int res = 0;
            int oneCount = 0;            
            for(int i = 0; i < 31; i++) {
                if((a&(1<<i)) != 0 )
                    oneCount++;
                if((b&(1<<i)) != 0 )
                    oneCount++;
                if((res&(1<<i)) != 0 )
                    oneCount++;
                
                switch(oneCount) {                    
                    case 1:                 // no carry bit
                        res |= (1<<i);
                        break;
                    case 2: 
                        res &= ~(1<<i); 
                        res |= (1<<(i+1));
                        break;
                    case 3: 
                        res |= (1<<(i+1));
                        break;
                    default: 
                        break;
                }
                oneCount = 0;
            }
            return res;
        }

        public static void main(String[] args) {

            int a = 33, b = 5;
            System.out.println("sum is: " + add(a,b));
        }
    }
