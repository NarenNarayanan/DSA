class Solution {
    public void help(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;right--;
        }
    }
    public void rotate(int[] nums, int k) {
      int n=nums.length;
      k=k%n;
      help(nums,0,n-1);
      help(nums,0,k-1);
      help(nums,k,n-1);
    }
}
