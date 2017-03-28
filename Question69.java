//mplement int sqrt(int x).
//Compute and return the square root of x.

public class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long end = x / 2 + 1;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (mid * mid == x)
                return (int)mid;
            if (mid * mid < x)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return (int)end;
    }
}
