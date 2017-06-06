public class Solution {
    public boolean isAnagram(String s, String t) {
        int size = 128;
        int[] count = new int[size];
        if(s.length() != t.length())
            return false;
        for(char s1:s.toCharArray()){
            count[s1]++;
        }
        for(char t1:t.toCharArray()){
            count[t1]--;
            if(count[t1]<0){
                return false;
            }
        }
        return true;
    }
}
