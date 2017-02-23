//Given a roman numeral, convert it to an integer.
//Input is guaranteed to be within the range from 1 to 3999.

public class Solution {
    public int decode(char s){
        if(s=='I')
            return 1;
        if(s=='V')
            return 5;
        if(s=='X')
            return 10;
        if(s=='L')
            return 50;
        if(s=='C')
            return 100;
        if(s=='D')
            return 500;
        if(s=='M')
            return 1000;
        return -1;
        
    }
    public int romanToInt(String s) {
        int res = 0;
        for(int i = 0;i<s.length();i++){
            int n1 = decode(s.charAt(i));
            if(i+1<s.length()){
                int n2 = decode(s.charAt(i+1));
                if(n1>=n2){
                    res += n1;
                }
                else{
                    res = res + n2 - n1;
                    i++;
                    System.out.println(i);
                }
            }
            else{
                res = res+n1;
                i++;
            }
        }
        return res;
    }
}
