class Solution {
    public int majorityElement(int[] nums) {
        int cand=nums[0],count=0;
        for(int num : nums){
            if(count==0)cand=num;
            if(cand==num)count++;
            else count--;
        }
        return cand;
    }
}