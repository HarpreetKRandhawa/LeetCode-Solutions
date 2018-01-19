class Solution {
    public int titleToNumber(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int num = (int)(s.charAt(0) - 'A')+1;
        for(int i=1; i<s.length(); i++){
            num = (num*26)+((int)(s.charAt(i) - 'A')+1);
        }
        return num;
    }
}
