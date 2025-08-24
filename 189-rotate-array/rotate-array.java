class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k==n)return;
        k=k%n;
        int m=0;
        int [] help=new int[n];
        for(int i=n-k;i<n;i++){
            help[m++]=nums[i];
        }
        for(int i=0;i<n-k;i++){
            help[m++]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=help[i];
        }
    }
}
