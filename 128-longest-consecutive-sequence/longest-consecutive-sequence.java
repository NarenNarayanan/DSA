class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        HashSet<Integer> set=new HashSet<>();
        int currLength=1,max=1;
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                int currNum=num;
                currLength=1;
                while(set.contains(currNum+1)){
                    currNum++;currLength++;
                }
                max=Math.max(max,currLength);
            }
        }
        return max;
    }
}