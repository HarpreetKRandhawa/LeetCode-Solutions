//Given a string, find the length of the longest substring without repeating characters.

//Examples:

//Given "abcabcbb", the answer is "abc", which the length is 3.

//Given "bbbbb", the answer is "b", with the length of 1.
public class Solution {
  public int lengthOfLongestSubstring(String s) {
    int max = 0, start = 0, i = 0;
    HashSet<Character> set = new HashSet<Character>();
    while(i<s.length()){
      char e = s.charAt(i);
      if(!set.contains(e)){
        set.add(e);
      }
    else{
      max = Math.max(max,set.size());
      while(start<i && s.charAt(start)!=e){
        set.remove(s.charAt(start));
        start++;
      }
      start++;
    } 
    i++;
  }
  return Math.max(max,set.size());
  }
}
