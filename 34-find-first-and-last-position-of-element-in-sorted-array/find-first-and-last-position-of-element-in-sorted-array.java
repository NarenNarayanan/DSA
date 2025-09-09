class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int[] arr={-1,-1};
        int l=search(nums,target,true);
        int r=search(nums,target,false);
        arr[0]=l;
        arr[1]=r;
        return arr;
    }
    public int search(int[] nums,int target, boolean isSearchingLeft){
        int left=0,right=nums.length-1;
        int idx=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(target<nums[mid]){
                right=mid-1;
            }
            else if(target>nums[mid]){
                left=mid+1;
            }
            else{
                idx=mid;
                if(isSearchingLeft){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return idx;
    }
}