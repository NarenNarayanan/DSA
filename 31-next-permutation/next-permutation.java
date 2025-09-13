class Solution {
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void nextPermutation(int[] nums) {
       int i=nums.length-2;
       while(i>=0 && nums[i]>=nums[i+1])i--;
       int j=nums.length-1;
       if(i>=0){
        while(j>=0 && nums[i]>=nums[j])j--;
        swap(nums,i,j);
       }
       reverse(nums,i+1);
    }
    public void reverse(int[] nums,int left){
        int right=nums.length-1;
        while(left<right){
            swap(nums,left,right);
            left++;right--;
        }
    }
}