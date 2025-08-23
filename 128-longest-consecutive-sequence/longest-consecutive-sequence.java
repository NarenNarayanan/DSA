class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        int max=1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]))set.add(nums[i]);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                int count=1,curr=num;
                while(set.contains(curr+1)){
                    count++;
                    curr++;
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
}