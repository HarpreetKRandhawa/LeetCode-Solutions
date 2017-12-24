class Solution {
    public String addBinary(String a, String b) {
        if(a.length() == 0)
            return b;
        else if(b.length() == 0)
            return a;
        int maxLen = a.length()>b.length()?a.length():b.length();
        String big = a, small = b;
        StringBuffer res = new StringBuffer();
        if(maxLen != big.length()){
            big = b;
            small = a;
        }
        int sum=0, carry=0;
        int i=big.length()-1,j=small.length()-1;
        while(i>=0 || j>=0){
            sum = carry;
            if(i>=0){
                sum += big.charAt(i)-'0';
                i--;
            }
            if(j >= 0){
                sum += small.charAt(j)-'0';
                j--;
            }
            if(sum > 1){
                carry = 1;
                sum = sum%2;
                res.insert(0,""+sum);
            }
            else{
                carry = 0;
                res.insert(0,sum);
            }
        }
        if(carry == 1)
            res.insert(0,"1");
        return res.toString();
    }
}
