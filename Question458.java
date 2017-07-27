public class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int test = minutesToTest / minutesToDie + 1;
        int pigs = 0;
        while(Math.pow(test,pigs) < buckets)
            pigs++;
        return pigs;
    }
}
