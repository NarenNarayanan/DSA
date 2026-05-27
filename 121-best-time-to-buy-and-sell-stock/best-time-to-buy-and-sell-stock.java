class Solution {
    public int maxProfit(int[] prices) {
        int sell=prices[0],buy=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            sell=prices[i];
            profit=Math.max(profit,sell-buy);
        }
        return profit;
    }
}