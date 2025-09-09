class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target)return mid;
            else if(target>nums[right])return right+1;
            else if(target<nums[left])return left;
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return 0;
    }
}