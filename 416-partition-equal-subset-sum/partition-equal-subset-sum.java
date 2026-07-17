class Solution {
    public boolean help(int[] nums,int index,int target,Boolean[][] dp){
        if(index<0)return false;
        if(target==0)return true;
        if(index==0 && nums[index]==target)return true;
        if(dp[index][target]!=null)return dp[index][target];
        boolean notTake=help(nums,index-1,target,dp);
        boolean take=false;
        if(nums[index]<=target)take=help(nums,index-1,target-nums[index],dp);
        dp[index][target] = take || notTake;
        return dp[index][target];
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num : nums)sum+=num;
        if(sum%2!=0)return false;
        Boolean[][] dp=new Boolean[nums.length][sum/2 + 1];
        return help(nums,nums.length-1,sum/2,dp);
    }
}