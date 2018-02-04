class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 1)
            return false;
        int sum = 0, end = num;
        for(int i=1; i<end; i++){
            if(num%i == 0){
                sum += i;
                end = num/i;
                sum += end;
            }        
        }
        sum = sum-num;
        return sum==num;
    }
}
