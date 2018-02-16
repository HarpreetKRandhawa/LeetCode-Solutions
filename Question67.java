class Solution {
    public String addBinary(String a, String b) {
        
        if(a.length() == 0 || a == null)
            return b;
        else if(b.length() == 0 || b == null)
            return a;
        
        StringBuilder sb = new StringBuilder();
        int i=a.length()-1, j=b.length()-1, carry=0, c1, c2;
        while(i >= 0 || j >= 0){
            if(i >= 0)
                c1 = a.charAt(i--) == '1' ? 1:0;
            else
                c1 = 0;
            if(j >= 0)
                c2 = b.charAt(j--) == '1' ? 1:0;
            else 
                c2 = 0;
            int ans = c1+c2+carry;
            if(ans%2 == 0){
                sb.append('0');
            }
            else{
                sb.append('1');
            }
            carry = ans>=2?1:0;
        }
        if(carry == 1) sb.append('1');
        return sb.reverse().toString();
    }
}
