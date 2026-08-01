class Solution {
    public int help(int[] nums,int left,int right){
        if(left==right)return nums[left];
        int pickleft=nums[left] - help(nums,left+1,right);
        int pickright=nums[right] - help(nums,left,right-1);
        return Math.max(pickleft,pickright);
    }
    public boolean predictTheWinner(int[] nums) {
        return help(nums,0,nums.length-1) >=0 ;
    }
}