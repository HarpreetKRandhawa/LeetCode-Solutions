class Solution {
    public String minWindow(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        int[] a = new int[256];
        
        int start=0, minLen=Integer.MAX_VALUE, count=t_arr.length, minStart=0;
        for(char i:t_arr)
            a[i]++;
        for(int end=0; end<s.length(); end++){
            if(a[s_arr[end]] > 0)
                count--;
            a[s_arr[end]]--;
            while(count == 0){
                if(end-start+1 < minLen){
                    minLen = end-start+1;
                    minStart = start;
                }
                a[s_arr[start]]++;
                if(a[s_arr[start]] > 0)
                    count++;
                start++;
            }
        }
        if( minStart+minLen > s_arr.length)
            return "";
        return s.substring(minStart,minStart+minLen);
    }
}
