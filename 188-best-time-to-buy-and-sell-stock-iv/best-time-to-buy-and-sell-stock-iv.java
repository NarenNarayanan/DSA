class Solution {
    public int help(int[] prices,int index,int buy,int trans,int[][][] dp){
        if(index==prices.length)return 0;
        if(trans<=0)return 0;
        if(dp[index][buy][trans]!=-1)return dp[index][buy][trans];
        if(buy==0){
            int skip=help(prices,index+1,buy,trans,dp);
            int take=-prices[index]+help(prices,index+1,1,trans,dp);
            return dp[index][buy][trans]=Math.max(skip,take);
        }
        else{
            int skip=help(prices,index+1,buy,trans,dp);
            int take=prices[index]+help(prices,index+1,0,trans-1,dp);
            return dp[index][buy][trans]=Math.max(skip,take);
        }
    }
    public int stock2(int[] prices){
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    public int maxProfit(int k, int[] prices) {
        if(k>=prices.length/2)return stock2(prices);
        int[][][] dp=new int[prices.length][2][k+1];
        for(int[][] arr : dp){
            for(int [] ar : arr){
                Arrays.fill(ar,-1);
            }
        }
        return help(prices,0,0,k,dp);
    }
}