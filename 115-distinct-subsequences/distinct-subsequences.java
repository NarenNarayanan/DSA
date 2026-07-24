class Solution {
    public int help(String s,String t,int i,int j,int[][] dp){
        if(j==t.length())return 1;
        if(i==s.length())return 0;
        if(s.charAt(i)==t.charAt(j))return dp[i][j]=help(s,t,i+1,j+1,dp)+help(s,t,i+1,j,dp);
        return dp[i][j]=help(s,t,i+1,j,dp);
    }
    public int numDistinct(String s, String t) {
        int[][] dp=new int[s.length()+1][t.length()+1];
        int m=s.length(),n=t.length();
        for(int i=m;i>=0;i--){
            dp[i][n]=1;
        }
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(s.charAt(i)==t.charAt(j)){
                    dp[i][j]=dp[i+1][j+1] + dp[i+1][j];
                }
                else{
                    dp[i][j]=dp[i+1][j];
                }
            }
        }
        return dp[0][0];
    }
}