class Solution {
    public void reverseHelper(char[] str, int start, int end){
        while(start < end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
            
        }
    }
    public void reverseWords(char[] str) {
        reverseHelper(str,0,str.length-1);
        int beg = 0;
        for(int i=0; i<str.length; i++){
            if(str[i] == ' '){
                reverseHelper(str,beg,i-1);
                beg = i+1;
            }
        }
        reverseHelper(str,beg,str.length-1);
    }
}
