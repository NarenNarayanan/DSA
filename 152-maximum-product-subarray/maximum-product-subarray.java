class Solution {
    public int maxProduct(int[] nums) {
        int currMax=nums[0],currMin=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=currMax;
                currMax=currMin;
                currMin=temp;
            }
            currMax=Math.max(nums[i],currMax*nums[i]);
            currMin=Math.min(nums[i],currMin*nums[i]);
            max=Math.max(max,currMax);
        }
        return max;
    }
}