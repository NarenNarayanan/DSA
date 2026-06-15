class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0,sum=0;
        double avg=0,max=Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++){
            sum=sum+nums[right];
            if(right-left+1 > k){
                sum=sum-nums[left];
                left++;
            }
            if(right-left+1 == k){
                max=Math.max(max,sum);
            }
        }
        return (double)max/k;
    }
}