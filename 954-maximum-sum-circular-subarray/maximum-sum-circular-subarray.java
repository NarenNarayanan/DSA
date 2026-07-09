class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxSum=0,total=0,minSum=0;
        for(int num : nums){
            if(maxSum<0)maxSum=0;
            maxSum+=num;
            max=Math.max(maxSum,max);
            if(minSum>0)minSum=0;
            minSum+=num;
            min=Math.min(minSum,min);
            total+=num;
        }
        if(max<0)return max;
        return Math.max(max,total-min);
    }
}