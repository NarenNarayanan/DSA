class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        help(0,nums,ans,new ArrayList<>(),nums.length);
        return ans;
    }
    public void help(int index,int[] nums,List<List<Integer>> ans,List<Integer> list,int n){
        if(index>=n){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        help(index+1,nums,ans,list,n);
        list.remove(list.size()-1);
        help(index+1,nums,ans,list,n);
    }
}