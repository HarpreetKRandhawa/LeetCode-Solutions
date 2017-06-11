public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] res = new int[amount+1];
        int min;
        res[0] = 0;
        for(int i=1; i<=amount; i++){
            min = Integer.MAX_VALUE;
            for(int j=0; j<coins.length; j++){
                if(i >= coins[j])
                    min = Math.min(min,res[i-coins[j]]);
            }
            if(min != Integer.MAX_VALUE)
                res[i] = min + 1;
            else
                res[i] = Integer.MAX_VALUE;
        }
        if(res[amount] >= Integer.MAX_VALUE)
            return -1;
        return res[amount];
    }
}
