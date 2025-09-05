class Solution {
    public void help(int[] nums,List<List<Integer>> result,boolean[] arr,List<Integer> ds){
        if(ds.size()==nums.length){
            result.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i])continue;
            if(i>0 && nums[i]==nums[i-1] && !arr[i-1])continue;
            arr[i]=true;
            ds.add(nums[i]);
            help(nums,result,arr,ds);
            ds.remove(ds.size()-1);
            arr[i]=false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        boolean[] arr=new boolean[nums.length];
        help(nums,result,arr,new ArrayList<>());
        return result;
    }
}