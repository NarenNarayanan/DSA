class Solution {
    public int rec(int[] nums,int index,int currSum,int target){
        if(index==nums.length){
            if(currSum==target)return 1;
            else return 0;
        }
        int plus=rec(nums,index+1,currSum+nums[index],target);
        int neg=rec(nums,index+1,currSum-nums[index],target);
        return plus+neg;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return rec(nums,0,0,target);
    }
}