class Solution {
    public void help(int[] nums,List<List<Integer>> ans,int index,List<Integer> list){
        if(index==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        help(nums,ans,index+1,list);
        list.remove(list.size()-1);
        while(index+1<nums.length && nums[index]==nums[index+1])index++;
        help(nums,ans,index+1,list);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        help(nums,ans,0,new ArrayList<>());
        return ans;
    }
}