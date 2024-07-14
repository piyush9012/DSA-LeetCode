class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int mini = prices[0];
        for(int i = 0; i < prices.length; i++){
            int cost = prices[i] - mini;
            maxPro = Math.max(maxPro, cost);
            mini = Math.min(mini, prices[i]);
        }
        return maxPro;
    }
}