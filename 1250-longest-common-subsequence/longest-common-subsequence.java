class Solution {
    public int help(String s1,String s2,int i,int j,int[][] dp){
        if(i==s1.length() || j==s2.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))return dp[i][j]=1+help(s1,s2,i+1,j+1,dp);
            
        return dp[i][j]=Math.max(help(s1,s2,i+1,j,dp),help(s1,s2,i,j+1,dp));
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        int m=s1.length(),n=s2.length();
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(s1.charAt(i)==s2.charAt(j))dp[i][j]=1+dp[i+1][j+1];
                else dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
            }
        }
        return dp[0][0];
    }
}