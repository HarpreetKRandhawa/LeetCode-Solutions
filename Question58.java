//Given a string s consists of upper/lower-case alphabets and empty space characters ' '
//return the length of last word in the string.
//If the last word does not exist, return 0.

public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null)
            return 0;
        String str[] = s.split(" ");
        int n = str.length-1;
        int len = 0;
        if (str.length > 0){
            len = str[n].length();
        }
      return len;
    }
}
