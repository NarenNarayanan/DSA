class Solution {
     public void help(int[] candidates,int target,int sum,int index,List<List<Integer>> ans,List<Integer> list){
        if(sum>target)return;
        if(index==candidates.length){
            if(sum==target){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(candidates[index]);
        help(candidates,target,sum+candidates[index],index+1,ans,list);
        list.remove(list.size()-1);
        while(index + 1 < candidates.length && candidates[index] == candidates[index + 1]) {
            index++;
        }
        help(candidates,target,sum,index+1,ans,list);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        help(candidates,target,0,0,ans,new ArrayList<>());
        return ans;
    }
}