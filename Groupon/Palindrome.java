public class Palindrome { 
 // Constraints: no extra buffer
  public boolean isPalindrome(String str) {
    if(str==null || str.length()==0 || str.length()==1)
      return true;
    int len = str.length();
    int begin = 0;
    int end = len - 1;
    
    while(begin<end) {
      if(str.charAt(begin++)==str.charAt(end--)) continue;      
      else return false;
    }
    return true;    
  }
}
