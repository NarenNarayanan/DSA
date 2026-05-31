class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                pivot=i-1;
                break;
            }
        }
        if(pivot!=-1){
            int swapVar=nums.length-1;
            while(nums[swapVar]<=nums[pivot])swapVar--;
            swap(nums,pivot,swapVar);
        }
        reverse(nums,pivot+1,nums.length-1);
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void reverse(int[] nums,int left,int right){
        while(left<right){
            swap(nums,left,right);left++;right--;
        }
    }
}