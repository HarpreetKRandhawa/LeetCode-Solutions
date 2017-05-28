public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int max = 0;
        int min = prices[0];
        if(prices == null || prices.length == 0){
            return 0;
        }
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min = prices[i];
            }
            if(prices[i]-min>max){
                max = prices[i]-min;
            }
            
        }
        
        return max;
    }
}
