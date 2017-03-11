//Given a positive integer num, write a function which returns True if num is a perfect square else False.
public class Solution {
    public boolean isPerfectSquare(int num) {
        int unit = num%10;
        if(unit == 2 || unit == 3 || unit == 7 || unit ==8){
            return false;
        }
        int sum = 0;
        if(num==1)
            return true;
        for(int i=1;i<=num;i=i+2){
            sum += i;
            if(sum==num)
                return true;
        }
        return false;
        
    }
}
