class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max=0,sum=0;
        int left=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int right=0;right<nums.length;right++){
            
            sum+=nums[right];
            freq.put(nums[right],freq.getOrDefault(nums[right],0)+1);

            if(right-left+1 > k){
                freq.put(nums[left],freq.getOrDefault(nums[left],0)-1);
                if(freq.get(nums[left])==0)freq.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            if(right-left+1==k && freq.size()==k){
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}