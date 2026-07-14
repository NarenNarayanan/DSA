class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+2];
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            int rob=nums[i]+dp[i+2];
            int skip=dp[i+1];
            dp[i]=Math.max(rob,skip);
        }
        return dp[0];
    }
}