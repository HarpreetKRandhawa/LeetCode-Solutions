public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(set.add(n)){
            int m = n;
            int sum = 0;
            while(m != 0){
                int r = m%10;
                sum += r*r;
                m = m/10;
            }
            n = sum;
            if(n == 1)
                return true;
        }
    return false;
    }
}
