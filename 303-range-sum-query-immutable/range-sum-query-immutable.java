class NumArray {
    int[] sum;
    public NumArray(int[] nums) {
        sum=new int[nums.length];
        int add=0;
        for(int i=0;i<nums.length;i++){
            add+=nums[i];
            sum[i]=add;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0)return sum[right];
        return sum[right]-sum[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */