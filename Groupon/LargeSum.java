class LargeSum {
  
  /**
   * Assume input data may be 10,000 digits 
   */  
  public String sum(String oop1, String oop2) {
    // Legal or not 
    boolean lg1 = isLegalDigit(oop1);
    boolean lg2 = isLegalDigit(oop2);
    
    // Sign consideration 
    int sig1 = (oop1.subString(0) == "-") ? -1 : 1;
    int sig2 = (oop2.substring(0) == "-") ? -1 : 1; 
    
    // Reshape input: "+100" -> "100"; "-100" -> "100"
    String op1 = null;
    String op2 = null;
    if(oop1.substring(0,1) == "+" || oop1.substring(0,1) == "-") 
      op1 = oop1.substring(1);
    else op1 = oop1;
    if(oop2.substring(0,1) == "+" || oop1.substring(0,1) == "-")
      op2 = oop2.substring(1);
    else op2 = oop2;   
    
    int len1 = op1.length();
    int len2 = op2.length();
    int len = (len1 < len2) ? len1 : len2;
    
    int carry = 0;
    StringBuilder res = new StringBuilder();
    for(int i = 0; i < len; i++) {
      String c1 = op1.substring(len - 1 - i, len - i);
      String c2 = op2.substring(len - 1 - i, len - i);
      
      int tmp = Integer.valueOf(c1) * sig1 + Integer.valueOf(c2) * sig2 + carry;
      
      // Generate carry and tmp
      if(sig1 == sig2) {
        carry = (Math.abs(tmp) > 9) ? sig1 : 0;
        tmp = (Math.abs(tmp) > 9) ? (tmp - 10) : tmp;
      } else {
        if(tmp < 0) {
          carry = -1;
          tmp = 10 + tmp;
        } else {
          carry = 0;
        }   
      }
      
      res.insert(0,String.valueOf(tmp));
    }
    
    String leftOver = null;
    if(len1 > len2) {
      leftOver = op1.substring(0, len1 - len2);
    } else if(len1 < len2) {
      leftOver = op2.substring(0, len2 - len1);
    }
    
    // Generate final result
    if(leftOver == null) {
      return getResultFrom(res, carry, sig1, sig2);
    } else { 
      return getResultFrom(res, leftOver, carry, sig1, sig2);
    }
    
  }
}
