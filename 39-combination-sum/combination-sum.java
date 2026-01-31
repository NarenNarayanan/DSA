class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        help(0,candidates,target,candidates.length,ans,new ArrayList<>());
        return ans;
    }
    public void help(int index,int[] candidates,int target,int n,List<List<Integer>> ans,List<Integer> list){
        if(index == n){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[index]<=target){
            list.add(candidates[index]);
            help(index,candidates,target-candidates[index],n,ans,list);
            list.remove(list.size()-1);
        }
        help(index+1,candidates,target,n,ans,list);
    }
}