class Solution {
    public int[] rearrangeArray(int[] nums) {
        int x=nums.length;
       int [] pos=new int[x];
       int [] neg=new int[x];
       int m=0,n=0;
       for(int num : nums){
        if(num<0)neg[m++]=num;
        else pos[n++]=num;
       }
       m=0;n=0;
       for(int i=0;i<x;i++){
        if(i%2==0)nums[i]=pos[n++];
        else nums[i]=neg[m++];
       }
       return nums;
    }
}