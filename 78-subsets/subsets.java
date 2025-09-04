class Solution {
    public void help(int[] nums,List<List<Integer>> result,int index,int size,List<Integer> curr){
        if(index>size){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        help(nums,result,index+1,size,curr);
        curr.remove(curr.size()-1);
        help(nums,result,index+1,size,curr);
    }
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> result=new ArrayList<>();
       List<Integer> curr=new ArrayList<>();
       help(nums,result,0,nums.length-1,curr);
       return result;
    }
}