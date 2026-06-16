class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
    }
    public int atMost(int[] nums,int k){
        HashMap<Integer, Integer> freq = new HashMap<>();
        int max=0,left=0,count=0;
        for(int right=0;right<nums.length;right++){
            freq.put(nums[right],freq.getOrDefault(nums[right],0)+1);
            if(freq.get(nums[right])==1){
                k--;
            }
            while(k<0){
                freq.put(nums[left],freq.get(nums[left])-1);
                if(freq.get(nums[left])==0){
                    freq.remove(nums[left]);
                    //very very important line below
                    k++;
                }
                left++;
            }
            count=count+right-left+1;
        }
        return count;
    }
}