class Solution {
    public int dphelp(int n,int [] dp){
        if(n<=2)return n;
        if(dp[n]!=-1)return dp[n];
        dp[n]=dphelp(n-1,dp)+dphelp(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
     int [] arr=new int[n+1];
     Arrays.fill(arr,-1);
     return dphelp(n,arr);   
    }
}