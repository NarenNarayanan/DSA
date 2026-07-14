class Solution {
    public int help(int[] nums,int index,int[] dp){
        if(index>=nums.length)return 0;
        if(dp[index]!=-1)return dp[index];
        int rob=nums[index] + help(nums,index+2,dp);
        int skip=help(nums,index+1,dp);
        return dp[index]=Math.max(rob,skip);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return help(nums,0,dp);
    }
}