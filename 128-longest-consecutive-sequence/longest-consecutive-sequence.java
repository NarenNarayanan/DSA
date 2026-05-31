class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        int curr=1,max=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int temp=nums[i+1]-nums[i];
            if(temp==1)curr++;
            else if(temp==0){
                continue;
            }
            else{
                max=Math.max(max,curr);
                curr=1;
            }
        }
        max=Math.max(max,curr);
        return max;
    }
}