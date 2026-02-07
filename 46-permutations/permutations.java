class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result =new ArrayList<>();
        boolean[] arr=new boolean[nums.length];
        backtrack(arr,nums,result,new ArrayList<>());
        return result;
    }
    public void backtrack(boolean[] arr,int[] nums,List<List<Integer>> result,List<Integer> list){
        if(list.size()==nums.length){
            result.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!arr[i]){
                arr[i]=true;
                list.add(nums[i]);
                backtrack(arr,nums,result,list);
                list.remove(list.size()-1);
                arr[i]=false;
            }
        }
    }
}