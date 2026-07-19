class Solution {
    public int help(int[] prices,int index,int buy,int[][] dp){
        if(index>=prices.length)return 0;
        if(dp[index][buy]!=-1)return dp[index][buy];
        if(buy==0){
            int skip=help(prices,index+1,buy,dp);
            int take=-prices[index]+help(prices,index+1,1,dp);
            return dp[index][buy]=Math.max(skip,take);
        }
        else{
            int skip=help(prices,index+1,1,dp);
            int take=prices[index]+help(prices,index+1,0,dp);
            return dp[index][buy]=Math.max(skip,take);
        }
    }
    public int maxProfit(int[] prices) {
        int[][] dp=new int[prices.length+1][2];
        for(int index=prices.length-1;index>=0;index--){
            for(int buy=0;buy<2;buy++){
                if(buy==0){
                    int skip=dp[index+1][buy];
                    int take=-prices[index]+dp[index+1][1];
                    dp[index][buy]=Math.max(skip,take);
                }
                else{
                    int skip=dp[index+1][buy];
                    int take=prices[index]+dp[index+1][0];
                    dp[index][buy]=Math.max(skip,take);
                }
            }
        }
        return dp[0][0];
    }
}