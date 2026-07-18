class Solution {
    public int help(int[] coins,int amount,int index,int[][] dp){
        if(index>=coins.length)return Integer.MAX_VALUE;
        if(amount==0)return 0;
        if(dp[index][amount]!=-1)return dp[index][amount];
        int notTake=help(coins,amount,index+1,dp);
        int take=Integer.MAX_VALUE;
        if(coins[index]<=amount){
            int res=help(coins,amount-coins[index],index,dp);
            if(res!=Integer.MAX_VALUE)take=1+res;
        }
        return dp[index][amount]=Math.min(take,notTake);
    }
    public int coinChange(int[] coins, int amount) {
        int[][]dp=new int[coins.length][amount+1];
        for(int [] arr : dp){
            Arrays.fill(arr,-1);
        }
        int ans=help(coins,amount,0,dp);
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}