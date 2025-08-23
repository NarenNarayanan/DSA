class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=1,count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i])count++;
            else{count=1;}
            max=Math.max(max,count);
        }
        return max;
    }
}