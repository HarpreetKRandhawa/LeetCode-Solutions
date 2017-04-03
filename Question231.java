//Given an integer, write a function to determine if it is a power of two.

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        int n1,n2;
        while(n>2){
            n1 = n>>1;
            n2 = n1<<1;
            if(n-n2 != 0){
                return false;
            }
            n = n>>1;
        }
    return true;
    }
}
