class Solution {
    public boolean check(int[] nums) {
        int dec=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                dec++;
            }
            if(dec>1)return false;
        }
        return true;
    }
}