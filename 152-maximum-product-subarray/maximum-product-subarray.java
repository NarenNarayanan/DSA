class Solution {
    public int maxProduct(int[] nums) {
        int currMax=nums[0],currMin=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            if(num<0){
                int temp=currMax;
                currMax=currMin;
                currMin=temp;
            }
            currMax=Math.max(num,num*currMax);
            currMin=Math.min(num,num*currMin);
            max=Math.max(max,currMax);
        }
        return max;
    }
}