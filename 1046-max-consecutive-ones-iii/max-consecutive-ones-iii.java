class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0,left=0,count=0;
        int freq=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==1)freq++;
            count=Math.max(count,freq);
            while((right-left+1)-count > k){
                if(nums[left]==1)freq--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}