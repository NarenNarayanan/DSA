class Solution {
    public void help(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        help(nums,0,nums.length-1);
        help(nums,0,k-1);
        help(nums,k,nums.length-1);
    }
}
