class Solution {
    public void help(int[] nums,List<List<Integer>> ans,int cnt,int target,int index,int sum,List<Integer> list){
        if(sum>target)return;
        if(index==nums.length){
            if(sum==target && list.size()==cnt){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(list.size() > cnt)return;
        list.add(nums[index]);
        help(nums,ans,cnt,target,index+1,sum+nums[index],list);
        list.remove(list.size()-1);
        help(nums,ans,cnt,target,index+1,sum,list);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans=new ArrayList<>();
        help(nums,ans,k,n,0,0,new ArrayList<>());
        return ans;
    }
}