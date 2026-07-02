class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        int cnt=0;
        Arrays.fill(ans,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums.length;i=(i+1)%nums.length){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                ans[stack.pop()]=nums[i];
            }
            if(cnt<nums.length){
                stack.push(i);
            }
            cnt++;
            if(cnt==nums.length*2)break;
        }
        return ans;
    }
}