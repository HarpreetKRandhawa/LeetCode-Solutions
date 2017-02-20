//Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
//Note:
//1.The length of both num1 and num2 is < 5100.
//2.Both num1 and num2 contains only digits 0-9.
//3.Both num1 and num2 does not contain any leading zero.
//4.You must not use any built-in BigInteger library or convert the inputs to integer directly.

public class Solution {
    public String addStrings(String num1, String num2) {
    
    String n1 = new StringBuilder(num1).reverse().toString();
    String n2 = new StringBuilder(num2).reverse().toString();
    int maxlen = Math.max(n1.length(),n2.length());
    int[] d = new int[maxlen+1];
    StringBuilder sb = new StringBuilder();
    
    for(int i =0;i<n1.length();i++){
        d[i] += (n1.charAt(i)-'0');
    }
    
    for(int i =0;i<n2.length();i++){
        d[i] += (n2.charAt(i)-'0');
    }
    
    for(int i=0;i<d.length;i++){
        
        int mod = d[i]%10;
        int carry = d[i]/10;
        if(i+1<d.length){
            d[i+1] += carry;
        }
        sb.insert(0,mod);
    }
     while(sb.charAt(0) == '0' && sb.length()>1){
            sb.deleteCharAt(0);
    }
    return sb.toString();
    }
}
