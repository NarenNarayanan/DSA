class Solution {
    public int help(int[] nums,int target,int index){
        if(index>nums.length)return 0;
        if(index==nums.length){
            if(target==0)return 1;
            else return 0;
        }
        int pos=help(nums,target-nums[index],index+1);
        int neg=help(nums,target+nums[index],index+1);
        return pos+neg;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return help(nums,target,0);
    }
}