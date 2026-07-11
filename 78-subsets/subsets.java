class Solution {
    public void help(List<List<Integer>> ans,List<Integer> list,int[] nums,int index){
        if(index>=nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        help(ans,list,nums,index+1);
        list.remove(list.size()-1);
        help(ans,list,nums,index+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        help(ans,new ArrayList<>(),nums,0);
        return ans;
    }
}