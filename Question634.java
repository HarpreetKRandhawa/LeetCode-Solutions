class Solution {
    public int findDerangement(int n) {
        long d1=0, d2=1;
        long res = n==1?0:d2;
        for(int i=3; i<=n; i++){
            res = ((i-1)*(d1+d2))%1000000007;
            d1 = d2;
            d2 = res;
        }
        return (int)res;
    }
}
