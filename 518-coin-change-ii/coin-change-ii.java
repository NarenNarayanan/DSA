class Solution {
    public int help(int[] coins,int amount,int index,int[][] dp){
        if(index>=coins.length)return 0;
        if(amount==0)return 1;
        if(dp[index][amount]!=-1)return dp[index][amount];
        int notTake=help(coins,amount,index+1,dp);
        int take=0;
        if(coins[index]<=amount){
            take=help(coins,amount-coins[index],index,dp);
        }
        return dp[index][amount]=take+notTake;
    }
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        return help(coins,amount,0,dp);
    }
}