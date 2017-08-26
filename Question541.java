class Solution {
    public String reverseStr(String s, int k) {
        char[] c_array =  s.toCharArray();
        int start = 0, end = s.length();
        while(start < end){
            int right = Math.min(start+k-1,end-1);
            int left= start;
            while(left < right){
                char temp = c_array[left];
                c_array[left++] = c_array[right];
                c_array[right--] = temp;
            }
            start += 2*k;    
        }
        return new String(c_array);
    }
}
