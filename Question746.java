class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 0 || cost == null)
            return 0;
        int[] dp = new int[cost.length+1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for(int i=2; i<=cost.length; i++){
            int costV = (i==cost.length)?0:cost[i];
            dp[i] = Math.min(dp[i-2]+costV, dp[i-1]+costV);
            
        }
        return dp[cost.length];
    }
}
