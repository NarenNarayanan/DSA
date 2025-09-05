class Solution {
    public void help(int[] nums,boolean[] arr,List<List<Integer>> result,List<Integer> ds){
        if(ds.size()==nums.length){
            result.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!arr[i]){
                arr[i]=true;
                ds.add(nums[i]);
                help(nums,arr,result,ds);
                ds.remove(ds.size()-1);
                arr[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] arr=new boolean[nums.length];
        List<List<Integer>> result=new ArrayList<>();
        help(nums,arr,result,new ArrayList<>());
        return result;
    }
}