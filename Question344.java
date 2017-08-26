class Solution {
    public String reverseString(String s) {
        char[] c_array = s.toCharArray();
        int beg = 0, end = s.length()-1;
        while(beg <= end){
            char c = c_array[beg];
            c_array[beg] = c_array[end];
            c_array[end] = c;
            beg++;
            end--;
        }
        return new String(c_array);
    }
}
