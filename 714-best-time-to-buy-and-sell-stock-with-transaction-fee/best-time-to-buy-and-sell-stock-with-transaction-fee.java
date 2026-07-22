class Solution {
    public int help(int[] prices,int fee,int index,int buy,int[][] dp){
        if(index==prices.length)return 0;
        if(dp[index][buy]!=-1)return dp[index][buy];
        if(buy==0){
            int skip=help(prices,fee,index+1,buy,dp);
            int take=-prices[index]+help(prices,fee,index+1,1,dp);
            return dp[index][buy]=Math.max(skip,take);
        }
        else{
            int skip=help(prices,fee,index+1,buy,dp);
            int take=prices[index]-fee+help(prices,fee,index+1,0,dp);
            return dp[index][buy]=Math.max(skip,take);
        }
    }
    public int maxProfit(int[] prices, int fee) {
        int[][] dp=new int[prices.length][2];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        return help(prices,fee,0,0,dp);
    }
}