//Determine whether an integer is a palindrome. Do this without extra space.

public class Solution {
  public boolean isPalindrome(int x) {
    if(x<0){
      return false;
    }
    else{
      int tem = x;
      int y=0;
      while(tem != 0){
        y = y*10 + tem%10;
        tem = tem/10;
      }
      if(y == x){
        return true;
      }
      else{
        return false;
      }
    }
  }
}
